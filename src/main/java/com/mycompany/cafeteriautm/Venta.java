package com.mycompany.cafeteriautm;

/**
 *
 * @author alcan
 */
public class Venta {

    //Zona de declaración de atributos:
    private int idVenta;
    private String fecha;
    private String hora;
    private float total;
    private float subtotal;
    private float descuentoBeca;
    private Cliente idCliente;
    private Encargado idEncargado;
    private Pedido pedido;
    //Declaración de ARRAY:

    public Venta(float total, Cliente idCliente, Pedido pedido) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.subtotal = subtotal;
        this.descuentoBeca = descuentoBeca;
        this.idCliente = idCliente;
        this.idEncargado = idEncargado;
        this.pedido = pedido;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Encargado getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(Encargado idEncargado) {
        this.idEncargado = idEncargado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void mostrarVenta() {
        System.out.println("Cve: " + this.idVenta
                + "- Encargado de la venta: " + this.idEncargado.getNombre()
                + "- Nombre: " + this.idCliente.getNombre()
                + "- Fecha: " + this.fecha
                + "- Hora:" + this.hora
                + "- Descuento Beca: " + this.descuentoBeca
                + "- Subtotal: " + this.subtotal
                + "- Total: " + this.total);     
    }
}
