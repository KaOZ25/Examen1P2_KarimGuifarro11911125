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
public class Admin extends Usuarios{

    public Admin() {
    }

    public Admin(String nombre, int edad, String usuario, String contraseña) {
        super(nombre, edad, usuario, contraseña);
    }

   

    @Override
    public String toString() {
        return super.toString();
    }
    
}
