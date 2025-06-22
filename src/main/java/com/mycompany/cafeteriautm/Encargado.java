package com.mycompany.cafeteriautm;

/**
 *
 * @author alcan
 */
public class Encargado {

    public Encargado(int idEncargado, String nombre, String turno) {
    }
    private int idEncargado;
    private String nombre;
    private String turno;
    

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

    void mostrarDatosEmpleado() {
        System.out.println("Cve" + this.getIdEncargado() + "- Nombre" + this.getNombre() + "- Turno:" + this.getTurno());
    }
    
}
