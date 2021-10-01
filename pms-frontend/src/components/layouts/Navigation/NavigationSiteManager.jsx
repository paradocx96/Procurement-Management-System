import React, {Component} from 'react';
import {Container, Nav, Navbar, NavDropdown} from "react-bootstrap";

import 'bootstrap/dist/css/bootstrap.min.css';
import {Link} from "react-router-dom";

class NavigationSiteManager extends Component {

    backColor = {
        backgroundColor: '#283593',
        color: 'white'
    }

    render() {
        return (
            <div>
                <Navbar collapseOnSelect expand="lg" style={this.backColor} variant="dark">
                    <Container>
                        <Navbar.Brand href="/dashboard/site">Dashboard</Navbar.Brand>
                        <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
                        <Navbar.Collapse id="responsive-navbar-nav">

                            <Nav className="me-auto">
                                <NavDropdown title="Order" id="collasible-nav-dropdown">
                                    <Link to={'/order/list'} className={'dropdown-item'}>Orders</Link>
                                    <Link to={'/order/addOrder'} className={'dropdown-item'}>Add Order</Link>
                                </NavDropdown>
                            </Nav>
                        </Navbar.Collapse>
                    </Container>
                </Navbar>
            </div>
        );
    }
}

export default NavigationSiteManager;