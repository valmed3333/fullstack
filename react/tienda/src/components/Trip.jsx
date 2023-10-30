import React, { useState } from "react";
import { Link } from "react-router-dom";
import FavImg from "../img/like.png";
import NoFavImg from "../img/fullLike.png";

export default function Trip({
  viaje,
  agregarAFavoritos,
  eliminarDeFavoritos,
}) {
  const [favorito, setFavorito] = useState(false);

  function handleClick() {
    if (favorito) {
      eliminarDeFavoritos(viaje);
      setFavorito(false);
    } else {
      agregarAFavoritos(viaje);
      setFavorito(true);
    }
  }

  return (
    <div className="viaje">
      <Link to={`/viaje/${viaje.id}`}>
        {/* <img src={viaje.images[0]} alt="Viaje"></img> */}
        <img src={viaje.image} alt="Viaje"></img>
      </Link>
      <div className="info">
        <p>{viaje.title}</p>
        <mark>${viaje.price}</mark>
      </div>
      {favorito ? (
        <img className="fav-icon" onClick={handleClick} src={NoFavImg} alt="" />
      ) : (
        <img className="fav-icon" onClick={handleClick} src={FavImg} alt="" />
      )}
    </div>
  );
}
