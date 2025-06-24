package com.mycompany.cafeteriautm;

public class Bebida extends Producto {

    // Atributos propios de Bebida
    private int idBebida;
    private float volumen;
    private String sabor;
    private String temperatura;

    // Constructor
    public Bebida(String nombre, String categoria, float precio, short existencias, float volumen, String sabor, String temperatura) {
        super(nombre, precio, categoria, existencias);
        this.volumen = volumen;
        this.sabor = sabor;
        this.temperatura = temperatura;
    }

    // Getters y Setters
    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    

    // Métodos para mostrar información
    public void mostrarDatosBebida() {
        System.out.println("Nombre: " + getNombre()
                + " - Precio: " + getPrecio()
                + " - Sabor: " + sabor
                + " - Volumen: " + volumen + " ml"
                + " - Temperatura: " + temperatura
                + " - Existencias: " + getExistencias());
    }

    public void mostrarResumenDatosBebida() {
        System.out.println("Nombre: " + getNombre()
                + " - Precio: " + getPrecio()
                + " - Sabor: " + sabor);
    }
}
