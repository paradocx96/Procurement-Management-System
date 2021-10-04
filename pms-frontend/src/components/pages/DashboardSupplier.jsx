import React, {Component} from 'react';

import NavigationSupplier from "../layouts/Navigation/NavigationSupplier";

class DashboardSupplier extends Component {

    render() {
        return (
            <div>
                <NavigationSupplier/>
                <h1>DASHBOARD Supplier</h1>
            </div>
        );
    }
}

export default DashboardSupplier;