import React, { Component } from "react";
import App from '../components/App';


import { Provider } from "react-redux";
import Store  from '../store/index';

class Controller extends Component {
  
  constructor(props) {
    super(props);
  }

  render() {
    
    return (
      <Provider store={Store}>
        <App/>
      </Provider>
    );
  }
}

export default Controller;