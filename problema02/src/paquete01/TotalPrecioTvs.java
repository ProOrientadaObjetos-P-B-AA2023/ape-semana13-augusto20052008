package paquete01;

import java.util.ArrayList;

public class TotalPrecioTvs {
    public double totalPrecioTvs(ArrayList<Televisor> t) {
        double s = 0;
        for (Televisor aux : t) {
            s += aux.obtenerPrecio();
        }
        return s;
    }
}
