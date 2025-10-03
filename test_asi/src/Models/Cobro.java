package Models;

public class Cobro {
    private int numeroCobro;
    private String fechaCobro;
    private String horaCobro;
    private int monto;
    private MetodoPago metodoPago;

    public Cobro() {}
    public Cobro(int numeroCobro, String fechaCobro, String horaCobro, int monto, MetodoPago metodoPago) {
        this.numeroCobro = numeroCobro;
        this.fechaCobro = fechaCobro;
        this.horaCobro = horaCobro;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public int getNumeroCobro() {
        return numeroCobro;
    }

    public void setNumeroCobro(int numeroCobro) {
        this.numeroCobro = numeroCobro;
    }

    public String getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(String fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public String getHoraCobro() {
        return horaCobro;
    }

    public void setHoraCobro(String horaCobro) {
        this.horaCobro = horaCobro;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "Cobro{" +
                "numeroCobro=" + numeroCobro +
                ", fechaCobro='" + fechaCobro + '\'' +
                ", horaCobro='" + horaCobro + '\'' +
                ", monto=" + monto +
                ", metodoPago=" + metodoPago +
                '}';
    }
}
