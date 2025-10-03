package Models;

public class TipoDocumento {
    private String siglas;
    private String descripcion;

    public TipoDocumento() {}
    public TipoDocumento(String siglas, String descripcion) {
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
        return "TipoDocumento{" +
                "siglas='" + siglas + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
