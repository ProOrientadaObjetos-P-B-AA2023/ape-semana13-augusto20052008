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
public class MatriculaMaternal extends TipoMatricula {
    private double tarifa;
    public double establecerTarifa(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        return tarifa = 50.2 + 40.2 + 80.2;
    }
}