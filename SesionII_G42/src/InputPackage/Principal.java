/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputPackage;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class Principal {
    //psvm + TAB
    public static void main(String[] args) {
        //Instanciamos la clase ConductorClass
        ConductorDosClass inst_conductor = new ConductorDosClass();
        //Instanciamos la librería Scanner para hacer uso de sus funciones
        System.out.println("Ingresa la información del infractor:");
        Scanner entrada_usuario = new Scanner(System.in);
        //Usuario ingresa cadena de texto
        System.out.println("Nombre: ");
        String nombre_conductor = entrada_usuario.nextLine();
        System.out.println("Tipo de infracción: ");
        String infraccion = entrada_usuario.nextLine();
        //Usuario ingresa números
        System.out.println("Número de documento");
        int nro_documento = entrada_usuario.nextInt();
        System.out.println(inst_conductor.asignar_multa_f(nro_documento, nombre_conductor, infraccion));
    }
}
