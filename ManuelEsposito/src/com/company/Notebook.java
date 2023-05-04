package com.company;

public class Notebook extends ProductoInformatico{
    private int memoria;

    public Notebook(int stock, String nombre, double precio, String nombreFabricante, int memoria) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
}
