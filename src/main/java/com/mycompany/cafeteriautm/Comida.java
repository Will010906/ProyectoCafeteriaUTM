package com.mycompany.cafeteriautm;
/**
 *
 * @author alcan
 */
public class Comida extends Producto{
    //Zona de declaración de atributos:
    private int idComida;
    private String ingredientes;
    private String porcion;
    private boolean disponibilidad;
    //Constructor
    public Comida(String nombre, String categoria, float precio, short existencias, String ingredientes, String descripcion){
        //Herencia
        super(nombre, (float) precio, categoria, existencias);
        this.ingredientes = ingredientes;
        this.porcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPorcion() {
        return porcion;
    }

    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }


    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public short getExistencias() {
        return existencias;
    }

    public void setExistencias(short existencias) {
        this.existencias = existencias;
    }
    public void mostrarDatosComida(){
        System.out.println("Nombre:" + this.getNombre()
                + "- Precio: " + this.getPrecio()
                + "- Ingredientes: " + this.getIngredientes()
                + "- Porcion: " + this.getPorcion()
                + "- Existencias: " + this.getExistencias());
    }
    public void mostrarResumenDatosComida(){
        
    }
    }

