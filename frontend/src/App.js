import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Header from "./components/Header";
import HeroSection from "./components/HeroSection";
import AboutCommUnity from "./components/AboutCommUnity";
import Footer from "./components/Footer";
import Login from "./components/Login";
import SignUp from "./components/SignUp";
import "./App.css";

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <Routes>
          <Route
            path="/"
            element={
              <>
                <HeroSection />
                <AboutCommUnity />
              </>
            }
          />
          <Route path="/login" element={<Login />} />
          <Route path="/" element={<Login />} /> 
          <Route path="/signup" element={<SignUp />} />
          
        </Routes>
        <Footer />
      </div>
    </Router>
  );
}

export default App;