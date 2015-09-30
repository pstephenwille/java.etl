var React = require('react');
var $ = require('jquery');
var Form = require('./form.jsx');

var Home = React.createClass({
    render: function () {
        return (
            <div>
                <h1>Demo App</h1>
                <Form />
            </div>
        );
    }
});

React.render(<Home/>, document.getElementById('demo'));

