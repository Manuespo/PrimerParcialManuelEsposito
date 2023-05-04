package com.company;

public abstract class Producto {
    private int stock;
    private String nombre;
    private double precio;

    public Producto(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String tipoDeProducto(Producto producto)
    {
        if (producto instanceof Silla)
            return "Silla";
        else if (producto instanceof Escritorio)
            return "Escritorio";
        else if (producto instanceof Impresora)
            return "Impresora";
        else if (producto instanceof Notebook)
            return "Notebook";
        else return "";
    }
    public void actualizarPrecio(Producto producto)
    {
        System.out.println("Precio sin aumento "+getPrecio());
        if (producto instanceof Silla)
        {
            precio=((Silla) producto).precioConDescuento(-5);
        }
        else if (producto instanceof Escritorio) {
            precio=(110/100)*precio;
        }
        else if (producto instanceof Impresora)
            precio=(115/100)*precio;
        else if (producto instanceof Notebook)
            precio= (120/100)*precio;
        System.out.println("Precio con aumento "+precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre=" + nombre +
                ", precio=" + precio +
                '}';
    }
}
