/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.*;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    private Persona persona;
    private GastoPagos gastoPagos;
    private ArrayList<Pagos> listaPagos;
    public BilleteraPagos() {
    }

    public BilleteraPagos(Persona persona, GastoPagos gastoPagos, ArrayList<Pagos> listaPagos) {
        this.persona = persona;
        this.gastoPagos = gastoPagos;
        this.listaPagos = listaPagos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GastoPagos getGastoPagos() {
        return gastoPagos;
    }

    public void setGastoPagos(GastoPagos gastoPagos) {
        this.gastoPagos = gastoPagos;
    }

    public ArrayList<Pagos> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(ArrayList<Pagos> listaPagos) {
        this.listaPagos = listaPagos;
    }
/*    public String toString(){
        *//*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        *//*

        //return "Presentar Reporte";
        return String.format("""
                      *---------- REPORTE ----------*
                      -Cliente: %s %s
                      -Cédula: %s
                      Lista Pagos
                      =======================
                      %s
                      =======================
                      GASTO TOTAL DE PAGOS: %.2f""",
                this.persona.getNombre(),this.persona.getApellido(),
                this.persona.getCedula(),this.getListaPagos().toString(),
                this.getGastoPagos());
    }*/

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", gastoPagos=" + gastoPagos +
                ", listaPagos=\n" + listaPagos +
                '}';
    }
}

