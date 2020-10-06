import React, { Component } from "react";
import {Button} from '@material-ui/core';


class Home extends Component {
  
    constructor(props) {
      super(props);
    }
  
    render() {
      
      return (
        <div>
          Home
          <Button variant="contained" color="primary" onClick={this}>login</Button>
          <Button variant="contained" color="primary">signup</Button>
        </div>
      );
    }
  }
  
  export default Home;