import React from "react";
import "./Footer.css";

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-container">
        <div className="footer-logo">
          <div className="footer-logo-content">
            <img
              src="/logo.png"
              alt="CommUnity Logo"
              className="footer-logo-img"
            />
            <span className="footer-logo-text">CommUnity</span>
          </div>
          <p className="footer-tagline">
            Simplifying Society, Connecting Lives
          </p>
        </div>
        <div className="footer-contact">
          <p id="contact">Contact us on</p>
          <div className="footer-icons">
            <a href="https://www.pinterest.com" className="icon-link">
              <img src="/icons/pinterest.png" alt="Pinterest" />
            </a>
            <a href="https://www.twitter.com" className="icon-link">
              <img src="/icons/twitter.png" alt="Twitter" />
            </a>
            <a href="https://www.facebook.com" className="icon-link">
              <img src="/icons/facebook.png" alt="Facebook" />
            </a>
            <a href="https://www.instagram.com" className="icon-link">
              <img src="/icons/instagram.png" alt="Instagram" />
            </a>
          </div>
        </div>
        <div className="footer-contact-details">
          <p>
            <img src="/icons/email.png" alt="Email Icon" />{" "}
            CommUnityMail@mail.com
          </p>
          <p class="no">9988776655</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
