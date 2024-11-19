import React from "react";
import { useNavigate } from "react-router-dom";
import "./HeroSection.css";

const HeroSection = () => {
  const navigate = useNavigate();

  const handleGetStartedClick = () => {
    navigate("/login");
  };

  return (
    <section className="hero-section">
      <div className="overlay">
        <div className="content">
          <h1>Welcome to CommUnity</h1>
          <p>
            The ultimate platform designed to streamline housing society
            management and foster community connections. Whether you're a
            resident, administrator, or non-resident, CommUnity brings
            convenience to your fingertips with a comprehensive set of features
            tailored for everyone.
          </p>
          <button className="cta-button" onClick={handleGetStartedClick}>
            Get Started
          </button>
        </div>
      </div>
    </section>
  );
};

export default HeroSection;
