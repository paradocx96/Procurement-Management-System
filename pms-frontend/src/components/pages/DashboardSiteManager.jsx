import React, {Component} from 'react';

import NavigationSiteManager from "../layouts/Navigation/NavigationSiteManager";

class DashboardSiteManager extends Component {

    render() {
        return (
            <div>
                <NavigationSiteManager/>
                <h1>DASHBOARD SITE Manager</h1>
            </div>
        );
    }
}

export default DashboardSiteManager;