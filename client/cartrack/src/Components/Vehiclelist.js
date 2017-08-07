import React, { Component } from 'react';
import Vehicle from './Vehicle';
import { Table } from 'reactstrap';

class VehicleList extends Component{
	constructor(props){
		super(props)
	}
	render(){
		
  		let vehList = this.props.vehicles.map((veh) => {
  		return (
  					<Vehicle key= {veh.vin} veh={veh}  />
  			 	);
  			 });
  

  return (
      <div>
        <Table stipend>
          <thread>
            <tr>
              <th>Vin</th>
              <th>Make</th>
              <th>Model</th>
              <th>Max Fuel Volume</th>
              <th>Year</th>
              <th>ReadLine rmp</th>
              <th>Last Service Data</th>
            </tr>
          </thread>
          <tbody>
      	   {vehList}
         </tbody>

        </Table>
      </div>
    );
}
}

export default VehicleList