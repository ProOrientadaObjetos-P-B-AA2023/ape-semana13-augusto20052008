package paquete01;

import java.util.ArrayList;

public class TelevisorMasCaro {
    public double televisorMasCaro(ArrayList<Televisor> t){
        double s = 0;
        String marTeleCara = "";
        // pass
        for (Televisor aux : t) {
            if (s < aux.obtenerPrecio()){
                s = aux.obtenerPrecio();
                marTeleCara = aux.obtenerMarca();
            }
        }
        return s;
    }
}
