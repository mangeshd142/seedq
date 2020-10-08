import React, { Component } from "react";
import { connect } from "react-redux";

import {Button} from '@material-ui/core';
import Signup from './Signup';
import { showSignUp } from "../actions/index";

function mapDispatchToProps(dispatch) {
  return {
    showSignUp: function(){return dispatch(showSignUp())}
  };
}
const mapStateToProps = state => {
  return { appData: state.appData };
};
class ConnectedHome extends Component {
  
    constructor(props) {
      super(props);
    }

    getSignUp=()=>{
      this.props.showSignUp();
    }

    getLogin=()=>{
      
    }
  
    render() {
      let signinComponent = this.props.appData.getIsSignUp() ? (<Signup/>) : null;
      return (
        <div>
          <Button variant="contained" color="primary" onClick={this.getLogin}>login</Button>
          <Button variant="contained" color="primary" onClick={this.getSignUp}>signUp</Button>
          {signinComponent}
        </div>
      );
    }
  }
  const Home = connect(
    mapStateToProps,
    mapDispatchToProps
  )(ConnectedHome);
  export default Home;