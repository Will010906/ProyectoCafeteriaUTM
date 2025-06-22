package com.mycompany.cafeteriautm;

/**
 *Diaz Mozqueda Ivana Yamilet
 *Lobato Alcantar Wilmer Ernesto
 *Urueta Rodrigez Andrea
 * @author alcan
 */
public class Producto {
     String nombre;
     float precio;
     String categoria;
     short existencias;
    //Constructor
    public Producto(String nombre, float precio, String categoria, short existencias){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.existencias = existencias;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public short getExistencias() {
        return existencias;
    }
    
 }
    

