package Models;

public class Usuario {
    private int legajo;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private int nroDocumento;
    private Direccion direccion;
    private TipoUsuario tipoUsuario;

    public Usuario() {}
    public Usuario(int legajo, String nombre, String apellido, TipoDocumento tipoDocumento, int nroDocumento, Direccion direccion) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.direccion = direccion;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", nroDocumento=" + nroDocumento +
                ", direccion=" + direccion +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }
}
