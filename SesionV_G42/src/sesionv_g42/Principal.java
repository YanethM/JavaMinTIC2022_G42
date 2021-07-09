/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g42;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        LocalDate fecha_nacimiento_perro = LocalDate.of(2016, Month.JUNE, 3);
//        //Inicialización de parametros con el constructor
//        MascotaSuperclass inst_mascota1 = new MascotaSuperclass("Milú",1,"Labrador",fecha_nacimiento_perro,1053811);
//        MascotaSuperclass inst_mascota2 = new MascotaSuperclass("Tobby", 2, "Husky", LocalDate.of(2018, Month.MARCH, 14), 12351);
//        //Modificar la raza de la mascota
//        inst_mascota1.setRaza("Golden Retriver");
//        int codigo_mascota = 1;
//        inst_mascota1.informacion_mascota(codigo_mascota);
//        inst_mascota2.informacion_mascota(codigo_mascota);
          MascotaPerro inst_perro = new MascotaPerro("Milú",1,"Labrador",LocalDate.of(2016, Month.NOVEMBER, 14),1053811);
          MascotaGato inst_gato = new MascotaGato("Tobby", 1, "Husky", LocalDate.of(2018, Month.MARCH, 14), 12351);
          DueñoMascota inst_dueño = new DueñoMascota("Juan", "C.C.", 1053811);
          MascotaArrayList inst_mascota = new MascotaArrayList();
          
          inst_gato.edit_gato("Año Nuevo", 2, "Persia", LocalDate.of(2010, Month.JANUARY, 1), 1053811);
          inst_gato.edit_gato("Año Viejo", 3, "Criollo", LocalDate.of(2009, Month.DECEMBER, 31), 1053811);
          inst_gato.informacion_mascota(3);
          inst_dueño.consultar_informacion_dueño(1053811);
          System.out.println(inst_mascota.añadir_nombres_mascotas());
          System.out.println(inst_mascota.modificar_nombre_mascota());
          inst_mascota.consultar_cantidad_elementos();
          inst_mascota.eliminar_elemento(3);
          inst_mascota.consultar_elemento(1);
          inst_mascota.lista_vacía();
    }
    
}
