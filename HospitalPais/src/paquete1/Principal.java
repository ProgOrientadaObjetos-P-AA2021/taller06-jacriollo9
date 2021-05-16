/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Ciudad;
import paquete2.Enfermo;
import paquete2.Hospital;
import paquete2.Medico;
/**
 *
 * @author Usuario iTC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double sueldo1,sueldo2;
        String nombreDoctor, especialidad;
        Medico [] medico;
        Enfermo [] enfermeras;
        int numero,numero1,numero2;
        String nombreEnfermera, contrato;
        String nombreHospital,direcccion,provincia,ciudad;
        
        System.out.println("\t------BIENVENIDO-------");
        System.out.println("Ingrese el nombre del hospital:");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese la direccion donde se encuentra el hospital:");
        direcccion = entrada.nextLine();
        
        
        System.out.println("Ingrese la ciudad donde se encuentra el hospital:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la Provincia donde se encuentra el hospital:");
        provincia = entrada.nextLine();
        
        
        Ciudad Ciudadd = new Ciudad (ciudad,provincia);
        
        System.out.println("Ingrese el número de especilidades:");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el número de Doctores:");
        numero = entrada.nextInt();
        System.out.println("Ingrese el número de Enfermeras:");
        numero1 = entrada.nextInt();
        
        entrada.nextLine();

        medico = new Medico[numero];
                
        for (int i = 0; i < numero; i++) {
            System.out.printf("Ingrese el nombre del doctor %d\n", i+1);
            nombreDoctor = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual %d\n", i+1);
            sueldo1 = entrada.nextDouble();
            System.out.printf("Ingrese la especialidad %d\n", i+1);
            especialidad = entrada.nextLine();
            entrada.nextLine();

            Medico me = new Medico(nombreDoctor,sueldo1,especialidad);
            
            medico[i] = me;
            
        }
        
        enfermeras = new Enfermo [numero1];
        
        for (int i = 0; i < numero1; i++) {
            System.out.printf("Ingrese el nombre Enfermero %d\n", i+1);
            nombreEnfermera = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual %d\n", i+1);
            sueldo2 = entrada.nextDouble();
            System.out.printf("Ingrese el tipo de contrato %d\n", i+1);
            contrato = entrada.nextLine();
            entrada.nextLine();
        
            Enfermo en = new Enfermo (nombreEnfermera,sueldo2,contrato);
            
            enfermeras [i] = en;
        }
        Hospital hospital = new Hospital(nombreHospital,direcccion,Ciudadd,numero2,enfermeras,medico);

        hospital.establecerTotalSueldos();

        System.out.printf("\n%s\n", hospital); 
    }
}

