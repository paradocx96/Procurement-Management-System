import React, {Component} from 'react';

import NavigationSeniorManager from "../layouts/Navigation/NavigationSeniorManager";
import {Link} from "react-router-dom";

class DashboardSeniorManager extends Component {

    render() {
        return (
            <div>
                <NavigationSeniorManager/>
                <h1>DASHBOARD Senior Manager</h1>

                <Link to={'/inventory/main'}>Inventory</Link>
            </div>
        );
    }
}

export default DashboardSeniorManager;