import React, {Component} from 'react';
import {Container} from "react-bootstrap";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";

class AddOrder extends Component {

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <Container>
                <h2>PURCHASE ORDER</h2>

                </Container>
            </div>
        );
    }
}

export default AddOrder;