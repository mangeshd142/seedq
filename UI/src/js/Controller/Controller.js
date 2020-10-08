import React, { Component } from "react";
import App from '../components/App';
import Home from '../components/Home';
import { Provider } from "react-redux";
import Store  from '../store/index';

class Controller extends Component {
  
  constructor(props) {
    super(props);
  }

  render() {
    
    return (
      <Provider store={Store}>
        <Home/>
        <App/>
      </Provider>
    );
  }
}

export default Controller;