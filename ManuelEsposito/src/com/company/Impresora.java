package com.company;

public class Impresora extends ProductoInformatico implements Oferta{
    private int impresionesPorminuto;

    public Impresora(int stock, String nombre, double precio, String nombreFabricante, int impresionesPorminuto) {
        super(stock, nombre, precio, nombreFabricante);
        this.impresionesPorminuto = impresionesPorminuto;
    }

    public int getImpresionesPorminuto() {
        return impresionesPorminuto;
    }

    public void setImpresionesPorminuto(int impresionesPorminuto) {
        this.impresionesPorminuto = impresionesPorminuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesPorminuto=" + impresionesPorminuto +
                "} " + super.toString();
    }

    @Override
    public double precioConDescuento(int descuento) {
        return ((100-descuento)/100)*getPrecio();
    }
}
