/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class EmployeeClass extends PersonClass {

    private int salary;
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public EmployeeClass() {
    }

    public EmployeeClass(int document, String name, String email, int salary) {
        super(document, name, email);
        this.salary = salary;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void crud_employees() {
        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_program = false;
        //Ciclo para mostrar el menú de opciones
        //while(exit_program == true)
        while (!exit_program) {

            System.out.println(ANSI_PURPLE + "==================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear empleado");
            System.out.println("    2. Consultar empleados de MINTIC.INC");
            System.out.println("    3. Editar empleado");
            System.out.println("    4. Eliminar empleado");
            System.out.println(ANSI_RED + "    5. SALIR" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Ingresa tu respuesta" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            // add(valor) => añadir al final
            // get(indice) => consultar un valor
            // set(indice, valor nuevo) => modificar determinado valor
            // remove(indice) => eliminar determinado valor
            switch (option) {
                case 1:
                    System.out.println(ANSI_RED + "Cuántos empleados deseas añadir?" + ANSI_RESET);
                    int num_employees = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" + ANSI_PURPLE + "==================================================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE EMPLEADOS" + ANSI_RESET);
                    for (int i = 1; i <= num_employees; i++) {
                        System.out.println("\n" + ANSI_BLUE + "       Empleado " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Documento:" + ANSI_RESET);
                        int document = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_BLUE + "Nombre:" + ANSI_RESET);
                        String name = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Email:" + ANSI_RESET);
                        String email = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Salario:" + ANSI_RESET);
                        int salary = Integer.parseInt(inst_datos.nextLine());

                        EmployeeClass employee = new EmployeeClass(document, name, email, salary);
                        employee_list.add(employee);
                        System.out.println(ANSI_RED + "=======================EMPLEADO CREADO CON ÉXITO=======================" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "BASE DE DATOS EMPLEADOS MINTIC.INC" + ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                        EmployeeClass employee = employee_list.get(i);
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee.getSalary());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DE EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN ACTUAL DEL EMPLEADO=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "     Correo: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "     Salario: " + ANSI_RESET + employee.getSalary());
                        System.out.println("Que campo deseas editar?\n      1. Documento\n      2. Nombre\n      3. Correo\n      4. Salario");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Documento nuevo" + ANSI_RESET);
                                int document = Integer.parseInt(inst_datos.nextLine());
                                employee.setDocument(document);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                employee.setName(name);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Correo nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                employee.setEmail(email);
                                break;
                            case 4:
                                System.out.println(ANSI_PURPLE + "Salario nuevo" + ANSI_RESET);
                                int salary = Integer.parseInt(inst_datos.nextLine());
                                employee.setSalary(salary);
                                break;
                        }
                        System.out.println(ANSI_RED + "=================LA INFORMACIÓN DEL EMPLEADO SE HA ACTUALIZADO EXITOSAMENTE=================" + ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPLEADO DE MINTIC.INC" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index_remove);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN DEL EMPLEADO=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Documento: " + ANSI_RESET + employee.getDocument());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println("Estás seguro que deseas eliminar a " + ANSI_BLUE + employee.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            employee_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "=======================CANCELANDO PROCESO=======================" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS EMPLEADOS ACTUALIZADA MINTIC.INC" + ANSI_RESET);
                        for (int i = 0; i < employee_list.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                            EmployeeClass employee_new = employee_list.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + employee_new.getDocument());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee_new.getName());
                            System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + employee_new.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee_new.getSalary());
                        }
                    }

                    break;
                case 5:
                    exit_program=true;
                    System.out.println(ANSI_RED + "=======================SALIENDO DEL PROGRAMA=======================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);
            }
        }
    }
}
