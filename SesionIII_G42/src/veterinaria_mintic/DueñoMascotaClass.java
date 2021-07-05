/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mintic;

/**
 *
 * @author apmejiar
 */
public class DueñoMascotaClass {
    private String nombre_dueño;
    private String tipo_documento;
    private int nro_documento;
    private int telefono;
    private String nombre_mascota;

    public DueñoMascotaClass(String nombre_dueño, String tipo_documento, int nro_documento, int telefono, String nombre_mascota) {
        this.nombre_dueño = nombre_dueño;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
        this.telefono = telefono;
        this.nombre_mascota = nombre_mascota;
    }

    
    /**
     * @return the nombre_dueño
     */
    public String getNombre_dueño() {
        return nombre_dueño;
    }

    /**
     * @param nombre_dueño the nombre_dueño to set
     */
    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }
    
    public String consultar_informacion_dueño(){
        return "    El dueño de " + getNombre_mascota() +" es "+ getNombre_dueño() 
                + " identificado con la " + getTipo_documento()
                + " número " + getNro_documento();
    }
    
}
