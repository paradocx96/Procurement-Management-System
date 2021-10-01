import React, {Component} from 'react';
import {Container, Table} from "react-bootstrap";
import ProjectService from "../../../services/ProjectService";
import NavigationSiteManager from "../../layouts/Navigation/NavigationSiteManager";

class ViewAllProject extends Component {

    // Initializing state values and functions
    constructor(props) {
        super(props);
        this.state = {
            projectList: []
        }
    }

    // Function for get all teachers details
    componentDidMount = async () => {
        await ProjectService.getAll()
            .then(response => response.data)
            .then((data) => {
                this.setState({projectList: data});
            }).catch(error =>
                console.log(error.message)
            );
    }

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <Container>
                    <h2>PROJECT LIST</h2>

                    <Table striped bordered hover variant="dark" size="sm">
                        <thead>
                        <tr>
                            <th>Project Name</th>
                            <th>Description</th>
                            <th>Budget</th>
                            <th>Created Date</th>
                        </tr>
                        </thead>
                        <tbody>
                        {
                            this.state.projectList.length === 0 ?
                                <tr>
                                    <td>{'Data Not Available!'}</td>
                                </tr>
                                :
                                this.state.projectList.map((item) => (
                                    <tr key={item.id}>
                                        <td>{item.projectName}</td>
                                        <td>{item.description}</td>
                                        <td>{item.budget}</td>
                                        <td>{item.createDateTime}</td>
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

export default ViewAllProject;