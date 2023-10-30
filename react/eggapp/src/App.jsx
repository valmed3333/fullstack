// import { useState } from 'react'
import React from "react";
import ProductosDestacados from "./components/ProductosDestacados";

function App() {
  const productos = [
    { nombre: "Camiseta", precio: "$20" },
    { nombre: "Zapatos", precio: "$50" },
    { nombre: "Bolso", precio: "$30" },
    { nombre: "Correa", precio: "$10" },
  ];

  return (
    <>
      <h1>Tienda de Productos</h1>
      <ProductosDestacados productos={productos} />
    </>
  );
}

export default App;
