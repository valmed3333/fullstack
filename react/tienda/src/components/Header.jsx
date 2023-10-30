import React from "react";
import { Link } from "react-router-dom";
import LogoImg from "../img/icon.png";

export default function Header() {
  return (
    <header className="header">
      <Link className="icon" to={"/"}>
        <img src={LogoImg} alt="" />
      </Link>
      <nav>
        <Link to={"/"}>Viajes</Link>
        <Link to={"/favoritos"}>Favoritos</Link>
      </nav>
    </header>
  );
}
