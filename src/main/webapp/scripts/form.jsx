var React = require('react');
var $ = require('jquery');

var Form = React.createClass({

    getInitialState: function () {
        return {
            id: 'default id',
            lat: 0,
            lon: 0,
            medianListPricePersquareFoot: 'default price per square foot',
            medianSinglyFamilyHome: 'default family home',
            regionID: 'default regaion id',
            temp_f: 'default temp',
            weatherConditions: 'default conditions',
            weatherIcon: 'default icon',
            weatherIconUrl: 'default icon url',
            zip: 0
        }
    },

    getDataByZip: function () {
        var self = this;
        var zip = self.state.zip;

        $.get('http://localhost:8080/api/location?zip=' + zip, function (data) {
           console.log('get');
            self.setState({
                id: (data.id || 'no data'),
                lat: (data.lat || 'no data'),
                lon: (data.lon || 'no data'),
                medianListPricePersquareFoot: (data.medianListPricePersquareFoot || 'no data'),
                medianSinglyFamilyHome: (data.medianSinglyFamilyHome || 'no data'),
                regionID: (data.regionID || 'no data'),
                temp_f: (data.temp_f || 'no data'),
                weatherConditions: (data.weatherConditions || 'no data'),
                weatherIcon: (data.weatherIcon || 'no data'),
                weatherIconUrl: (data.weatherIconUrl || 'no data'),
                zip: (data.zip || 'no data')
            });
        });
    },

    handleInputChange: function (e) {
        this.setState({zip: e.target.value});
    },
    render: function () {
        return (
            <div>
                <div>
                    Enter a zip code: <input ref="userInputZip" type="text" maxLength="5" placeholder="zip code"
                                             onBlur={this.handleInputChange}/>
                </div>

                <button onClick={this.getDataByZip}>Get Data</button>
                    <ul>
                        <li>zip:{this.state.zip}</li>
                        <li>Lattitude: {this.state.lat}</li>
                        <li>Longitude: {this.state.lon}</li>
                        <li>Median price per sq. ft: {this.state.medianListPricePersquareFoot}</li>
                        <li>Median single family home: {this.state.medianSinglyFamilyHome}</li>
                        <li>Temp: {this.state.temp_f}</li>
                        <li>Weather: {this.state.weatherConditions}</li>
                        <li><img src={this.state.weatherIconUrl} alt={this.state.weatherIcon}/></li>
                    </ul>
            </div>
        );
    }

});


module.exports = Form;