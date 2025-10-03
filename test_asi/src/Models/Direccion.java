package Models;

public class Direccion {
    private int numeroCalle;
    private Calle calle;
    private Direccion direccion;
    private Localidad localidad;
    private Provincia provincia;

    public Direccion() {}
    public Direccion(int numeroCalle, Calle calle, Direccion direccion, Localidad localidad, Provincia provincia) {
        this.numeroCalle = numeroCalle;
        this.calle = calle;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public Calle getCalle() {
        return calle;
    }

    public void setCalle(Calle calle) {
        this.calle = calle;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "numeroCalle=" + numeroCalle +
                ", calle=" + calle +
                ", direccion=" + direccion +
                ", localidad=" + localidad +
                ", provincia=" + provincia +
                '}';
    }
}
