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
public class MyFirstProject {

    public static void main(String[] args) {
        System.out.println("hola grupo 44");
//        Tipo de dato nombre variable = valor;
        String nombre_superheroe = "Spyderman";
        char genero = 'M';
        int edad = 32;
        int cant_superpoderes = 3;
        boolean marvel_universe = false;
        //La f al final indica que es tipo de dato float
        float estatura = 1.79f;
        System.out.println("El nombre del superheroe es: " + nombre_superheroe 
                +"\nTiene "+edad +" años y "+ cant_superpoderes + "superpoderes.");
        
        //Validar si el superheroe tiene o no superpoderes
        if(cant_superpoderes > 0){
            System.out.println("Si tiene superpoderes");
        }else{
            System.out.println("No tiene superpoderes");
        }
    }
}
