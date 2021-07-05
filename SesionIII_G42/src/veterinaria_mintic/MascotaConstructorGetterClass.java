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
public class MascotaConstructorGetterClass {
    //1. Declaramos las variables de forma privada
    //2. Crear los GETTER de las variables de la clase
    //3. Insertar el constructor de la clase. Clic secundario>Insert code>Constructor
    private String nombre_mascota;
    private String fecha_nacimiento;
    private String raza;
    private boolean vacunas;
    private boolean historial_clinico;
    private int nro_documento_dueño;

    public MascotaConstructorGetterClass(String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historial_clinico, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.raza = raza;
        this.vacunas = vacunas;
        this.historial_clinico = historial_clinico;
        this.nro_documento_dueño = nro_documento_dueño;
    }
 
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public boolean isHistorial_clinico() {
        return historial_clinico;
    }

    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }
    
    
}
