import Trip from "./Trip";

export default function Trips({
  viajes,
  agregarAFavoritos,
  eliminarDeFavoritos,
}) {
  return (
    <div className="viajes">
      {viajes.length > 0 ? (
        viajes.map((viaje) => (
          <Trip
            key={viaje.id}
            viaje={viaje}
            agregarAFavoritos={agregarAFavoritos}
            eliminarDeFavoritos={eliminarDeFavoritos}
          />
        ))
      ) : (
        <p>No hay viajes favoritos</p>
      )}
    </div>
  );
}
