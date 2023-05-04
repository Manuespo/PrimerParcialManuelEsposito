package com.company;

public abstract class ProductoInformatico extends Producto {
    private String nombreFabricante;


    public ProductoInformatico(int stock, String nombre, double precio, String nombreFabricante) {
        super(stock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }
}
