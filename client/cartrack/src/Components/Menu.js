import React from 'react';
import { Collapse, Navbar, NavbarToggler, NavbarBrand, Nav, NavItem, NavLink } from 'reactstrap';

export default class Menu extends React.Component {
  constructor(props) {
    super(props);

    this.toggleNavbar = this.toggleNavbar.bind(this);
    this.state = {
      collapsed: true
    };
  }

  toggleNavbar() {
    this.setState({
      collapsed: !this.state.collapsed
    });
  }
  render() {
    return (
      <div>
        <Navbar color="faded" light>
          <NavbarToggler onClick={this.toggleNavbar} />
            <Collapse className="navbar-toggleable-md" isOpen={!this.state.collapsed}>
                <Nav navbar>
                  <NavItem>
                   <NavLink>Readings</NavLink>
                   <NavLink>Alerts</NavLink>
                   <NavLink>History</NavLink>
                   <NavLink>Map</NavLink>
                </NavItem>
            </Nav>
          </Collapse>
          </Navbar>
      </div>
    );
  }
}