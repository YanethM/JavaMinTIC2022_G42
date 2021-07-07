/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoproject_g42;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class VehiculoProject_G42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cuando trabajamos con fechas, debemos instanciar la clase Date
        Date inst_fecha_actual = new Date();
        Scanner inst_scanner = new Scanner(System.in);
        //Modificamos el formato largo de la fecha utilizando la clase SimpleDateFormat
        SimpleDateFormat inst_cambiar_formato1 = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat inst_cambiar_formato2 = new SimpleDateFormat("dd-MM-yy");
        // 1. Instanciar la clase vehiculo
        VehiculoClass inst_vehiculo = new VehiculoClass("MIN2021", "MisiónTIC", 2022, 2000, false, inst_cambiar_formato1.format(inst_fecha_actual));
        //2. Mediante la instancia accedemos a las funciones o métodos de la clase
        System.out.println(inst_vehiculo.funcion_consultar_info_v());
        inst_vehiculo.metodo_consultar_info_v();
        
        //Consultar por placa de vehiculo
        System.out.println("\nIngrese la placa a consultar:");
        String placa_consultar = inst_scanner.nextLine();
        inst_vehiculo.metodo_consulta_vehiculo_por_placa(placa_consultar);
        
    }
    
}
