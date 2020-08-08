import React from 'react';
import ReactDOM from 'react-dom';
import Form from './js/components/Form'

const template = React.createElement('p', {}, 'Hello from react');

ReactDOM.render(React.createElement(Form), document.getElementById('root'));