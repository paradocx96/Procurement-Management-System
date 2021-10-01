import React from "react";
import {Link} from "react-router-dom";

class Site extends React.Component{
    constructor(props) {
        super(props);

    }

    render() {
        return (
            <div>
                <h2>Site Page</h2>
                <Link to={'/site/addSite'}>Add Site</Link>
                <Link to={'/site/viewAll'}>View All Sites</Link>
            </div>
        );
    }

}
export default Site;