package Models;

public class Marca {
    private String siglas;
    private String logo;
    private String nombre;

    public Marca() {}
    public Marca(String siglas, String logo, String nombre) {
        this.siglas = siglas;
        this.logo = logo;
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "siglas='" + siglas + '\'' +
                ", logo='" + logo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
