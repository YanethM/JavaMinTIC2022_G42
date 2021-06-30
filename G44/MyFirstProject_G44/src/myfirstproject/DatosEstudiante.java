/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

/**
 *
 * @author apmejiar
 */
public class DatosEstudiante {
    public static void main(String[] args) {
        String nombre = "Yaneth";
        int edad = 30;
        boolean mujer = false;
        
        //Validar si es mayor de edad:
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
        //Validar si es mujer o es hombre:
        if(mujer == false){
            System.out.println("Es de género masculino");
        }else{
            System.out.println("Es de género femenino");
        }
        
        //Validar si es mujer mayor de edad
        //No se concatena con AND si no con doble &
        if((edad >= 18)&&(mujer == true)){
            System.out.println("Es una mujer mayor de edad");
        }else{
            System.out.println("No cumple alguna de las validaciones");
        }
        
//        if(CONDICIÓN I){
//            //INSTRUCCIÓN...
//        }else if(CONDICIÓN II){
//            //INSTRUCCIÓN...
//        }else{
//            //INSTRUCCIÓN...
//        }
    }
}
