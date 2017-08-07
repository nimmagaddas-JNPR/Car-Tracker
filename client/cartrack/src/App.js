import React, { Component } from 'react';
import axios from 'axios';
import { Button } from 'reactstrap';
import Vehiclelist from './Components/Vehiclelist';
import Maps from './Components/Maps';

import './App.css';

const googleMapURL="https://maps.googleapis.com/maps/api/js?v=3.27&libraries=places,geometry&key=AIzaSyAyesbQMyKVVbBgKVi2g6VX7mop2z96jBo"
class App extends React.Component {
  constructor(props){
    super(props)
    this.state={
      details : [],
      readings:[],

    }
  }

componentDidMount(){  
  axios.get(`http://localhost:8008/api/vehicles`)
    .then(response=>{
      this.setState({details:response.data})
      console.log(this.state.details)
     }) 
    .catch(error => {console.log(error);
      return error;
    });
}

  render() {
    return (
      <div>
        <div>
          <Vehiclelist vehicles={this.state.details}/>
        </div>
        <div><Maps
          containerElement={<div style={{ height: `100%` }} />}
          mapElement={<div style={{ height: `100%` }} />}
        />
        </div>
      </div>
    );
  }
}

export default App;