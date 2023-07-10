/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.PromedioTarifas;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        PromedioTarifas promedioTarifas1 = new PromedioTarifas();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcolegio = new MatriculaColegio();
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();

        promedioTarifas1.agregarMatricula(mcamp);
        promedioTarifas1.agregarMatricula(mcolegio);
        promedioTarifas1.agregarMatricula(mescuela);
        promedioTarifas1.agregarMatricula(mjardin);
        promedioTarifas1.agregarMatricula(mmaternal);
        promedioTarifas1.agregarMatricula(mmaternal2);


        System.out.printf("%.2f\n", promedioTarifas1.establecerPromedioTarifas());
    }
}
