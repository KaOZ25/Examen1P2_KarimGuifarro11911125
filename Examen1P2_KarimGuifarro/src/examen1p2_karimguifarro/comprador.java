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
public class comprador extends Usuarios {

    private ArrayList<videojuegos> juegos;
    private int dinero,saldo;
    private String cuenta,personajefav;

    public comprador() {
    }
    public comprador(String nombre, int edad, String usuario, String contraseña,ArrayList<videojuegos> juegos, int dinero, int saldo, String cuenta, String personajefav) {
        super(nombre, edad, usuario, contraseña);
        this.juegos = juegos;
        this.dinero = dinero;
        this.saldo = saldo;
        this.cuenta = cuenta;
        this.personajefav = personajefav;
    }

    

    public ArrayList getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList juegos) {
        this.juegos = juegos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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

    @Override
    public String toString() {
        return super.toString() + "juegos=" + juegos + ", dinero=" + dinero + ", saldo=" + saldo + ", cuenta=" + cuenta + ", personajefav=" + personajefav + '}';
    }

   
    
}
