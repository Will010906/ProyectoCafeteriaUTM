package com.mycompany.cafeteriautm;
import java.util.ArrayList;

/**
 *
 * @author alcan
 */
public class Pedido {
    //Zona de declaración de atributos:
    Pedido idPedido;
    String fecha;
    String hora;
    Cliente idCliente;
    float descuento;
    int totalProductos;
    float subtotal;
    float total;
    
    //Declaración de ARRAYS
    ArrayList<Comida>productosPedidosComida = new ArrayList<>();
    ArrayList<Integer>productosCantidadPedidosComida = new ArrayList<>();
    ArrayList<Bebida>productosPedidosBebida = new ArrayList<>();
    ArrayList<Integer>productosCantidadPedidosBebida = new ArrayList<>();
    
    //Constructor
    public Pedido(Pedido idPedido, String fecha, String hora, Cliente idCliente, int totalProductos, float subtotal) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.hora = hora;
        this.idCliente = idCliente;
        this.totalProductos = totalProductos;
        this.subtotal = subtotal;
    }
       public Pedido() {
        this.idPedido = null;
        this.fecha = "";
        this.hora = "";
        this.idCliente = null;
        this.totalProductos = 0;
        this.subtotal = 0;
       }
       
    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
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

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    void mostrarPedidoFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
  
    }

    
    

