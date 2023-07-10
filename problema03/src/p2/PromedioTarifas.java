package p2;

import java.util.ArrayList;
import java.util.List;

public class PromedioTarifas {
    double promedioMatriculas;
    double subpromedio;
    private List<TipoMatricula> matriculas;

    public PromedioTarifas() {
        this.matriculas = new ArrayList<>();
    }

    public void agregarMatricula(TipoMatricula matricula) {
        matricula.establecerTarifa();
        matriculas.add(matricula);
        this.subpromedio += matricula.establecerTarifa();
    }
    public double establecerPromedioTarifas(){
        return promedioMatriculas = subpromedio/matriculas.size();
    }
}
