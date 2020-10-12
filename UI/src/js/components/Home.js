import React, { Component } from "react";
import { connect } from "react-redux";

import {Button} from '@material-ui/core';
import Signup from './Signup';
import { showSignUp, fetchUsers } from "../actions/home-actions";
import Users from "./Users";

function mapDispatchToProps(dispatch) {
  return {
    showSignUp: function(){return dispatch(showSignUp())},
    getUsers: function(){return dispatch(fetchUsers())}
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
    getUsers=()=>{
      this.props.getUsers();
    }

    getLogin=()=>{
      
    }
  
    render() {
      let signinComponent = null;
      let usersView = null;
      let loadingView = null;
      if(this.props.appData.getIsLoading()){
        loadingView = (<div>Loadin...</div>)
      } else {
        if(this.props.appData) {
          signinComponent = this.props.appData.getIsSignUp() ? (<Signup/>) : null;
          usersView = this.props.appData.getIsUsers() ? (<Users/>) : null;
        }
      }
      
      return (
        <div> 
          <div className="app">
          </div>
          <Button variant="contained" color="primary" onClick={this.getLogin}>login</Button>
          <Button variant="contained" color="primary" onClick={this.getSignUp}>signUp</Button>
          <Button variant="contained" color="primary" onClick={this.getUsers}>signUp</Button>
          {loadingView}
          {signinComponent}
          {usersView}
        </div>
      );
    }
  }
  const Home = connect(
    mapStateToProps,
    mapDispatchToProps
  )(ConnectedHome);
  export default Home;