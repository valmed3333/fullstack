import React, { useState } from "react";
const ProductosDestacados = (props) => {
  const { productos } = props;
  const [busqueda, setbusqueda] = useState("");
  const [favoritos, setFavoritos] = useState([]);
  const agregarFavorito = (producto) => {
    setFavoritos([...favoritos, producto]);
  };
  const eliminarfavorito = (index) => {
    //   //setFavoritos(favoritos.filter((item)=> item!==producto));
    const 


    setFavoritos(favoritos.splice(index, 1));
  };
  const buscarNombre = (event) => {
    setbusqueda(event.target.value);
  };
  const productosFiltrados = productos.filter((producto) =>
    producto.nombre.toLowerCase().includes(busqueda.toLowerCase())
  );

  return (
    <>
      <h2>productos destacados</h2>
      <input
        type="text"
        value={busqueda}
        placeholder="Buscar producto"
        onChange={buscarNombre}
      />
      <ul>
        {productosFiltrados.map((pro, index) => (
          <li key={index}>
            <h3>{pro.nombre}</h3>
            <p>Precio: {pro.precio}</p>
            <button onClick={() => agregarFavorito(pro)}>
              Agregar a favoritos
            </button>
          </li>
        ))}
      </ul>
      <h3>favoritos:</h3>
      <ul>
        {favoritos.map((favorito, index) => (
          <li key={index}>
            <h3>{favorito.nombre}</h3>
            <button onClick={() => eliminarfavorito(index)}>
              elimina de los favoritos
            </button>
          </li>
        ))}
      </ul>
    </>
  );
};
export default ProductosDestacados;
