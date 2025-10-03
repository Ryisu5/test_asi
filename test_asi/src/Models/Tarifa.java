package Models;

public class Tarifa {
    private float monto;
    private String fechaDesde;
    private String fechaHasta;

    public Tarifa(){}
    public Tarifa(float monto, String fechaDesde, String fechaHasta) {
        this.monto = monto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Tarifa(String fechaDesde, float monto) {
        this.fechaDesde = fechaDesde;
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "Tarifa{" +
                "monto=" + monto +
                ", fechaDesde='" + fechaDesde + '\'' +
                ", fechaHasta='" + fechaHasta + '\'' +
                '}';
    }
}
