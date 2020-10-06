import React, { Component } from "react";
import {Button} from '@material-ui/core';
import Signup from './Signup';

class Home extends Component {
  
    constructor(props) {
      super(props);
      this.state = {
          isLogin: false,
          isSignup: false,
      }

      this.getLogin = this.getLogin.bind(this);
      this.getSignUp = this.getSignUp.bind(this);
    }

    getSignUp(){
        this.setState({isLogin: false, isSignup:true})
    }

    getLogin(){
        this.setState({isLogin: true, isSignup:false})
    }
  
    render() {
      let signinComponent = this.state.isSignup ? (<Signup/>) : null;
      return (
        <div>
          <Button variant="contained" color="primary" onClick={this}>login</Button>
          <Button variant="contained" color="primary" onClick={this.getSignUp}>signup</Button>
          {signinComponent}
        </div>
      );
    }
  }
  
  export default Home;