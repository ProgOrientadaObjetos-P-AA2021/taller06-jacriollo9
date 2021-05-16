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
public class Medico {

    private String nombreDoctor;
    private String Especialidad;
    private double sueldoMensual;

    public Medico(String nombre,double sueldo,String especialidades){
        nombreDoctor = nombre;
        Especialidad = especialidades;
        sueldoMensual = sueldo;
    }

    
    public void establecerNombreDoctor(String n){
        nombreDoctor = n;
    }
    public void establecerEspecialidad(String n){
        Especialidad = n;
    }
    public void establecerSueldoMensual(double n){
        sueldoMensual = n;
    }
    
    public String obtenerNombreDoctor(){
        return nombreDoctor;
    }
    public String obtenerEspecialidad(){
        return Especialidad;
    }
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}