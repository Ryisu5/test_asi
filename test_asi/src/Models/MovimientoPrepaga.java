package Models;

public class MovimientoPrepaga {
    private float monto;
    private String fecha;
    private String hora;
    private Cuenta cuenta;


    public MovimientoPrepaga() {}
    public MovimientoPrepaga(float monto, String fecha, String hora, Cuenta cuenta) {
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
        this.cuenta = cuenta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "MovimientoPrepaga{" +
                "monto=" + monto +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", cuenta=" + cuenta +
                '}';
    }
}
