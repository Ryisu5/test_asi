package Models;

public class PlazaEstacionamiento {
    private int numeroPlazaEstacionamiento;
    private Estado estado;
    private String fecha;
    private String hora;
    private String observaciones;

    public PlazaEstacionamiento() {}
    public PlazaEstacionamiento(int numeroPlazaEstacionamiento, Estado estado, String fecha, String hora) {
        this.numeroPlazaEstacionamiento = numeroPlazaEstacionamiento;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumeroPlazaEstacionamiento() {
        return numeroPlazaEstacionamiento;
    }

    public void setNumeroPlazaEstacionamiento(int numeroPlazaEstacionamiento) {
        this.numeroPlazaEstacionamiento = numeroPlazaEstacionamiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "PlazaEstacionamiento{" +
                "numeroPlazaEstacionamiento=" + numeroPlazaEstacionamiento +
                ", estado=" + estado +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
