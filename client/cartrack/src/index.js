import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';			
import './index.css';
import App from './App';
import Maps from './Components/Maps';
import Vehicle from './Components/Vehicle';
import Menu from './Components/Menu'
import Readings from './Components/Readings';
import {BrowserRouter as Router, Route, link, Switch} from 'react-router-dom';
import registerServiceWorker from './registerServiceWorker';


ReactDOM.render(
	<Router>
		<div>
			<h2>Car Tracker</h2>
			<div>
				<Switch>
					<Route path="/" component={Menu}/>
					<Route path="/Maps" component={Maps}/>
					<Route path="/Readings" component={Readings}/>
				</Switch>
			</div>
			<div>
				<App/>
			</div>
		</div>
	</Router>,
 document.getElementById('root'));
registerServiceWorker();
