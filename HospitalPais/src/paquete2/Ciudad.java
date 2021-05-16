/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author bitxanax
 */
public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;
    
    public Ciudad(String nombre,String provincia){
        nombreCiudad = nombre;
        nombreProvincia = provincia;
    }
    
    public void establcerNombreCiudad(String n){
        nombreCiudad = n;
    }
    public void establecerNombreProvincia(String n){
        nombreProvincia = n;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    
}