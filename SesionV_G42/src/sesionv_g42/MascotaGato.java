/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g42;

import java.time.LocalDate;

/**
 *
 * @author apmejiar
 */
public class MascotaGato extends MascotaSuperclass{
    
    public MascotaGato(String nombre, int codigo_mascota, String raza, LocalDate fecha_nacimiento, int nro_documento) {
        super(nombre, codigo_mascota, raza, fecha_nacimiento, nro_documento);
    }
    
    public void edit_gato(String nombre, int codigo_mascota, String raza, LocalDate fecha_nacimiento, int nro_documento){
        setNombre(nombre);
        setCodigo_mascota(codigo_mascota);
        setRaza(raza);
        setFecha_nacimiento(fecha_nacimiento);
        setNro_documento(nro_documento);
    }
    
}
