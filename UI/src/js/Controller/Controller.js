import React, { Component } from "react";
import App from '../components/App';
import Home from '../components/Home';
import { Provider } from "react-redux";
import Store  from '../store/index';
import {Card} from '@material-ui/core/';

class Controller extends Component {
  
  constructor(props) {
    super(props);
  }

  render() {
    
    return (
      <Provider store={Store}>
        <Card>
         <Home/>
        </Card>
        <App/>
      </Provider>
    );
  }
}

export default Controller;