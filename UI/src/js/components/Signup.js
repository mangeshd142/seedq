import React, { Component } from "react";
import {Button} from '@material-ui/core';
import {TextField} from '@material-ui/core';


class SignUp extends Component {
  
    constructor(props) {
      super(props);
      this.state = {
          firstName: "",
          lastName: "",
          email:"",
          password: "",
      }
    }
  
    render() {
      let component = null;

      return (
        <div class="sginin">
            <TextField id="standard-basic" label="First Name" />
            <TextField id="standard-basic" label="Last Name" />
            <TextField id="standard-basic" label="Email" />
            <TextField id="standard-basic" label="Password" />

            <Button variant="contained" color="primary" onClick={this}>Signin</Button>
        </div>
      );
    }
  }
  
  export default SignUp;