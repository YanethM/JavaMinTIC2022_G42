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
public class MascotaConstructorClass {
    private String nombre_mascota;
    private Date fecha_nacimiento;
    private boolean historial_clinico;
    private String raza;
    private int nro_documento_dueño;

    public MascotaConstructorClass(String nombre_mascota, Date fecha_nacimiento, boolean historial_clinico, String raza, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.historial_clinico = historial_clinico;
        this.raza = raza;
        this.nro_documento_dueño = nro_documento_dueño;
        //NO SE RECOMIENDA HACER UN SOUT EN EL CONSTRUCTOR DE UNA CLASE
        System.out.println("    >>Nombre: " + this.nombre_mascota+ "\n    >>Fecha nacimiento: " + this.fecha_nacimiento + "\n    >>Historial clinico: " +this.historial_clinico + "\n    >>Documento dueño: " + this.nro_documento_dueño);
    }
}
