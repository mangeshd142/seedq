import React, { Component } from "react";
import { connect } from "react-redux";

//import {Button} from '@material-ui/core';
//import Signup from './Signup';
//import { showSignUp } from "../actions/index";
import {Card} from '@material-ui/core/';
import { forEach } from "lodash";

function mapDispatchToProps(dispatch) {
  return {
  };
}
const mapStateToProps = state => {
  return { users: state.appData.getUsers() };
};
class LoginView extends Component {
  
    constructor(props) {
      super(props);
    }

    getLogin =()=> {
      
    }

  
    render() {
      return (
        <div> 
            <Card>
                <div>
                  <TextField id="standard-basic" label="First Name" />
                  <TextField id="standard-basic" label="Last Name" />
                  <TextField id="standard-basic" label="Email" />
                  <TextField id="standard-basic" label="Password" />

                  <Button variant="contained" color="primary" onClick={this}>Signin</Button>
                </div> 
              </Card>);     
        </div>
      );
    }
  }
  
  export default connect(
                          mapStateToProps,
                          mapDispatchToProps
                        )(LoginView);