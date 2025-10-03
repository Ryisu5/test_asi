package Models;

public class IngresoEgreso {
    private String fechaIngreso;
    private String horaIngreso;
    private String fechaEgreso;
    private String horaEgreso;
    private Vehiculo vehiculo;
    private Cuenta cuenta;
    private Tarifa tarifa;
    private PlazaEstacionamiento plazaEstacionamiento;

    public IngresoEgreso() {}

    public IngresoEgreso(String fechaIngreso, String horaIngreso, Vehiculo vehiculo, Cuenta cuenta, Tarifa tarifa, PlazaEstacionamiento plazaEstacionamiento) {
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.vehiculo = vehiculo;
        this.cuenta = cuenta;
        this.tarifa = tarifa;
        this.plazaEstacionamiento = plazaEstacionamiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getHoraEgreso() {
        return horaEgreso;
    }

    public void setHoraEgreso(String horaEgreso) {
        this.horaEgreso = horaEgreso;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public PlazaEstacionamiento getPlazaEstacionamiento() {
        return plazaEstacionamiento;
    }

    public void setPlazaEstacionamiento(PlazaEstacionamiento plazaEstacionamiento) {
        this.plazaEstacionamiento = plazaEstacionamiento;
    }

    //falta implementacion de metodos
}
