/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_karimguifarro;

/**
 *
 * @author karim
 */
public class videojuegos {
    String nombre;
    int precio,año_lanzamiento,cantidad;

    public videojuegos(String nombre, int precio, int año_lanzamiento, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.año_lanzamiento = año_lanzamiento;
        this.cantidad = cantidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAño_lanzamiento() {
        return año_lanzamiento;
    }

    public void setAño_lanzamiento(int año_lanzamiento) {
        this.año_lanzamiento = año_lanzamiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return " " + nombre + " " + precio + " " + año_lanzamiento + " " + cantidad;
    }

  
   
    
}
