/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mintic;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author apmejiar
 */
public class Veterinaria_MINTIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamiento de las clases
        MascotaClass inst_mascota = new MascotaClass();
        Date fecha_actual = new Date();
        //Caso 1: obtener la fecha en formato corto dia/mes/año:
        DateFormat formato_corto_fecha = new SimpleDateFormat("dd/MM/yyyy");
        //Mediante la instancia llamamos los métodos set para asignar valor
        inst_mascota.setNombre_mascota("Rocky");
        inst_mascota.setFecha_nacimiento(formato_corto_fecha.format(fecha_actual));
        inst_mascota.setRaza("Golden");
        inst_mascota.setColor("Cáfe");
        inst_mascota.setHistorial_clinico(true);
        inst_mascota.setNro_documento_dueño(999999);
        inst_mascota.setVacunas(false);
        
        //Consultamos el valor de ciertas variables mediante la función GET
        System.out.println("Nombre: " + inst_mascota.getNombre_mascota()+"\nFecha de nacimiento: " 
                + inst_mascota.getFecha_nacimiento()+"\nRaza: "+inst_mascota.getRaza()
                +"\nCuenta con historial clinico: " + inst_mascota.isHistorial_clinico()
                +"\nNúmero de documento dueño de la mascota: " + inst_mascota.getNro_documento_dueño()
                +"\nVacunación al día: " + inst_mascota.isVacunas());
    }
    
}
