package com.mycompany.cafeteriautm;

public class Encargado {

    // Atributos
    private int idEncargado;
    private String nombre;
    private String turno;

    // Constructor
    public Encargado(int idEncargado, String nombre, String turno) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.turno = turno;
    }

    // Getters y Setters
    public int getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(int idEncargado) {
        this.idEncargado = idEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Método para mostrar la información del encargado
    public void mostrarDatosEmpleado() {
        System.out.println("Cve: " + idEncargado
                + " - Nombre: " + nombre
                + " - Turno: " + turno);
    }
}
