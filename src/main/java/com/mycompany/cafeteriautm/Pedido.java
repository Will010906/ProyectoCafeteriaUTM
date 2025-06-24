package com.mycompany.cafeteriautm;

import java.util.ArrayList;

public class Pedido {

    // Atributos
    private int idPedido;
    private String fecha;
    private String hora;
    private Cliente idCliente;
    private float descuento;
    private int totalProductos;
    private float subtotal;
    private float total;

    // Listas para los productos
private ArrayList<Comida> productosPedidosComida = new ArrayList<>();
private ArrayList<Integer> productosCantidadPedidosComida = new ArrayList<>();
private ArrayList<Bebida> productosPedidosBebida = new ArrayList<>();
private ArrayList<Integer> productosCantidadPedidosBebida = new ArrayList<>();


    // Constructor vacío
    public Pedido() {
        this.idPedido = 0;
        this.fecha = "";
        this.hora = "";
        this.idCliente = null;
        this.totalProductos = 0;
        this.subtotal = 0;
        this.descuento = 0;
        this.total = 0;
    }

    // Getters y Setters correctos
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public void agregarProductoComida(Comida comida, int cantidad) {
        productosPedidosComida.add(comida);
        productosCantidadPedidosComida.add(cantidad);
    }

    public void agregarProductoBebida(Bebida bebida, int cantidad) {
        productosPedidosBebida.add(bebida);
        productosCantidadPedidosBebida.add(cantidad);
    }

 // Métodos para mostrar la información del pedido
    public void mostrarPedido() {
        System.out.println("Cve Pedido: " + this.idPedido 
            + " - Fecha: " + this.fecha
            + " - Hora: " + this.hora
            + " - Cliente: " + this.idCliente.getNombre());
    }

    public void mostrarPedidoFinal() {
        System.out.println("----- Resumen del Pedido -----");
        System.out.println("Cve Pedido: " + this.idPedido
            + " - Fecha: " + this.fecha
            + " - Hora: " + this.hora
            + " - Cliente: " + this.idCliente);
        System.out.println("Total de productos: " + this.totalProductos);
        System.out.println("Subtotal: $" + this.subtotal);
        System.out.println("Descuento aplicado: $" + this.descuento);
        System.out.println("Total a pagar: $" + this.total);
    }
    @Override
    public String toString() {
        return "Cve Pedido: " + idPedido +
                " - Fecha: " + fecha +
                " - Hora: " + hora +
                " - Cliente: " + idCliente;
    }
}