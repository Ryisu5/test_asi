package Models;

public class TipoUsuario {
    private String siglas;
    private String descripcion;
    private float modificadorMonto;
    private String fachaInicio;
    private String fachaFin;

    public TipoUsuario() {}
    public TipoUsuario(String siglas, String descripcion, float modificadorMonto, String fachaInicio) {
        this.siglas = siglas;
        this.descripcion = descripcion;
        this.modificadorMonto = modificadorMonto;
        this.fachaInicio = fachaInicio;
    }

    public TipoUsuario(String siglas, String descripcion, float modificadorMonto, String fachaInicio, String fachaFin) {
        this.siglas = siglas;
        this.descripcion = descripcion;
        this.modificadorMonto = modificadorMonto;
        this.fachaInicio = fachaInicio;
        this.fachaFin = fachaFin;
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

    public float getModificadorMonto() {
        return modificadorMonto;
    }

    public void setModificadorMonto(float modificadorMonto) {
        this.modificadorMonto = modificadorMonto;
    }

    public String getFachaInicio() {
        return fachaInicio;
    }

    public void setFachaInicio(String fachaInicio) {
        this.fachaInicio = fachaInicio;
    }

    public String getFachaFin() {
        return fachaFin;
    }

    public void setFachaFin(String fachaFin) {
        this.fachaFin = fachaFin;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" +
                "siglas='" + siglas + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", modificadorMonto=" + modificadorMonto +
                ", fachaInicio='" + fachaInicio + '\'' +
                ", fachaFin='" + fachaFin + '\'' +
                '}';
    }
}
