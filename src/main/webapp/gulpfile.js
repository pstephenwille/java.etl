'use strict';


var assign = require('lodash.assign');
var babelify = require("babelify");
var browserify = require('browserify');
var buffer = require('vinyl-buffer');
var fs = require("fs");
var gulp = require('gulp');
var gutil = require('gulp-util');
var source = require('vinyl-source-stream');
var sourcemaps = require('gulp-sourcemaps');
var watchify = require('watchify');
var glob = require('glob');


var customOpts = {
  entries:glob.sync('./scripts/**/*.jsx'),
  debug:true
};


var opts = assign({}, watchify.ags, customOpts);
var b = watchify(browserify(opts));


// add transformations here
// i.e. b.transform(coffeeify);
b.transform(babelify);


gulp.task('dev', bundle); // so you can run `gulp js` to build the file
b.on('update', bundle); // on any dep update, runs the bundler
b.on('log', gutil.log); // output build logs to terminal

function bundle() {
  return b.bundle()
    // log errors if they happen
      .on('error', gutil.log.bind(gutil, 'Browserify Error'))
      .pipe(source('bundle.js'))
    // optional, remove if you don't need to buffer file contents
      .pipe(buffer())
    // optional, remove if you dont want sourcemaps
      .pipe(sourcemaps.init({loadMaps: true})) // loads map from browserify file
    // Add transformation tasks to the pipeline here.
      .pipe(sourcemaps.write('./')) // writes .map file
      .pipe(gulp.dest('./dist'));
}


