package com.mycompany.cafeteriautm;

/**
 *
 * @author alcan
 */
public class Cliente {
    //Zona de declaración de atributos:
    private int idCliente;
    private String nombre;
    private boolean beca;
    private float porcentaje;
    
    //Constructor

    public Cliente(int idCliente, String nombre, boolean beca, float porcentaje) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.beca = beca;
        this.porcentaje = porcentaje;
    }

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

    void mostrarDatosCliente() {
        System.out.println("Cve" + this.idCliente 
                + "- Nombre:" + this.getNombre() 
                + "- Beca" + this.beca 
                + "- % beca:" + this.porcentaje);
    }
  
    }
    

