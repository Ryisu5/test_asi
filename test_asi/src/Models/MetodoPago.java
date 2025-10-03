package Models;

public class MetodoPago {
    private String siglas;
    private String descripcion;

    public MetodoPago() {}
    public MetodoPago(String siglas, String descripcion) {
        this.siglas = siglas;
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MetodoPago{" +
                "siglas='" + siglas + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
