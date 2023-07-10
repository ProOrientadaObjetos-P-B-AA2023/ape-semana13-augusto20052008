package paquete01;

import java.util.ArrayList;

public class ListaMarcasTelevisores {
    public String listaMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (Televisor aux : t) {
            s = String.format("%s%s\n", s,aux.obtenerMarca());
        }
        return s;
    }
}
