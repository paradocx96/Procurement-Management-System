import React, {Component} from 'react';

import NavigationAccountant from "../layouts/Navigation/NavigationAccountant";

class DashboardAccountant extends Component {

    render() {
        return (
            <div>
                <NavigationAccountant/>
                <h1>DASHBOARD Accountant</h1>
            </div>
        );
    }
}

export default DashboardAccountant;