import React, {Component} from 'react';
import {Container} from "react-bootstrap";

import NavigationAdmin from "../layouts/Navigation/NavigationAdmin";

class Dashboard extends Component {

    render() {
        return (
            <div>
                <NavigationAdmin/>
                <Container>
                    <h1>Dashboard</h1>
                </Container>
            </div>
        );
    }
}

export default Dashboard;