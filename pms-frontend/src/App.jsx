// Import React stuff
import React from 'react';
import {BrowserRouter as Router, Redirect, Switch, Route} from 'react-router-dom';

// Import Style
import './App.css';

// Import Components
import Dashboard from "./components/pages/Dashboard";


function App() {
    return (
        <div>
            <Router>
                <Switch>
                    {/* USER MANAGEMENT */}



                    {/* DASHBOARD */}
                    <Route path="/dashboard" component={Dashboard}/>


                    {/* SITE */}


                    {/* INVENTORY */}


                    <Redirect to="/"/>
                </Switch>
            </Router>
        </div>
    );
}

export default App;
