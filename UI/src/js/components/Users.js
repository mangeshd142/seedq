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
class ConnectedUser extends Component {
  
    constructor(props) {
      super(props);
    }

    getSignUp =()=> {
      this.props.showSignUp();
    }

    getLogin =()=> {
      
    }

    getUser =()=> {
        let aUsersView = [];
        
        forEach( this.props.users.getUsers(), (user)=>{
            let userComponent = (
                <Card>
                    <div>
                        {user.firstName}
                        {user.lastName}
                        {user.email}
                        {user.isActive}
                    </div> 
                </Card>);
            aUsersView.push(userComponent);
        });

        return aUsersView;
    }
  
    render() {
      return (
        <div> 
            {this.getUser()}     
        </div>
      );
    }
  }
  const UserView = connect(
    mapStateToProps,
    mapDispatchToProps
  )(ConnectedUser);
  export default UserView;