package Models;

public class Vehiculo {
    private String matricula;
    private Marca marca;
    private Modelo modelo;

    public Vehiculo(String matricula, Marca marca) {}
    public Vehiculo(String matricula, Marca marca, Modelo modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", modelo=" + modelo +
                '}';
    }
}
