/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pagos {
    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;
    public PagoTelefonoConvencional() {
    }
    public PagoTelefonoConvencional(String mes, double tarifa, double minutosConsumidos, double costoMinuto) {
        super(mes);
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void setMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }
    public void calcularPago(){
        super.setPago(this.tarifa + (this.minutosConsumidos * this.costoMinuto));
    }
}
