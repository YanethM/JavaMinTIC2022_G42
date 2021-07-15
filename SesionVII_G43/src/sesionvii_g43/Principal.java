/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionvii_g43;

import class_pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class Principal {
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
 
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeClass employee = new EmployeeClass();
        ClientClass client = new ClientClass();
        System.out.println(ANSI_BLUE+"=================================================================="+ ANSI_RESET);
        System.out.println(ANSI_BLUE +"MINTIC.INC 2021"+ ANSI_RESET);
        System.out.println(ANSI_BLUE+"=================================================================="+ ANSI_RESET);
        System.out.println("Deseas trabajar con:\n      1. Empleados\n      2. Clientes");
        int option = Integer.parseInt(inst_datos.nextLine());
        if(option == 1){
            employee.crud_employees();
        }else if(option == 2){
            client.crud_clients();
        }else{
            System.out.println(ANSI_RED + "OPCIÓN INVÁLIDA"+ ANSI_RESET);
        }
    }
    
}
