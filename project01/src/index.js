import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

// 만약 전에 했던 코드로 돌아가고 싶다면
// AppExample -> App 으로 변경
import App from './AppExample';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  //<React.StrictMode>
    <App />
  //</React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
