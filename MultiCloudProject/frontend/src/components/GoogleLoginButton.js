import React from "react";
import { GoogleOAuthProvider, GoogleLogin } from "@react-oauth/google";

const GoogleLoginButton = ({ onSuccess }) => {
  const handleSuccess = (response) => {
    const token = response.credential; // Google OAuth credential
    onSuccess(token);
  };

  const handleError = () => {
    alert("Google login failed. Please try again.");
  };

  return (
    <GoogleOAuthProvider clientId="912831856789-0urb0shk95jml1gvipo7n5eha2g6snrc.apps.googleusercontent.com">
      <GoogleLogin onSuccess={handleSuccess} onError={handleError} />
    </GoogleOAuthProvider>
  );
};

export default GoogleLoginButton;
