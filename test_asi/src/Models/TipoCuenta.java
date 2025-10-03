package Models;

public class TipoCuenta {
    private String descripcion;


    public TipoCuenta() {}
    public TipoCuenta(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoCuenta{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
