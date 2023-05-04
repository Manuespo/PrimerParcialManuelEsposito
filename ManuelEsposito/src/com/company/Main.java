package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> productos=new ArrayList<Producto>();
        productos.add(new Silla(3,"Silla Gamer",2300,false));
        productos.add(new Escritorio(5,"Escritoria de Oficina",4000,20,30));
        productos.add(new Impresora(2,"Impresora Hp",3400,"HP",30));
        productos.add(new Notebook(6,"Notebook MSI Kathana",3200,"MSI",564));
        for (Producto producto: productos) {
            System.out.println(producto);
            System.out.println(producto.tipoDeProducto(producto));
        }
        for (int i=0;i< productos.size();i++){
            productos.get(i).actualizarPrecio(productos.get(i));
        }
    }
}
