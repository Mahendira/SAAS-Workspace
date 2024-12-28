import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
    return (
        <div>
            <h1>Home Page</h1>
            <div>
                <Link to="/basic">
                    <button>Basic</button>
                </Link>
                <Link to="/medium">
                    <button>Medium</button>
                </Link>
                <Link to="/advanced">
                    <button>Advanced</button>
                </Link>
            </div>
        </div>
    );
};

export default Home;



//import React, { useState } from "react";
//import { callApi } from "../api";
//
//const Home = () => {
//  const [message, setMessage] = useState("");
//
//  const handleButtonClick = async (endpoint) => {
//    const result = await callApi(endpoint);
//    setMessage(result);
//  };
//
//  return (
//    <div style={{ textAlign: "center", marginTop: "50px" }}>
//      <h1>Spring Boot + React Integration</h1>
//      <div>
//        <button onClick={() => handleButtonClick("/basic")}>Basic</button>
//        <button onClick={() => handleButtonClick("/medium")}>Medium</button>
//        <button onClick={() => handleButtonClick("/advanced")}>Advanced</button>
//      </div>
//      <div style={{ marginTop: "20px" }}>
//        <h2>Response:</h2>
//        <p>{message}</p>
//      </div>
//    </div>
//  );
//};
//
//export default Home;
