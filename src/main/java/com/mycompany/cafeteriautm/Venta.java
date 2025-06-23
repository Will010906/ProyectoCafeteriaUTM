package com.mycompany.cafeteriautm;
import java.util.ArrayList;

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
    //Declaración de ARRAY:
    ArrayList<Producto>producto = new ArrayList<>();

    public Venta(int idVenta, String fecha, String hora, float total, float subtotal, float descuentoBeca, Cliente idCliente, Encargado idEncargado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.subtotal = subtotal;
        this.descuentoBeca = descuentoBeca;
        this.idCliente = idCliente;
        this.idEncargado = idEncargado;
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

    public static void main(String[] args) {
    }

}
    
    
    
    

