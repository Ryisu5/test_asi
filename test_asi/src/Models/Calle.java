package Models;

public class Calle {
    private String nombre;

    public Calle() {}
    public Calle(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Calle{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
