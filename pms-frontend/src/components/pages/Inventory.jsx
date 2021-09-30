import React from "react";
import {Link} from "react-router-dom";

class Inventory extends React.Component{
    constructor(props) {
        super(props);

    }

    render() {
        return (
            <div>

                <h1>Inventory</h1>

                <Link>Add Inventory Items</Link>

            </div>
        );
    }

}

export default Inventory;