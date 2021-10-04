import React, {Component} from 'react';
import {Button, Col, Container, Form, Row} from "react-bootstrap";
import {v4 as uuid4} from 'uuid';
import OrderService from "../../../services/OrderService";
import DraftOrderService from "../../../services/DraftOrderService";
import ProjectService from "../../../services/ProjectService";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";
import SiteService from "../../../services/SiteService";

class AddOrderSM extends Component {

    // Initializing state values and functions
    constructor(props) {
        super(props);
        this.state = this.initialState;
        this.state = {
            status: 'pending',
            projectList: [],
            siteList: [],
            itemBucket: [],
            siteManagerId: '5454654',
            message: '',
            show: false,
            itId: '',
            itName: '',
            itCount: '',
        }

        this.onSubmit = this.onSubmit.bind(this);
        this.onReset = this.onReset.bind(this);
        this.onDraft = this.onDraft.bind(this);
        this.AddItemToBucket = this.AddItemToBucket.bind(this);

        this.onHandlerProjectId = this.onHandlerProjectId.bind();
        this.onHandlerSiteId = this.onHandlerSiteId.bind();
        this.onHandlerSupplierId = this.onHandlerSupplierId.bind();
        this.onHandlerAmount = this.onHandlerAmount.bind();
        this.onHandlerContactDetails = this.onHandlerContactDetails.bind();
        this.onHandlerItId = this.onHandlerItId.bind();
        this.onHandlerItName = this.onHandlerItName.bind();
        this.onHandlerItCount = this.onHandlerItCount.bind();
        this.onHandlerComment = this.onHandlerComment.bind();
    }

    // Initializing default values
    initialState = {
        referenceNo: '',
        projectId: '',
        siteId: '',
        supplierId: '',
        itemList: [],
        amount: 0.0,
        contactDetails: '',
        comment: '',
    }

    componentDidMount = async () => {
        await SiteService.getAllSites()
            .then(response => response.data)
            .then((data) => {
                this.setState({siteList: data});
            }).catch(error =>
                console.log(error.message)
            );
    }

    // Assign form values to State variables
    onHandlerProjectId = (event) => {
        this.setState({projectId: event.target.value});
    }

    onHandlerSiteId = async (event) => {
        this.setState({siteId: event.target.value});

        await ProjectService.getBySiteId(event.target.value)
            .then(response => response.data)
            .then((data) => {
                this.setState({projectList: data});
            }).catch(error =>
                console.log(error.message)
            );
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

    onHandlerItId = (event) => {
        this.setState({itId: event.target.value});
    }

    onHandlerItName = (event) => {
        this.setState({
            itId: event.target.id,
            itName: event.target.value
        });
    }

    onHandlerItCount = (event) => {
        this.setState({itCount: event.target.value});
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

    AddItemToBucket = async (event) => {
        event.preventDefault();

        this.setState((prevState) => ({
            itemBucket: [
                ...prevState.itemBucket,
                {
                    itemId : this.state.itId,
                    itemName : this.state.itName,
                    itemCount : this.state.itCount
                },
            ],
        }));

        console.log(this.state.itemBucket);

        // const value = {
        //     itemId : this.state.itId,
        //     itemName : this.state.itName,
        //     itemCount : this.state.itCount
        // }
        // this.setState({itemBucket: value});
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

                            <Form.Group as={Row} controlId="siteId" className={'pt-3'}>
                                <Col sm={6}>
                                    <Form.Control required as="select"
                                                  name="siteId"
                                                  onChange={this.onHandlerSiteId}>

                                        <option>Select Site</option>
                                        {this.state.siteList.map(item => (
                                            <option key={item.id} value={item.id}>
                                                {item.siteName}
                                            </option>
                                        ))}
                                    </Form.Control>
                                </Col>
                                <Col sm={6}>
                                    <Form.Control required as="select"
                                                  name="projectId"
                                                  onChange={this.onHandlerProjectId}>

                                        <option>Select Project</option>
                                        {this.state.projectList.map(item => (
                                            <option key={item.id} value={item.id}>
                                                {item.projectName}
                                            </option>
                                        ))}
                                    </Form.Control>
                                </Col>
                            </Form.Group>

                            <Form.Group as={Row} controlId="supplierId" className={'pt-3'}>
                                <Col sm={6}>
                                <Form.Control required as="select"
                                              name="supplierId"
                                              value={this.state.supplierId}
                                              onChange={this.onHandlerSupplierId}>

                                    <option>Supplier</option>
                                    <option>Supplier 1</option>
                                    <option>Supplier 2</option>
                                </Form.Control>
                                </Col>
                            </Form.Group>

                            <Form.Group as={Row} controlId="projectId" className={'pt-3'}>
                                <Col sm={5}>
                                    <Form.Control required as="select"
                                                  name="itName"
                                                  value={this.state.itName}
                                                  onChange={this.onHandlerItName}>

                                        <option>ITEM</option>
                                        <option id="10">Item 1</option>
                                        <option id="20">Item 2</option>
                                        <option id="30">Item 3</option>
                                        <option id="40">Item 4</option>
                                        <option id="50">Item 5</option>
                                    </Form.Control>
                                </Col>
                                <Col sm={5}>
                                    <Form.Control placeholder="Item Qty"
                                                  name="itCount"
                                                  required
                                                  value={this.state.itCount}
                                                  onChange={this.onHandlerItCount}/>
                                </Col>
                                <Col sm={2}>
                                    <Button onClick={this.AddItemToBucket.bind(this)}>+</Button>
                                </Col>

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