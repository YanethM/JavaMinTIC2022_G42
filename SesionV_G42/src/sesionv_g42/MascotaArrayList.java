/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g42;

import java.util.ArrayList;

/**
 *
 * @author apmejiar
 */
public class MascotaArrayList {
    //Tipo de colección que permite añadir, eliminar, consultar, editar valores del mismo tipo de dato
    
    ArrayList<String> nombre_mascotas = new ArrayList<>();
    //Función que permite añadir elementos al arraylist
    public ArrayList añadir_nombres_mascotas(){
        nombre_mascotas.add("Milu");
        nombre_mascotas.add("Tobby");
        nombre_mascotas.add("Dante");
        nombre_mascotas.add("Donatelo");
        nombre_mascotas.add("Año nuevo");
        nombre_mascotas.add("Año viejo");
        return nombre_mascotas;
    }
    
    public ArrayList modificar_nombre_mascota(){
        nombre_mascotas.set(3,"Bobbie");
        return nombre_mascotas;
    }
    
    public void consultar_cantidad_elementos(){
        System.out.println(nombre_mascotas.size());
    }
    
    public void eliminar_elemento(int posicion_eliminar){
        if(posicion_eliminar >= 0 && posicion_eliminar < nombre_mascotas.size()){
            nombre_mascotas.remove(posicion_eliminar);
            System.out.println(nombre_mascotas);
        }else{
            System.out.println("Posición ingresada es no válida");
        }
    }
    
    public void consultar_elemento(int posicion_consultar){
        if(posicion_consultar >= 0 && posicion_consultar < nombre_mascotas.size()){
            System.out.println(nombre_mascotas.get(posicion_consultar));
        }else{
            System.out.println("Posición ingresada es no válida");
        }
    }
    public void lista_vacía(){
        System.out.println(nombre_mascotas.isEmpty());
    }
}
