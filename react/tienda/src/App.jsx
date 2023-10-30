import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import Footer from "./components/Footer";
import Header from "./components/Header";
import Trips from "./components/Trips";
import useTrip from "./hooks/useTrip";

function App() {
  const { viajes, favoritos, agregarAFavoritos, eliminarDeFavoritos } =
    useTrip();

  return (
    <BrowserRouter>
      <Header />
      <Routes>
        {/* <Route path="/" element={<h1>Cipoleti Travels</h1>} /> */}
        <Route
          path="/"
          element={
            <Trips
              viajes={viajes}
              agregarAFavoritos={agregarAFavoritos}
              eliminarDeFavoritos={eliminarDeFavoritos}
            />
          }
        />
        <Route
          path="/favoritos"
          element={
            <Trips
              viajes={favoritos}
              agregarAFavoritos={agregarAFavoritos}
              eliminarDeFavoritos={eliminarDeFavoritos}
            />
          }
        />
        <Route path="/viaje/:id" element={<Trips />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
