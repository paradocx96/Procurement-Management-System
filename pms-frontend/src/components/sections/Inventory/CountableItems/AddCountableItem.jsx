import React from "react";
import {Form} from "react-bootstrap";

class AddCountableItem extends React.Component{
    constructor(props) {
        super(props);
        this.state = this.initialState;

        this.onChange = this.onChange.bind(this);

    }

    initialState={
        name:'',
        status:'',
        quantity:'',
        minimumQuantity:'',
        siteId:'',
        siteName:''
    }

    onChange = (event) => {
        this.setState({[event.target.name] : event.target.value});
    }

    render() {
        return (
            <div>

                <div>
                    <h2>Add Countable Item</h2>

                    <Form>
                        <Form.Group>
                            <Form.Label>Item name</Form.Label>
                            <Form.Control
                                required
                                type={'text'}
                                placeholder = {'Enter Item name'}
                                name={'name'}

                            />
                        </Form.Group>
                    </Form>
                </div>





            </div>
        );
    }

}

export default AddCountableItem;