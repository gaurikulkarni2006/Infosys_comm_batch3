import React from "react";
import "./Header.css";

const Header = () => {
  return (
    <header className="header">
      <div className="logo">
        <img src="/logo.png" alt="CommUnity Logo" className="logo-img" />
        <span className="logo-text">CommUnity</span>
      </div>
      <nav className="nav">
        <a href="#home">Home</a>
        <a href="#about">About Us</a>
        <a href="#contact">Contact Us</a>
      </nav>
    </header>
  );
};

export default Header;
