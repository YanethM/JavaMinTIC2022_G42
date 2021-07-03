/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuario;

/**
 *
 * @author apmejiar
 */
public class DatosUsuario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_formador = "Yaneth Mejía";
        char genero = 'F';
        int edad = 30;
        boolean mujer = true;
        //Validar si el usuario es mayor o menor de edad
        if(edad > 17){
            System.out.println(nombre_formador + " es mayor de edad");
        }else{
            System.out.println(nombre_formador + " es menor de edad");
        }
        //Validar que es mujer y es mayor de edad
        if(genero == 'F' && edad > 17){
            System.out.println(nombre_formador + " es una mujer mayor de edad");
        }else{
            System.out.println(nombre_formador + " no cumple alguna condición");
        }
        //Preguntar si es mujer utilizando la variable booleana
        if(mujer == true){
            System.out.println("Es mujer");
        }else{
            System.out.println("Es hombre");
        }
    }
}
