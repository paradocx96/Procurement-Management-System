import React, {Component} from 'react';
import {Container, Nav, Navbar, NavDropdown} from "react-bootstrap";
import {Link} from "react-router-dom";
import "react-icons/bs";
import 'bootstrap/dist/css/bootstrap.min.css';

import mainLogo from './../../../assets/images/Header/logo.svg';


class HeaderBar extends Component {

    backColor = {
        backgroundColor: '#4CAF50',
        color: 'white'
    }

    constructor(props) {
        super(props);
        this.state = {}
    }

    componentDidMount() {
        console.log('Header Loaded');
    }

    render() {
        return (
            <div>
                <Navbar collapseOnSelect expand="lg" style={this.backColor} variant="dark">
                    <Container>
                        <Navbar.Brand>
                            <img
                                src={mainLogo}
                                height="50"
                                className="d-inline-block align-top"
                                alt="React Bootstrap logo"
                            />
                        </Navbar.Brand>
                        <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
                        <Navbar.Collapse id="responsive-navbar-nav">
                            <Nav className="me-auto">
                            </Nav>

                            <Nav>
                                <div className="navbar-nav ml-auto">
                                    <NavDropdown title="DASHBOARD" id="collasible-nav-dropdown">
                                        <Link to={"/dashboard/admin"} className="dropdown-item">Administrator</Link>
                                        <Link to={"/dashboard/site"} className="dropdown-item">Site manager</Link>
                                        <Link to={"/dashboard/senior"} className="dropdown-item">Senior Manager</Link>
                                    </NavDropdown>
                                    <li className="nav-item text-uppercase">
                                        <Link to={"/register"}
                                              className="nav-link BsBackspaceReverse">REGISTER</Link>
                                    </li>
                                    <li className="nav-item text-uppercase">
                                        <Link to={"/"} className="nav-link">LOGIN</Link>
                                    </li>
                                </div>
                            </Nav>
                        </Navbar.Collapse>
                    </Container>
                </Navbar>
            </div>
        );
    }
}

export default HeaderBar;
