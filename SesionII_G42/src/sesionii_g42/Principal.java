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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoClass inst_vehiculo = new VehiculoClass();
        ConductorClass inst_conductor = new ConductorClass();
        //Cómo la función recibe dos parametros, los debo inicializar desde acá
        System.out.println(inst_vehiculo.disponibilidad_vehiculo("Mazda", 2021));
        System.out.println(inst_conductor.asignar_multa(1053, "Yaneth", ""));
        inst_conductor.asignar_multa_m(1053, "George", "Exceso de velocidad");
        System.out.println(inst_conductor.asignar_multa_f(1053, "David", "Exceso de velocidad"));
        
    }
   
}
