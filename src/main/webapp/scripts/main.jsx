var React = require('react');


var Home = React.createClass({
  render: function () {
    return (
        <h1>Demo App</h1>
    );
  }
});

React.render(<Home/>, document.getElementById('demo'));

