
import React, { useState } from "react";
import axios from "axios";

const ApiAccess = () => {
    const [response, setResponse] = useState("");

    const fetchApi = async (endpoint) => {
        try {
            const { data } = await axios.get(endpoint);
            setResponse(data);
        } catch (err) {
            setResponse("Access denied");
        }
    };

    return (
        <div>
            <h1>API Access</h1>
            <button onClick={() => fetchApi("/api/basic")}>Access Basic API</button>
            <button onClick={() => fetchApi("/api/medium")}>Access Medium API</button>
            <button onClick={() => fetchApi("/api/advanced")}>
                Access Advanced API
            </button>
            <p>{response}</p>
        </div>
    );
};

export default ApiAccess;
        