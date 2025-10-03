package Models;

import java.util.ArrayList;

public class Cuenta {
    private int numeroCuenta;
    private float saldo;
    private Usuario usuario;
    private ArrayList<Vehiculo> vehiculos;
    private TipoCuenta tipoCuenta;

    public Cuenta() {}
    public Cuenta(TipoCuenta tipoCuenta, Usuario usuario, float saldo, int numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.vehiculos = new ArrayList<>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void asociarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    public void desasociarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void recargarSaldo(float saldo) {
        this.saldo += saldo;
    }
    public void descontarMoto(float monto) {
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                ", vehiculos=" + vehiculos +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}
