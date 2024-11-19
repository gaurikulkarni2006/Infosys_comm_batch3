import React from "react";
import "./Login.css";

const Login = () => {
  return (
    <div className="login-container">
      <div className="login-left">
        <img src="../images/finalbackground.png" alt="Community Buildings" />
      </div>
      <div className="login-right">
        <div className="login-form">
          <h2>CommUnity</h2>
          <p>Seamless Community Interaction and Management.</p>
          <h3>Login</h3>
          <p>Welcome Back.</p>
          <form>
            <label>
              EMAIL
              <input type="email" required />
            </label>
            <label>
              PASSWORD
              <input type="password" required />
            </label>
            <button type="submit">Login</button>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Login;
