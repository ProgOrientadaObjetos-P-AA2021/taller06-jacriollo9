/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class Hospital {

    private String nombreHospital;
    private Ciudad nombreCiudad;
    private int numeroEspecialidades;
    private Medico[] conjuntoMedicos; 
    private Enfermo [] conjuntoEnfermeras;
    private double totalSueldos;
    private String direccionHospital;
    
    public Hospital(String nombre,String direccion, Ciudad ciudad, int numeroespecialidades,
            Enfermo[] conjuntoenfermeros,Medico[] conjuntomedicos){
        nombreHospital = nombre;
        nombreCiudad = ciudad;
        numeroEspecialidades = numeroespecialidades;           
        direccionHospital = direccion;
        conjuntoEnfermeras = conjuntoenfermeros;
        conjuntoMedicos = conjuntomedicos;
                         
    }
    
    public void establecerNombreHospital(String nombrehospital){
        nombreHospital = nombrehospital;
    }
    public void establecerNombreCiudad(Ciudad nombreciudad){
        nombreCiudad = nombreciudad;
    }
    public void establecerNumEspecialidades(int numeroespecialidades){
        numeroEspecialidades = numeroespecialidades;
    }
    public void establecerConjuntoMedicos(Medico[] conjuntomedico){
        conjuntoMedicos = conjuntomedico;
    }
    public void establecerConjuntoEnfermeras(Enfermo [] tipo){
        conjuntoEnfermeras = tipo;
    }
    public void establecerTotalSueldos(){
        double suma = 0;
        double suma2 = 0;
        for (int i = 0; i < obtenerConjuntoMedicos().length; i++) {
            suma = suma + obtenerConjuntoMedicos()[i].obtenerSueldoMensual();
        }
        for (int i = 0; i < obtenerConjuntoEnfermeras().length; i++) {
            suma = suma + obtenerConjuntoEnfermeras()[i].obtenerSueldoEnfermera();
        }
        
        totalSueldos = suma + suma2;
    }
    public void establecerDireccionHospital(String tipo){
        direccionHospital = tipo;
    }
    
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    public Ciudad obtenerNombreCiudad(){
        return nombreCiudad;
    }
    public int obtenernumEspecialidades(){
        return numeroEspecialidades;
    }
    public Medico[] obtenerConjuntoMedicos(){
        return conjuntoMedicos;
    }
    public Enfermo [] obtenerConjuntoEnfermeras(){
        return conjuntoEnfermeras;
    }
    public double obtenerTotalSueldos(){
        return totalSueldos;
    }
    public String obtenerDireccionHospital(){
        return direccionHospital;
    }
    
    @Override
    public String toString(){
        String cadena = "\t------Datos del Hospital------\n";
        cadena = String.format("%s%s\nDirección: %s\nCiudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n"
                + "Listado de médicos\n",cadena,
                obtenerNombreHospital(),obtenerDireccionHospital(),
                obtenerNombreCiudad().obtenerNombreCiudad(),
                obtenerNombreCiudad().obtenerNombreProvincia(),
                obtenernumEspecialidades());
        
        for (int i=0;i<obtenerConjuntoMedicos().length;i++){
            cadena = String.format("%s-%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerConjuntoMedicos()[i].obtenerNombreDoctor(),
                    obtenerConjuntoMedicos()[i].obtenerSueldoMensual(),
                    obtenerConjuntoMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de enfermeros /a(as)",cadena);
        for (int i=0;i<obtenerConjuntoEnfermeras().length;i++){
            cadena = String.format("%s-%s - Sueldo: %.2f - %s\n",cadena,
                    obtenerConjuntoEnfermeras()[i].obtenerNombreEnfermera(),
                    obtenerConjuntoEnfermeras()[i].obtenerSueldoEnfermera(),
                    obtenerConjuntoEnfermeras()[i].obtenerContrato());
        }  
        cadena = String.format("%sEl sueldo total es: %.2f\n",cadena,
                obtenerTotalSueldos());
        return cadena;
    }
}
