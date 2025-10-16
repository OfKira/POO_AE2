package com.ofkira.poo;

public class Principal {
    public static void main(String[] args) {
        // Prueba CuentaBancaria (Versión A)
        CuentaBancaria c1 = new CuentaBancaria("Jaime Anchico", "435221", 100.0);
        c1.depositar(50.0); // saldo = 150.0
        c1.retirar(30.0);   // saldo = 120.0
        System.out.println("Resultado cuenta válida: " + c1);

        // Prueba Producto (Versión B)
        Producto p = new Producto("P001", "Lapicero", 2, 25.0); // subtotal = 50.0
        System.out.println("Subtotal inicial: " + p.calcularSubtotal());
        p.aplicarDescuento(10.0); // descuento del 10%
        System.out.println("Después de descuento: subtotal=" + p.calcularSubtotal());
        double totalConImpuesto = p.calcularSubtotal() * 1.08; // impuesto del 8%
        System.out.println("Total con impuesto 8%: " + totalConImpuesto);
    }
}
