import React, {Component} from 'react';
import {Container, Table} from "react-bootstrap";
import DraftOrderService from "../../../services/DraftOrderService";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";

class ViewAllDraftOrderSM extends Component {

    // Initializing state values and functions
    constructor(props) {
        super(props);
        this.state = {
            DraftOrderList: []
        }
    }

    componentDidMount = async () => {
        await DraftOrderService.getAll()
            .then(response => response.data)
            .then((data) => {
                this.setState({DraftOrderList: data});
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
                            <th>Supplier ID</th>
                            <th>Manager ID</th>
                            <th>Site ID</th>
                            <th>Project ID</th>
                            <th>Amount</th>
                            <th>Date Time</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.DraftOrderList.length === 0 ?
                                <tr>
                                    <td>{'Data Not Available!'}</td>
                                </tr>
                                :
                                this.state.DraftOrderList.map((item) => (
                                    <tr key={item.id}>
                                        <td>{item.supplierId}</td>
                                        <td>{item.siteManagerId}</td>
                                        <td>{item.siteId}</td>
                                        <td>{item.projectId}</td>
                                        <td>{item.amount}</td>
                                        <td>{item.dateTime}</td>
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

export default ViewAllDraftOrderSM;