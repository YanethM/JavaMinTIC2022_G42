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
public class MascotaSuperclass {

    //1. Declarar las variables globales con visibilidad private
    //2. Encapsulate fields
    //3. Insertar el constructor de la clase
    //4. Crear la función o el método para consultar la información del objeto
    private String nombre;
    private int codigo_mascota;
    private String raza;
    private LocalDate fecha_nacimiento;
    private int nro_documento;

    public MascotaSuperclass(String nombre, int codigo_mascota, String raza, LocalDate fecha_nacimiento, int nro_documento) {
        this.nombre = nombre;
        this.codigo_mascota = codigo_mascota;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nro_documento = nro_documento;
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo_mascota
     */
    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    /**
     * @param codigo_mascota the codigo_mascota to set
     */
    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the nro_documento
     */
    public int getNro_documento() {
        return nro_documento;
    }

    /**
     * @param nro_documento the nro_documento to set
     */
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }

    /**
     * @return the fecha_nacimiento
     */
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void informacion_mascota(int codigo_mascota){
        if(getCodigo_mascota() == codigo_mascota){
            System.out.println(getNombre() +" " + getFecha_nacimiento() + " " + getRaza() + " "+ getNro_documento());
        }else{
            System.out.println("Mascota no existe en el sistema");
        }
    }
}
