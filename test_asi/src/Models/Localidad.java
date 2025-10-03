package Models;

public class Localidad {
    private String nombre;
    private int codigoPostal;

    public Localidad() {}
    public Localidad(String nombre, int codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", codigoPostal=" + codigoPostal +
                '}';
    }
}
