import React, {Component} from 'react';
import {Container, Nav, Navbar, NavDropdown} from "react-bootstrap";
import {Link} from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';

class NavigationSupplier extends Component {

    backColor = {
        backgroundColor: '#283593',
        color: 'white'
    }

    render() {
        return (
            <div>
                <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
                    <Container>
                        <Navbar.Brand href="/dashboard/admin">Dashboard</Navbar.Brand>
                        <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
                        <Navbar.Collapse id="responsive-navbar-nav">
                            <Nav className="me-auto">
                                <NavDropdown title="View Items" id="collasible-nav-dropdown">
                                    <Link to={'/view-items'} className={'dropdown-item'}>Item List</Link>
                                </NavDropdown>
                                <NavDropdown title="Add items" id="collasible-nav-dropdown">
                                    <Link to={'/add-items'} className={'dropdown-item'}>Add Item</Link>
                                </NavDropdown>
                            </Nav>
                        </Navbar.Collapse>
                    </Container>
                </Navbar>
            </div>
        );
    }
}

export default NavigationSupplier;