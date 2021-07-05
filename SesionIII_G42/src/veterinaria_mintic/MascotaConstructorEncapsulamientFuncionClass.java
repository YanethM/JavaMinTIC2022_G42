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
public class MascotaConstructorEncapsulamientFuncionClass {
    //1. Declaramos las variables de forma privada
    //2. Encapsular las variables de la clase
    //3. Insertar el constructor de la clase. Clic secundario>Insert code>Constructor
    //4. Crear método que imprime los valores de todos los GETTER de la clase
    private String nombre_mascota;
    private String fecha_nacimiento;
    private String raza;
    private boolean vacunas;
    private boolean historial_clinico;
    private int nro_documento_dueño;

    public MascotaConstructorEncapsulamientFuncionClass(String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas, boolean historial_clinico, int nro_documento_dueño) {
        this.nombre_mascota = nombre_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.raza = raza;
        this.vacunas = vacunas;
        this.historial_clinico = historial_clinico;
        this.nro_documento_dueño = nro_documento_dueño;
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

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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
     * @return the vacunas
     */
    public boolean isVacunas() {
        return vacunas;
    }

    /**
     * @param vacunas the vacunas to set
     */
    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    /**
     * @return the historial_clinico
     */
    public boolean isHistorial_clinico() {
        return historial_clinico;
    }

    /**
     * @param historial_clinico the historial_clinico to set
     */
    public void setHistorial_clinico(boolean historial_clinico) {
        this.historial_clinico = historial_clinico;
    }

    /**
     * @return the nro_documento_dueño
     */
    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }

    /**
     * @param nro_documento_dueño the nro_documento_dueño to set
     */
    public void setNro_documento_dueño(int nro_documento_dueño) {
        this.nro_documento_dueño = nro_documento_dueño;
    }
    
    public String consultar_informacion_mascota_funcion(){
        //Si el valor de vacunas es true o false, mostrar mensaje personalizado al user
        String validar_vacunacion;
        if(isVacunas() == true){
            validar_vacunacion= getNombre_mascota() + " esta vacunado";
        }else{
            validar_vacunacion= getNombre_mascota() + " no esta vacunado";
        }
        
        String historial_clinico;
        if(isHistorial_clinico() == true){
            historial_clinico= "Tiene historial clinico con nosotros.";
        }else{
            historial_clinico ="No tiene historial clinico con nosotros.";
        }
        
        return "    Nombre: " + getNombre_mascota() + "\n    Raza: " + getRaza() +
                "\n    Fecha nacimiento: " + getFecha_nacimiento() + "\n    Nro documento: "
                + getNro_documento_dueño() + "\n    " + validar_vacunacion
                + "\n    " + historial_clinico;
    }
    
    
    public void consultar_informacion_mascota_metodo(){
        //Si el valor de vacunas es true o false, mostrar mensaje personalizado al user
        String validar_vacunacion;
        if(isVacunas() == true){
            validar_vacunacion= getNombre_mascota() + " esta vacunado";
        }else{
            validar_vacunacion= getNombre_mascota() + " no esta vacunado";
        }
        
        String historial_clinico;
        if(isHistorial_clinico() == true){
            historial_clinico= "Tiene historial clinico con nosotros.";
        }else{
            historial_clinico ="No tiene historial clinico con nosotros.";
        }
        
        System.out.println("\nFORMA III: Encapsulamiento, constructor y método que imprime los getter de las varables\n*****MÉTODO******\n    Nombre: " + getNombre_mascota() + "\n    Raza: " + getRaza() +
                "\n    Fecha nacimiento: " + getFecha_nacimiento() + "\n    Nro documento: "
                + getNro_documento_dueño() + "\n    " + validar_vacunacion
                + "\n    " + historial_clinico);
    }
}
