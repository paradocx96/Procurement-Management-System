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


function App() {
    return (
        <div>
            <Router>
                <Switch>
                    {/* USER MANAGEMENT */}
                    <Route path="/" component={Login}/>


                    {/* DASHBOARD */}
                    <Route path="/dashboard" component={Dashboard}/>


                    {/* SITE */}
                    <Route path="/site/main" component={Site}/>
                    <Route path="/site/addSite" component={AddSite}/>

                    {/* INVENTORY */}
                    {/*inventory*/}

                    {/* DEFAULT PATH */}
                    <Redirect to="/"/>
                </Switch>
            </Router>
        </div>
    );
}

export default App;
