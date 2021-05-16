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
public class Enfermo {

    private String nombreEnfermera;
    private String Contrato;
    private double sueldoEnfermera;
    
    public Enfermo(String nombre,double sueldo,String contrato){
        nombreEnfermera = nombre;
        sueldoEnfermera = sueldo;
        Contrato = contrato;
    }
    
    public void establecerNombreEnfermera(String tipo){
        nombreEnfermera = tipo;
    }
    public void establecerContrato(String tipo){
        Contrato = tipo;
    }
    public void establecerSueldoEnfermera(double tipo){
        sueldoEnfermera = tipo;
    }
    
    public String obtenerNombreEnfermera(){
        return nombreEnfermera;
    }
    public String obtenerContrato(){
        return Contrato;
    }
    public double obtenerSueldoEnfermera(){
        return sueldoEnfermera;
    }
}


