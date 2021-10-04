import React, {Component} from 'react';
import {Container, Table} from "react-bootstrap";
import OrderService from "../../../services/OrderService";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";
import {Link} from "react-router-dom";

class ViewAllOrderAccountant extends Component {

    // Initializing state values and functions
    constructor(props) {
        super(props);
        this.state = {
            orderList: []
        }
    }

    componentDidMount = async () => {
        await OrderService.getAll()
            .then(response => response.data)
            .then((data) => {
                this.setState({orderList: data});
            }).catch(error =>
                console.log(error.message)
            );
    }

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <Container>
                    <h2>PURCHASE HISTORY</h2>

                    <Table striped bordered hover variant="dark" size="sm">
                        <thead>
                        <tr>
                            <th>Reference No</th>
                            <th>Manager ID</th>
                            <th>Site ID</th>
                            <th>Project ID</th>
                            <th>Amount</th>
                            <th>Status</th>
                            <th>Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.orderList.length === 0 ?
                                <tr>
                                    <td>{'Data Not Available!'}</td>
                                </tr>
                                :
                                this.state.orderList.map((item) => (
                                    <tr key={item.id}>
                                        <td>{item.referenceNo}</td>
                                        <td>{item.siteManagerId}</td>
                                        <td>{item.siteId}</td>
                                        <td>{item.projectId}</td>
                                        <td>{item.amount}</td>
                                        <td>{item.status}</td>
                                        <td>
                                            <Link to={`/delivery/addDeliverySm/` + item.id}
                                                  className={'btn btn-primary'}>
                                                Delivery Log
                                            </Link>
                                        </td>
                                    </tr>
                                ))
                        }
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}

export default ViewAllOrderAccountant;