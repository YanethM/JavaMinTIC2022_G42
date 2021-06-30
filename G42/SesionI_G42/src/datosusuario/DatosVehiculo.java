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
public class DatosVehiculo {
    
    public static void main(String[] args) {
        String marca_vehiculo = "Mazda", placa = "TIC202", color = "Rojo";
        int modelo = 2011;
        boolean renovo_soat = true;
      
        //Validar si el usuario no ha renovado el soat se le impone una multa
        if(renovo_soat == false){
            int valor_multa = 600000;
            System.out.println("El dueño del vehiculo con placas " + placa + " debe pagar $"
            + valor_multa);
        }else{
            System.out.println("El vehiculo con placas "+ placa + " tiene la documentación OK");
        }
    }
}
