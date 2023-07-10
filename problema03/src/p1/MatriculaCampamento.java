/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends TipoMatricula {
    double tarifa;
    public double establecerTarifa(){
        // tarifa = costo transporte + costo comida + costo instructores
        return tarifa = 100.2 + 30.2 + 90.2;
    }
}
