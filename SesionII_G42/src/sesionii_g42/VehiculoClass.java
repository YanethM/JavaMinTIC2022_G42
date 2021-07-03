/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii_g42;

/**
 *
 * @author apmejiar
 */
public class VehiculoClass {
    //Declarar las siguientes variables: marca, placa, modelo, color, cilindraje, disponibilidad
    String marca = "Mazda", placa = "MIN202", color = "Rose";
    int modelo = 2022, cilindraje = 2000;
    boolean disponibilidad = true;
    
    //Función que retorna si la marca y el modelo del vehiculo se encuentra disponible 
    public boolean disponibilidad_vehiculo(String marca_vehiculo, int modelo_v){
        if(marca_vehiculo == marca && modelo_v == modelo){
            disponibilidad = true;
        }else{
            //Mostrar mensaje informativo al usuario que indique la marca y el modelo disponible
            System.out.println("Sólo tenemos disponibles vehiculos con las siguientes "
                    + "caracteristicas: " + marca + " modelo " + modelo);
            disponibilidad= false;
        }
        return disponibilidad;
    }
    
    
}
