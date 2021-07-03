/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniii_g44;

import java.util.Date;

/**
 *
 * @author apmejiar
 */
public class MascotaGetSetClass {
    private String nombre_mascota;
    private Date fecha_nacimiento;
    private boolean historial_clinico;
    private String raza;
    private char sexo;
    private int nro_documento_dueño;

    //Encupsalamiento de un atributo:
    //Función GET que retorna el valor del atributo
    //Método SET que asigna un valor al atributo
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isHistorial_clinico() {
        return historial_clinico;
    }

    public void setHistorial_clinico(boolean historial_clinico) {
        this.historial_clinico = historial_clinico;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }

    public void setNro_documento_dueño(int nro_documento_dueño) {
        this.nro_documento_dueño = nro_documento_dueño;
    }
    
}
