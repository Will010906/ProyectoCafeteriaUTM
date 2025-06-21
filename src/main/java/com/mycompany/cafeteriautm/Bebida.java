package com.mycompany.cafeteriautm;

/**
 *
 * @author alcan
 */
public class Bebida extends Producto {
    //Zona de declaración de atributos:
    private int idBebida;
    private float volumen;
    private String sabor;
    private String temperatura;
    
    public Bebida(String nombre, String categoria, float precio, short existencias, float volumen, String tipo, String sabor){
        //Herencia
        super(nombre, (float) precio, categoria, existencias);
        this.volumen= volumen;
        this.sabor = sabor;
        this.temperatura = temperatura;
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

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }
    
}
