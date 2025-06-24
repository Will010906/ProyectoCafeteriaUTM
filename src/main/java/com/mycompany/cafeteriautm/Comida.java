package com.mycompany.cafeteriautm;

public class Comida extends Producto {

    // Atributos
    private int idComida;
    private String ingredientes;
    private String porcion;
    private boolean disponibilidad;

    // Constructor
    public Comida(String nombre, String categoria, float precio, short existencias, String ingredientes, String porcion) {
        super(nombre, precio, categoria, existencias);
        this.ingredientes = ingredientes;
        this.porcion = porcion;
        this.disponibilidad = true; // Puedes inicializarlo en true por defecto
    }

    // Getters y Setters propios de Comida
    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
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
    @Override
    public String toString() {
        return getNombre() + " - " + porcion + " - $" + getPrecio();
    }

    // Métodos para mostrar la información
    public void mostrarDatosComida() {
        System.out.println("Nombre: " + getNombre()
                + " - Precio: " + getPrecio()
                + " - Ingredientes: " + ingredientes
                + " - Porción: " + porcion
                + " - Existencias: " + getExistencias());
    }

    public void mostrarResumenDatosComida() {
        System.out.println("Nombre: " + getNombre()
                + " - Precio: " + getPrecio());
    }
}
