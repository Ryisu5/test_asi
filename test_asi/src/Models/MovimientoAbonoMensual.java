package Models;

public class MovimientoAbonoMensual {
    private float monto;
    private int mes;
    private String fechaPago;
    private Cuenta cuenta;

    public MovimientoAbonoMensual() {
    }

    public MovimientoAbonoMensual(float monto, int mes, String fechaPago, Cuenta cuenta) {
        this.monto = monto;
        this.mes = mes;
        this.fechaPago = fechaPago;
        this.cuenta = cuenta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "MovimientoAbonoMensual{" +
                "monto=" + monto +
                ", mes=" + mes +
                ", fechaPago='" + fechaPago + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
