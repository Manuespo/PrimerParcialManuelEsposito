package com.company;

public class Silla extends Mueble implements Oferta{
    private boolean ruedas;
    public Silla(int stock, String nombre, double precio, boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }

    @Override
    public double precioConDescuento(int descuento) {
        return ((100-descuento)/100)*getPrecio();
    }
}
