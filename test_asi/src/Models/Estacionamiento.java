package Models;

import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<PlazaEstacionamiento> plazas;
    private int cantidad;

    public Estacionamiento() {}
    public Estacionamiento(int cantidad) {
        this.cantidad = cantidad;
        this.plazas = new ArrayList<>();

    }

    public ArrayList<PlazaEstacionamiento> getPlazas() {
        return plazas;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void generarPlazas() {
        for (int i = 0; i < this.cantidad; i++) {
            PlazaEstacionamiento p = new PlazaEstacionamiento();
            plazas.add(p);
        }
    }

    @Override
    public String toString() {
        return "Estacionamiento{" +
                "plazas=" + plazas +
                ", cantidad=" + cantidad +
                '}';
    }
}
