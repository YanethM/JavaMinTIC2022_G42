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
public class DueñoMascota {
    private String nombre;
    private String tipo_documento;
    private int nro_documento;
    private int codigo_mascota;

    public DueñoMascota(String nombre, String tipo_documento, int nro_documento) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
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
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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
    
    //Consultar las mascotas asignadas al dueño por su nro de documento
    public void consultar_informacion_dueño(int nro_documento_dueño){
        if(getNro_documento() == nro_documento_dueño){
            System.out.println(getNombre() +" " + getTipo_documento() +" " +getNro_documento());
        }
    }
}
