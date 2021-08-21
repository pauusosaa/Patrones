package Facade.facade;

import Facade.api.Avion;
import Facade.api.Hotel;

public class CheckFacade {
    private Avion avionAPI;
    private Hotel hotelAPI;
    public CheckFacade(){
        avionAPI = new Avion();
        hotelAPI = new Hotel();
    }
    public void buscar (String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
    }
}
