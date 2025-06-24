package com.mycompany.cafeteriautm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta {

    // Atributos
    private static int contadorVentas = 1;
    private int idVenta;
    private String fecha;
    private String hora;
    private float total;
    private float subtotal;
    private float descuentoBeca;
    private int idCliente;
    private int idPedido;

    // Constructor
    public Venta(float total, int idCliente, int idPedido) {
        this.idVenta = contadorVentas ++;
        this.total = total;
        this.idCliente = idCliente;
        this.idPedido = idPedido;

        // Asignación automática de fecha y hora al momento de crear la venta
        LocalDateTime now = LocalDateTime.now();
        this.fecha = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.hora = now.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getDescuentoBeca() {
        return descuentoBeca;
    }

    public void setDescuentoBeca(float descuentoBeca) {
        this.descuentoBeca = descuentoBeca;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }
    @Override
    public String toString() {
        return "Venta ID: " + idVenta + " - Pedido: " + idPedido + " - Cliente ID: " + idCliente +
               " - Fecha: " + fecha + " - Hora: " + hora + " - Total: $" + total;
    }

    // Método para mostrar la información de la venta
    public void mostrarVenta() {
        System.out.println("----- Venta -----");
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Fecha: " + fecha + " - Hora: " + hora);
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuentoBeca);
        System.out.println("Total a pagar: $" + total);
    }
}
