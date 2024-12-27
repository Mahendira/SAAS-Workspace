// Below code for showing the same page
import React, { useState } from 'react';

const BasicPage = () => {
    const [responseMessage, setResponseMessage] = useState('');

    const handleMarketResearchClick = async () => {
        try {
            const response = await fetch('http://localhost:8080/basic'); // Assuming the backend runs on localhost:8080
            const data = await response.text();
            setResponseMessage(data);
        } catch (error) {
            setResponseMessage('Error fetching data from the server.');
        }
    };

    return (
        <div>
            <h1>Basic Page</h1>
            <button onClick={handleMarketResearchClick}>Market Research</button>
            {responseMessage && <p>{responseMessage}</p>}
        </div>
    );
};

export default BasicPage;
