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
public class ClientClass extends PersonClass{
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public ClientClass() {
    }
    
    
    public ClientClass(int document, String name, String email) {
        super(document, name, email);
    }
    
    
    public void crud_clients(){
        ArrayList<ClientClass> client_list = new ArrayList<>();
        boolean exit_program = false;
        //Ciclo para mostrar el menú de opciones
        //while(exit_program == true)
        while(!exit_program){
            System.out.println(ANSI_PURPLE+"=================================================================="+ ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ"+ ANSI_RESET);
            System.out.println("    1. Crear cliente");
            System.out.println("    2. Consultar clientes de MINTIC.INC");
            System.out.println("    3. Editar cliente");
            System.out.println("    4. Eliminar cliente");
            System.out.println(ANSI_RED + "    5. SALIR"+ ANSI_RESET);
            System.out.println(ANSI_BLUE +"Ingresa tu respuesta"+ ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            // add(valor) => añadir al final
            // get(indice) => consultar un valor
            // set(indice, valor nuevo) => modificar determinado valor
            // remove(indice) => eliminar determinado valor
            switch(option){
                case 1:
                    System.out.println(ANSI_RED +"Cuántos clientes deseas añadir?"+ ANSI_RESET);
                    int num_clients = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" +ANSI_PURPLE+"=================================================================="+ ANSI_RESET);
                    System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE CLIENTES"+ ANSI_RESET);
                    for (int i = 1; i <= num_clients; i++) {
                        System.out.println("\n" +ANSI_BLUE +"       Cliente " + i +ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Documento:" + ANSI_RESET);
                        int document = Integer.parseInt(inst_datos.nextLine());
                        
                        System.out.println(ANSI_BLUE +"Nombre:" + ANSI_RESET);
                        String name = inst_datos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Email:" + ANSI_RESET);
                        String email = inst_datos.nextLine();
                        
                        
                        ClientClass client = new ClientClass(document, name, email);
                        client_list.add(client);
                        System.out.println(ANSI_RED +"=======================CLIENTE CREADO CON ÉXITO======================="+ ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "BASE DE DATOS EMPLEADOS MINTIC.INC" + ANSI_RESET);
                    for (int i = 0; i < client_list.size(); i++) {
                        System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                        ClientClass client = client_list.get(i);
                        System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + client.getEmail());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DE EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= client_list.size()) {
                        ClientClass client = client_list.get(index);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN ACTUAL DEL EMPLEADO=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "     Correo: " + ANSI_RESET + client.getEmail());
                        
                        System.out.println("Que campo deseas editar?\n      1. Documento\n      2. Nombre\n      3. Correo");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Documento nuevo" + ANSI_RESET);
                                int document = Integer.parseInt(inst_datos.nextLine());
                                client.setDocument(document);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                client.setName(name);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Correo nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                client.setEmail(email);
                                break;
                            default:
                                    System.out.println(ANSI_PURPLE + "OPCIÓN INVÁLIDA" + ANSI_RESET);
                                break;
                        }
                        System.out.println(ANSI_RED + "=================LA INFORMACIÓN DEL CLIENTE SE HA ACTUALIZADO EXITOSAMENTE=================" + ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR CLIENTE DE MINTIC.INC" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= client_list.size()) {
                        ClientClass client = client_list.get(index_remove);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN DEL CLIENTE=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Documento: " + ANSI_RESET + client.getDocument());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + client.getName());
                        System.out.println("Estás seguro que deseas eliminar a " + ANSI_BLUE + client.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            client_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "=======================CANCELANDO PROCESO=======================" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS DE CLIENTES ACTUALIZADA MINTIC.INC" + ANSI_RESET);
                        for (int i = 0; i < client_list.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Cliente " + (i + 1) + ANSI_RESET);
                            ClientClass client_new = client_list.get(i);
                            System.out.println(ANSI_BLUE + "Documento: " + ANSI_RESET + client_new.getDocument());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client_new.getName());
                            System.out.println(ANSI_BLUE + "Correo: " + ANSI_RESET + client_new.getEmail());
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
