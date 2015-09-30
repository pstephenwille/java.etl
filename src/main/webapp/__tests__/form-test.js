/* test: form.jsx */

jest.dontMock('../scripts/form.jsx');
jest.mock('jquery');


describe('Form', function () {
    var form;
    var Form = require('../scripts/form.jsx');
    var React = require('react/addons');
    var TestUtils = React.addons.TestUtils;

    beforeEach(function () {
        form = TestUtils.renderIntoDocument(<Form/>);
    });


    describe('the forms initial state', function () {
        it('has correct state properties', function () {
            var initState = form.state;

            expect(initState.id).toEqual('default id');
            expect(initState.lat).toEqual(0);
            expect(initState.lon).toEqual(0);
            expect(initState.medianListPricePersquareFoot).toEqual('default price per square foot');
            expect(initState.medianSinglyFamilyHome).toEqual('default family home');
            expect(initState.regionID).toEqual('default regaion id');
            expect(initState.temp_f).toEqual('default temp');
            expect(initState.weatherConditions).toEqual('default conditions');
            expect(initState.weatherIcon).toEqual('default icon');
            expect(initState.weatherIconUrl).toEqual('default icon url');
            expect(initState.zip).toEqual(0);
        });
    });


    describe('form elements', function () {
        it("builds the correct element", function () {
            var listItems = React.findDOMNode(form).getElementsByTagName('li');

            expect(listItems[0].textContent).toEqual('zip:0');
            /* more li elements */
            expect(listItems[7].innerHTML).toContain('src="default icon url"');
        });
    });

});