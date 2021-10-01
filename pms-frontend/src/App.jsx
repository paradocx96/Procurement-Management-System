// Import React stuff
import React from 'react';
import {BrowserRouter as Router, Redirect, Switch, Route} from 'react-router-dom';

// Import Style
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

// Import Components
import Login from "./components/pages/Login";
import Dashboard from "./components/pages/Dashboard";
import AddSite from "./components/sections/Site/AddSite";
import Site from "./components/pages/Site";
import ViewAllSites from "./components/sections/Site/ViewAllSites";
import AddCountableItem from "./components/sections/Inventory/CountableItems/AddCountableItem";
import ViewAllCountableItems from "./components/sections/Inventory/CountableItems/ViewAllCountableItems";
import ConsumeCountableItems from "./components/sections/Inventory/CountableItems/ConsumeCountableItems";
import ReplenishCountableItems from "./components/sections/Inventory/CountableItems/ReplenishCountableItems";
import AddUncountableItem from "./components/sections/Inventory/UncountableItems/AddUncountableItem";
import ViewAllUncountableItems from "./components/sections/Inventory/UncountableItems/ViewAllUncountableItems";


function App() {
    return (
        <div>
            <Router>
                <Switch>
                    {/* USER MANAGEMENT */}
                    <Route exact path="/" component={Login}/>


                    {/* DASHBOARD */}
                    <Route path="/dashboard" component={Dashboard}/>


                    {/* SITE */}
                    <Route path={'/site'} exact component={Site}/>
                    <Route path="/site/addSite" component={AddSite}/>
                    <Route path="/site/viewAll" component={ViewAllSites}/>

                    {/* INVENTORY */}
                    {/*inventory*/}

                    {/*countable Items*/}
                    <Route path="/inventory/countable/addItem" component={AddCountableItem}/>
                    <Route path="/inventory/countable/viewAll" component={ViewAllCountableItems}/>
                    <Route path="/inventory/countable/consume/:id" component={ConsumeCountableItems}/>
                    <Route path="/inventory/countable/replenish/:id" component={ReplenishCountableItems}/>

                    {/*uncountable items*/}
                    <Route path="/inventory/uncountable/addItem" component={AddUncountableItem}/>
                    <Route path="/inventory/uncountable/viewAll" component={ViewAllUncountableItems}/>


                    {/* DEFAULT PATH */}
                    <Redirect to="/"/>
                </Switch>
            </Router>
        </div>
    );
}

export default App;
