// Import React stuff
import React from 'react';
import {BrowserRouter as Router, Redirect, Switch, Route} from 'react-router-dom';

// Import Style
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

// Import Components
import Login from "./components/pages/Login";
import HeaderBar from "./components/layouts/Header/HeaderBar";


// Dashboard
import Dashboard from "./components/pages/Dashboard";
import DashboardSiteManager from "./components/pages/DashboardSiteManager";
import DashboardSeniorManager from "./components/pages/DashboardSeniorManager";
import DashboardAccountant from "./components/pages/DashboardAccountant";


//Order


//Site
import AddSite from "./components/sections/Site/AddSite";
import Site from "./components/pages/Site";
import ViewAllSites from "./components/sections/Site/ViewAllSites";


//Inventory
import AddCountableItem from "./components/sections/Inventory/CountableItems/AddCountableItem";
import ViewAllCountableItems from "./components/sections/Inventory/CountableItems/ViewAllCountableItems";
import ConsumeCountableItems from "./components/sections/Inventory/CountableItems/ConsumeCountableItems";
import ReplenishCountableItems from "./components/sections/Inventory/CountableItems/ReplenishCountableItems";
import AddUncountableItem from "./components/sections/Inventory/UncountableItems/AddUncountableItem";
import ViewAllUncountableItems from "./components/sections/Inventory/UncountableItems/ViewAllUncountableItems";
import ConsumeUncountableItems from "./components/sections/Inventory/UncountableItems/ConsumeUncountableItems";
import ReplenishUncountableItems from "./components/sections/Inventory/UncountableItems/ReplenishUncountableItems";


//Project
import AddProjectSM from "./components/sections/Project/AddProjectSM";
import ViewAllProjectSM from "./components/sections/Project/ViewAllProjectSM";


//Order
import AddOrderSM from "./components/sections/Order/AddOrderSM";
import ViewAllOrderSM from "./components/sections/Order/ViewAllOrderSM";
import ViewAllDraftOrderSM from "./components/sections/Order/ViewAllDraftOrderSM";
import AddDeliverySm from "./components/sections/Delivery/AddDeliverySm";
import ViewSingleOrderSM from "./components/sections/Order/ViewSingleOrderSM";
import ViewAllOrderAccountant from "./components/sections/Order/ViewAllOrderAccountant";
import ViewSingleOrderAccountant from "./components/sections/Order/ViewSingleOrderAccountant";
import ViewAllOrderSeManager from "./components/sections/Order/ViewAllOrderSeManager";
import DeleteUncountableItems from "./components/sections/Inventory/UncountableItems/DeleteUncountableItems";
import DeleteCountableItems from "./components/sections/Inventory/CountableItems/DeleteCountableItems";
import Inventory from "./components/pages/Inventory";



function App() {
    return (
        <div>
            <Router>
                <HeaderBar/>
                <Switch>
                    {/* USER MANAGEMENT */}
                    <Route exact path="/" component={Login}/>


                    {/* DASHBOARD */}
                    <Route path="/dashboard/admin" component={Dashboard}/>
                    <Route path="/dashboard/site" component={DashboardSiteManager}/>
                    <Route path="/dashboard/senior" component={DashboardSeniorManager}/>
                    <Route path="/dashboard/accountant" component={DashboardAccountant}/>


                    {/* SITE */}
                    <Route path={'/site'} exact component={Site}/>
                    <Route path="/site/addSite" component={AddSite}/>
                    <Route path="/site/viewAll" component={ViewAllSites}/>

                    {/* INVENTORY */}
                    {/*inventory*/}
                    <Route path="/inventory/main" component={Inventory}/>

                    {/*countable Items*/}
                    <Route path="/inventory/countable/addItem" component={AddCountableItem}/>
                    <Route path="/inventory/countable/viewAll" component={ViewAllCountableItems}/>
                    <Route path="/inventory/countable/delete" component={DeleteCountableItems}/>
                    <Route path="/inventory/countable/consume/:id" component={ConsumeCountableItems}/>
                    <Route path="/inventory/countable/replenish/:id" component={ReplenishCountableItems}/>

                    {/*uncountable items*/}
                    <Route path="/inventory/uncountable/addItem" component={AddUncountableItem}/>
                    <Route path="/inventory/uncountable/viewAll" component={ViewAllUncountableItems}/>
                    <Route path="/inventory/uncountable/delete" component={DeleteUncountableItems}/>
                    <Route path="/inventory/uncountable/consume/:id" component={ConsumeUncountableItems}/>
                    <Route path="/inventory/uncountable/replenish/:id" component={ReplenishUncountableItems}/>


                    {/* PROJECT */}
                    <Route path={'/project/addProjectSm'} component={AddProjectSM}/>
                    <Route path={'/project/listSm'} component={ViewAllProjectSM}/>


                    {/* ORDER */}
                    <Route path={'/order/addOrderSm'} component={AddOrderSM}/>
                    <Route path={'/order/listSm'} component={ViewAllOrderSM}/>
                    <Route path={'/order/listAcc'} component={ViewAllOrderAccountant}/>
                    <Route path={'/order/listSem'} component={ViewAllOrderSeManager}/>
                    <Route path={'/order/viewSm/:id'} component={ViewSingleOrderSM}/>
                    <Route path={'/order/viewAcc/:id'} component={ViewSingleOrderAccountant}/>


                    {/* DRAFT ORDER */}
                    <Route path={'/draft/listSm'} component={ViewAllDraftOrderSM}/>


                    {/* DELIVERY */}
                    <Route path={'/delivery/addDeliverySm/:id'} component={AddDeliverySm}/>



                    {/* DEFAULT PATH */}
                    <Redirect to="/"/>
                </Switch>
            </Router>
        </div>
    );
}

export default App;
