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
        //FORMA I:
        //Instanciamiento de las clases
        MascotaEncapsulateFieldsClass inst_mascota = new MascotaEncapsulateFieldsClass();
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
        System.out.println("FORMA I: GETTER y SETTER de variables.\n    Nombre: " + inst_mascota.getNombre_mascota()
                +"\n    Fecha de nacimiento: " + inst_mascota.getFecha_nacimiento()+"\n    Raza: "+inst_mascota.getRaza()
                +"\n    Cuenta con historial clinico: " + inst_mascota.isHistorial_clinico()
                +"\n    Número de documento dueño de la mascota: " + inst_mascota.getNro_documento_dueño()
                +"\n    Vacunación al día: " + inst_mascota.isVacunas());
        
        //FORMA II:
        System.out.println("\nFORMA II: Funciones GETTER y constructor de la clase");
        //String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historial_clinico, int nro_documento_dueño
        MascotaConstructorGetterClass inst_mascota2 = new MascotaConstructorGetterClass("Donatelo",formato_corto_fecha.format(fecha_actual),"Bull terrier",false,true,9999);
        //Consultamos el valor de ciertas variables mediante la función GET
        System.out.println("    Nombre: " + inst_mascota2.getNombre_mascota()
                +"\n    Fecha de nacimiento: " + inst_mascota2.getFecha_nacimiento()
                +"\n    Raza: "+inst_mascota2.getRaza()
                +"\n    Cuenta con historial clinico: " + inst_mascota2.isHistorial_clinico()
                +"\n    Número de documento dueño de la mascota: " + inst_mascota2.getNro_documento_dueño()
                +"\n    Vacunación al día: " + inst_mascota2.isVacunas());
        
        //FORMA III:
        MascotaConstructorEncapsulamientFuncionClass inst_mascota3 = new MascotaConstructorEncapsulamientFuncionClass("Miguel Angel",formato_corto_fecha.format(fecha_actual),"Bull terrier",false,true,123445);
        
        inst_mascota3.consultar_informacion_mascota_metodo();
        System.out.println("\n*****FUNCIÓN******");
        System.out.println(inst_mascota3.consultar_informacion_mascota_funcion());
    }
    
}
