package Models;

public class Modelo {
    private String nombre;
    private int ano;

    public Modelo() {}
    public Modelo(String nombre, int ano) {
        this.nombre = nombre;
        this.ano = ano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nombre='" + nombre + '\'' +
                ", ano=" + ano +
                '}';
    }
}
