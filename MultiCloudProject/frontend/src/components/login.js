import React, { useState } from "react";
import axios from "axios";
import GoogleLoginButton from "./GoogleLoginButton";

const Login = ({ onLogin }) => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const { data } = await axios.post("http://localhost:8080/auth/login", {
        username,
        password,
      });
      onLogin(data.token);
    } catch (err) {
      setError("Invalid username or password.");
    }
  };

  const handleGoogleSuccess = (token) => {
    onLogin(token); // Pass Google token to parent component
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>Login</h1>
      <form onSubmit={handleLogin}>
        <input
          type="text"
          placeholder="Username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
          required
          style={{ padding: "10px", margin: "10px 0", width: "300px" }}
        />
        <br />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
          style={{ padding: "10px", margin: "10px 0", width: "300px" }}
        />
        <br />
        <button
          type="submit"
          style={{
            padding: "10px 20px",
            backgroundColor: "#007BFF",
            color: "#fff",
            border: "none",
            cursor: "pointer",
          }}
        >
          Login
        </button>
      </form>
      <GoogleLoginButton onSuccess={handleGoogleSuccess} />
      {error && <p style={{ color: "red" }}>{error}</p>}
    </div>
  );
};

export default Login;
