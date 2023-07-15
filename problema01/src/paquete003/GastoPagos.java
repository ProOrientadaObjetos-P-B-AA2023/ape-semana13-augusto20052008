package paquete003;

import paquete004.Pagos;

import java.util.ArrayList;

public class GastoPagos {
    private ArrayList<Pagos> listaPagos;
    private double total;
    public GastoPagos() {
    }
    public GastoPagos(ArrayList<Pagos> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public ArrayList<Pagos> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(ArrayList<Pagos> listaPagos) {
        this.listaPagos = listaPagos;
    }

    public double getSubtotal() {
        return total;
    }

    public void setSubtotal(double total) {
        this.total = total;
    }
    public void calcularGastoPagos(){
        for (Pagos aux: listaPagos) {
            total += aux.getPago();
        }
    }

    @Override
    public String toString() {
        return "\nGastoPagos{"+
                ", total=" + total +
                "}\n";
    }
}
