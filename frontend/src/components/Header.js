import React from "react";
import "./Header.css";
import { Link } from "react-router-dom";
const Header = () => {
  return (
    <header className="header">
      <div className="logo">
        <img src="/whitelogo.png" alt="CommUnity Logo" className="logo-img" />
      </div>
      <nav className="nav">
        <a href="/">Home</a>
        <a href="#about">About Us</a>
        <a href="#contact">Contact Us</a>
        <Link to="/signup">
          <button className="signup-button">Sign Up</button>
        </Link>
      </nav>
    </header>
  );
};

export default Header;
