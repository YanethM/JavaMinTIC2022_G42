/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoii_g42;

import class_pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class Principal {
    static Scanner inst_in_data = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    
    public static void crud_employees(){
        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_system = false;
        //while(exit_system == true)
        while(!exit_system){
            System.out.println(ANSI_BLUE + "INGRESA UNA OPCIÓN" + ANSI_RESET);
            System.out.println("    1. Crear empleados");
            System.out.println("    2. Listar empleados");
            System.out.println("    3. Editar empleado específico");
            System.out.println("    4. Eliminar empleado específico");
            System.out.println("    5. " + ANSI_RED + "SALIR" + ANSI_RESET);
            System.out.println("Opción: ");
            int option = Integer.parseInt(inst_in_data.nextLine());
            //add(valor)
            //instancia.get()
            //instancia.set(indice, valor)
            //remove(indice)
            switch(option){
                case 1:
                    System.out.println(ANSI_BLUE + "Cuántos empleados deseas crear? " + ANSI_RESET);
                    int num_employees = Integer.parseInt(inst_in_data.nextLine());
                    System.out.println(ANSI_RED + "INFORMACIÓN DEL EMPLEADO" + ANSI_RESET);
                    for (int i = 1; i <= num_employees; i++) {
                        System.out.println(ANSI_BLUE +"//////////////////////////////Empleado "+ i + "///////////////////////////////"+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Nombre:"+ ANSI_RESET);
                        String name = inst_in_data.nextLine();
                        System.out.println(ANSI_BLUE +"Documento:"+ ANSI_RESET);
                        int document = Integer.parseInt(inst_in_data.nextLine());
                        System.out.println(ANSI_BLUE +"Correo:"+ ANSI_RESET);
                        String email = inst_in_data.nextLine();
                        System.out.println(ANSI_BLUE +"Cargo:"+ ANSI_RESET);
                        String job_p = inst_in_data.nextLine();
                        System.out.println(ANSI_BLUE +"Jerarquía:"+ ANSI_RESET);
                        String level = inst_in_data.nextLine();
                        JobPositionClass job = new JobPositionClass(job_p, level);
                        System.out.println(ANSI_BLUE +"Salario:"+ ANSI_RESET);
                        int salary = Integer.parseInt(inst_in_data.nextLine());
                        EmployeeClass employee = new EmployeeClass(document, name, email, job, salary);
                        employee_list.add(employee);
                    }
                    break;
                    
                case 2:
                    System.out.println("\n" +ANSI_RED +"TOTAL DE EMPLEADOS " + employee_list.size()+ ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println(ANSI_BLUE +"Empleado " + i + ANSI_RESET);
                        EmployeeClass employee = (EmployeeClass)employee_list.get(i);
                        System.out.println(ANSI_BLUE +"Nombre: "+ employee.getName()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Documento: "+ employee.getDocument()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Correo: "+ employee.getCorreo()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Cargo: "+ employee.getJob_position()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Jerarquía: "+ employee.getJob_position()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Salario: "+ employee.getSalary()+ ANSI_RESET);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }
    
    public static void crud_clients(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crud_employees();
        
    }
    
}
