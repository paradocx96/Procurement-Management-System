import React, {Component} from 'react';
import {Button, Col, Container, Form, Row} from "react-bootstrap";
import {v4 as uuid4} from 'uuid';
import OrderService from "../../../services/OrderService";
import DraftOrderService from "../../../services/DraftOrderService";
import ProjectService from "../../../services/ProjectService";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";

class AddOrderSM extends Component {

    // Initializing state values and functions
    constructor(props) {
        super(props);
        this.state = this.initialState;
        this.state = {
            siteManagerId: '100',
            siteId: '200',
            status: 'pending',
            projectList: [],
            message: '',
            show: false,
        }

        this.onSubmit = this.onSubmit.bind(this);
        this.onReset = this.onReset.bind(this);
        this.onDraft = this.onDraft.bind(this);

        this.onHandlerProjectId = this.onHandlerProjectId.bind();
        this.onHandlerSupplierId = this.onHandlerSupplierId.bind();
        this.onHandlerAmount = this.onHandlerAmount.bind();
        this.onHandlerContactDetails = this.onHandlerContactDetails.bind();
        this.onHandlerComment = this.onHandlerComment.bind();
    }

    // Initializing default values
    initialState = {
        referenceNo: '',
        projectId: '',
        supplierId: '',
        itemList: [],
        amount: 0.0,
        contactDetails: '',
        comment: ''
    }

    componentDidMount = async () => {
        await ProjectService.getAll()
            .then(response => response.data)
            .then((data) => {
                this.setState({projectList: data});
            }).catch(error =>
                console.log(error.message)
            );
    }

    // Assign form values to State variables
    onHandlerProjectId = (event) => {
        this.setState({projectId: event.target.value});
    }

    onHandlerSupplierId = (event) => {
        this.setState({supplierId: event.target.value});
    }

    onHandlerAmount = (event) => {
        this.setState({amount: event.target.value});
    }

    onHandlerContactDetails = (event) => {
        this.setState({contactDetails: event.target.value});
    }

    onHandlerComment = (event) => {
        this.setState({comment: event.target.value});
    }

    // Submit form values
    onSubmit = async (event) => {
        event.preventDefault();

        let newRefNo = uuid4();

        let value = {
            referenceNo: newRefNo,
            supplierId: this.state.supplierId,
            itemList: this.state.itemList,
            siteManagerId: this.state.siteManagerId,
            siteId: this.state.siteId,
            projectId: this.state.projectId,
            amount: this.state.amount,
            contactDetails: this.state.contactDetails,
            comment: this.state.comment,
            status: this.state.status
        }

        console.log(value);

        // await OrderService.create(value)
        //     .then(response => response.data)
        //     .then((data) => {
        //         console.log(data);
        //     })
        //     .catch(function (error) {
        //         console.log(error.message);
        //     });

        await this.componentDidMount();
        await this.onReset();
    }

    // TODO : Draft form values
    onDraft = async (event) => {
        event.preventDefault();

        let value = {
            supplierId: this.state.supplierId,
            itemList: this.state.itemList,
            siteManagerId: this.state.siteManagerId,
            siteId: this.state.siteId,
            projectId: this.state.projectId,
            amount: this.state.amount,
            contactDetails: this.state.contactDetails,
            comment: this.state.comment
        }

        console.log(value);

        // await DraftOrderService.create(value)
        //     .then(response => response.data)
        //     .then((data) => {
        //         console.log(data);
        //     })
        //     .catch(function (error) {
        //         console.log(error.message);
        //     });

        await this.componentDidMount();
        await this.onReset();
    }

    // Reset form values
    onReset = () => {
        this.setState(() => this.initialState);
        this.componentDidMount();
    }

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <Container>
                    <h2>PURCHASE ORDER</h2>

                    <div>
                        <Form onSubmit={this.onSubmit.bind(this)}
                              onReset={this.onReset.bind(this)}>

                            <Form.Group controlId="projectId" className={'pt-3'}>
                                <Form.Control required as="select"
                                              name="projectId"
                                              onChange={this.onHandlerProjectId}>

                                    <option>Project</option>
                                    {this.state.projectList.map(item => (
                                        <option key={item.id} value={item.id}>
                                            {item.projectName}
                                        </option>
                                    ))}
                                </Form.Control>
                            </Form.Group>


                            <Form.Group controlId="supplierId" className={'pt-3'}>
                                <Form.Control required as="select"
                                              name="supplierId"
                                              value={this.state.supplierId}
                                              onChange={this.onHandlerSupplierId}>

                                    <option>Supplier</option>
                                    <option>Supplier 1</option>
                                    <option>Supplier 2</option>
                                </Form.Control>
                            </Form.Group>


                            <Form.Group as={Row} controlId="contactDetails" className={'pt-3'}>
                                <Col sm={6}>
                                    <Form.Control placeholder="Contact Details"
                                                  name="contactDetails"
                                                  as="textarea"
                                                  rows={5}
                                                  required
                                                  value={this.state.contactDetails}
                                                  onChange={this.onHandlerContactDetails}/>
                                </Col>
                                <Col sm={6}>
                                    <Form.Control placeholder="Comment"
                                                  name="comment"
                                                  as="textarea"
                                                  rows={5}
                                                  required
                                                  value={this.state.comment}
                                                  onChange={this.onHandlerComment}/>
                                </Col>
                            </Form.Group>

                            <Form.Group className={'pt-2'}>
                                <Col>
                                    <Button onClick={this.onDraft.bind(this)}>DRAFT</Button>{'\u00A0'}
                                    <Button type="submit">PURCHASE</Button>{'\u00A0'}
                                    <Button type="reset" className="btn-danger">RESET</Button>{'\u00A0'}
                                </Col>
                            </Form.Group>

                        </Form>
                    </div>
                </Container>
            </div>
        );
    }
}

export default AddOrderSM;