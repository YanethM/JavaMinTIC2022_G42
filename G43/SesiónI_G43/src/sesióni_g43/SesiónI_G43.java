/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesióni_g43;

/**
 *
 * @author apmejiar
 */
public class SesiónI_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        String nombre_superheroe = "Spyderman";
        int edad = 30;
        boolean universo_marvel = true;
        char genero = 'M';
        float peso = 87.5f;
        //System.out.println("Nombre del superheroe es " + nombre_superheroe + "\n"+"tiene " + edad + " años");
        //Primer condicional, validar si es mayor o menor de edad:
        if(edad > 17){
            System.out.println(nombre_superheroe +" es mayor de edad");
        }else{
            System.out.println(nombre_superheroe +" es menor de edad");
        }
        
        //Validar si pertenece o no al universo de marvel
        if(universo_marvel == true){
            System.out.println("y pertenece al universo de Marvel");
        }else{
            System.out.println("no pertenece al universo de Marvel");
        }
        
        //Validar si es mayor de edad y pertenece al universo de marvel
        //En Java para concatenar condiciones no se utiliza AND, si no &&
        if(edad > 17 && universo_marvel == true){
            System.out.println(nombre_superheroe + " es mayor de edad y pertenece a Marvel");
        }else{
            System.out.println(nombre_superheroe +" no cumple alguna de las condiciones");
        }
    }
}
