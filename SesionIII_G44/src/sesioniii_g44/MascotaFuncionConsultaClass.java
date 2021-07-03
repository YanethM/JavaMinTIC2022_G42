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
public class MascotaFuncionConsultaClass {
    private String nombre_mascota;
    private Date fecha_nacimiento;
    private boolean historial_clinico;
    private String raza;
    private int nro_documento_dueño;

    public MascotaFuncionConsultaClass(String nombre_mascota, Date fecha_nacimiento, boolean historial_clinico, String raza, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.historial_clinico = historial_clinico;
        this.raza = raza;
        this.nro_documento_dueño = nro_documento_dueño;
    }
    
    
    
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public boolean isHistorial_clinico() {
        return historial_clinico;
    }

    public String getRaza() {
        return raza;
    }

    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }
    
    public String consultar_informacion_mascota(){
        return "       >>" + getNombre_mascota() + " nacio el " + 
                getFecha_nacimiento() + " es de raza " + getRaza() + 
                " y su dueño se identifica con la C.C. número " + getNro_documento_dueño();
    }
}
