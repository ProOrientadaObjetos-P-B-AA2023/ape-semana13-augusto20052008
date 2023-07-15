package paquete004;

public abstract class Pagos {
    private String mes;
    private double pago;
    public Pagos() {
    }
    public Pagos(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public abstract void calcularPago();

    @Override
    public String toString() {
        return "\nPagos\n" +
                "mes='" + mes + '\'' +
                ", pago=" + pago +
                "}\n";
    }
}
