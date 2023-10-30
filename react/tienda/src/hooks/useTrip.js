import { useEffect, useState } from "react";
import { getTrips } from "../services/tripService";

export default function useTrip() {
  const [viajes, setViajes] = useState([]);
  const [favoritos, setFavoritos] = useState([]);

  useEffect(() => {
    getTrips().then((data) => {
      console.log(data);
      setViajes(data);
    });
  }, []);

  function agregarAFavoritos(viaje) {
    const newFavoritos = [...favoritos];
    newFavoritos.push(viaje);
    setFavoritos(newFavoritos);
  }
  function eliminarDeFavoritos(viaje) {
    const newFavoritos = favoritos.filter((e) => e.id !== viaje.id);
    setFavoritos(newFavoritos);
  }

  return { viajes, favoritos, agregarAFavoritos, eliminarDeFavoritos };
}
