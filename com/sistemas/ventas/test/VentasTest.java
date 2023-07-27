package com.sistemas.ventas.test;

import com.sistemas.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 5000.00);
        Producto producto2 = new Producto("Jean", 3700.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
