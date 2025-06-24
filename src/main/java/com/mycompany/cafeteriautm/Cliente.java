package com.mycompany.cafeteriautm;

public class Cliente {

    // Atributos
    private int idCliente;
    private String nombre;
    private boolean beca;
    private float porcentaje;

    // Constructor
    public Cliente(int idCliente, String nombre, boolean beca, float porcentaje) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.beca = beca;
        this.porcentaje = porcentaje;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Método para mostrar información del cliente
    public void mostrarDatosCliente() {
        System.out.println("Cve: " + idCliente
                + " - Nombre: " + nombre
                + " - Beca: " + beca
                + " - % Beca: " + porcentaje);
    }
    @Override
    public String toString() {
        return "ID: " + idCliente + " - Nombre: " + nombre + " - Beca: " + beca + " - % Beca: " + porcentaje;
    }
}
