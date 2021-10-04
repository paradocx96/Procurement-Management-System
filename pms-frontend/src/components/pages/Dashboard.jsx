import React, {Component} from 'react';
import {Container} from "react-bootstrap";

import NavigationAdmin from "../layouts/Navigation/NavigationAdmin";
import {Link} from "react-router-dom";

class Dashboard extends Component {

    render() {
        return (
            <div>
                <NavigationAdmin/>
                <Container>
                    <h1>Dashboard</h1>
                    <Link to={'/inventory/main'}>Inventory</Link>
                </Container>
            </div>
        );
    }
}

export default Dashboard;