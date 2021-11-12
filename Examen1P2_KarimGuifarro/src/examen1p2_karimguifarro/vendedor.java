/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class vendedor extends Usuarios{
    String cuenta,personajefav;
    int estrellas,dinero;
    ArrayList<videojuegos> jvendidos,jventa;

    public vendedor() {
    }

    public vendedor(String nombre, String usuario, String contraseña, int edad,String cuenta, String personajefav, int estrellas, int dinero, ArrayList<videojuegos> jvendidos, ArrayList<videojuegos> jventa) {
        super(nombre, usuario, contraseña, edad);
        this.cuenta = cuenta;
        this.personajefav = personajefav;
        this.estrellas = estrellas;
        this.dinero = dinero;
        this.jvendidos = jvendidos;
        this.jventa = jventa;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPersonajefav() {
        return personajefav;
    }

    public void setPersonajefav(String personajefav) {
        this.personajefav = personajefav;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<videojuegos> getJvendidos() {
        return jvendidos;
    }

    public void setJvendidos(ArrayList<videojuegos> jvendidos) {
        this.jvendidos = jvendidos;
    }

    public ArrayList<videojuegos> getJventa() {
        return jventa;
    }

    public void setJventa(ArrayList<videojuegos> jventa) {
        this.jventa = jventa;
    }

    @Override
    public String toString() {
        return super.toString() + "cuenta=" + cuenta + ", personajefav=" + personajefav + ", estrellas=" + estrellas + ", dinero=" + dinero + ", jvendidos=" + jvendidos + ", jventa=" + jventa + '}';
    }
    
    
}
