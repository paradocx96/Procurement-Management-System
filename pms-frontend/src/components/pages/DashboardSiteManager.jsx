import React, {Component} from 'react';

import NavigationSiteManager from "../layouts/Navigation/NavigationSiteManager";
import {Card, Container} from "react-bootstrap";
import {Link} from "react-router-dom";

class DashboardSiteManager extends Component {

    divSection = {
        color: '#000000',
        margin: '20px',
        padding: '20px',
        borderRadius: '25px',
        backgroundColor: '#212121',
        minHeight: '490px',
        textAlign: 'center'
    }

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <Container>
                    <h1>DASHBOARD - SITE MANAGER</h1>

                    <section style={this.divSection}>
                        <div className={'row pt-5'}>
                            <div className={'col'}>
                                <Link to={'/order/addOrderSm'} style={{textDecoration: 'none'}}>
                                    <Card className={''}>
                                        <Card.Body>
                                            <Card.Title>PURCHASE ORDER</Card.Title>
                                        </Card.Body>
                                    </Card>
                                </Link>
                            </div>
                            <div className={'col'}>
                                <Link to={'/order/listSm'} style={{textDecoration: 'none'}}>
                                    <Card>
                                        <Card.Body>
                                            <Card.Title>PURCHASE HISTORY</Card.Title>
                                        </Card.Body>
                                    </Card>
                                </Link>
                            </div>
                            <div className={'col'}>
                                <Link to={'/draft/listSm'} style={{textDecoration: 'none'}}>
                                    <Card>
                                        <Card.Body>
                                            <Card.Title>DRAFT ORDER</Card.Title>
                                        </Card.Body>
                                    </Card>
                                </Link>
                            </div>
                        </div>
                        <div className={'row pt-3'}>
                            <div className={'col'}>
                                <Link to={'/project/addProjectSm'} style={{textDecoration: 'none'}}>
                                    <Card className={''}>
                                        <Card.Body>
                                            <Card.Title>NEW PROJECT</Card.Title>
                                        </Card.Body>
                                    </Card>
                                </Link>
                            </div>
                            <div className={'col'}>
                                <Link to={'/project/listSm'} style={{textDecoration: 'none'}}>
                                    <Card>
                                        <Card.Body>
                                            <Card.Title>PROJECTS LIST</Card.Title>
                                        </Card.Body>
                                    </Card>
                                </Link>
                            </div>
                            <div className={'col'}>

                            </div>
                        </div>
                    </section>

                </Container>
            </div>
        );
    }
}

export default DashboardSiteManager;