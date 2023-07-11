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
public class PagoAguaPotable extends Pagos{
    private String tipo;
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    public PagoAguaPotable() {
    }
    public PagoAguaPotable(String mes, String tipo, double tarifaFija
            , double metrosCubicosConsumo, double costoConsumoCubicos) {
        super(mes);
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public double getMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void setMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public double getCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void setCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void calcularPago(){
        if(tipo.equals("comercial")){
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15);
        }else{
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos));
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tipo='" + tipo + '\'' +
                ", tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                "} " + super.toString();
    }
}
