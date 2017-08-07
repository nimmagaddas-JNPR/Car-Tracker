import React, {Component} from 'react';


class Vehicle extends Component {

  render() {
    return (
    
      	<tr>
      		<td>{this.props.veh.vin}</td>
      		<td>{this.props.veh.make}</td>
      		<td>{this.props.veh.model}</td>
      		<td>{this.props.veh.maxFuelVolume}</td>
      		<td>{this.props.veh.year}</td>
      		<td>{this.props.veh.redlineRpm}</td>
      		<td>{this.props.veh.lastServiceDate}</td>

      	</tr>
      	
   
    );
  }
}

export default Vehicle;