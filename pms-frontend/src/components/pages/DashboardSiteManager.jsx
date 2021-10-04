import React, {Component} from 'react';

import NavigationSiteManager from "../layouts/Navigation/NavigationSiteManager";
import {Link} from "react-router-dom";

class DashboardSiteManager extends Component {

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <h1>DASHBOARD SITE Manager</h1>

                <Link to={'/inventory/main'}>Inventory</Link>
            </div>
        );
    }
}

export default DashboardSiteManager;