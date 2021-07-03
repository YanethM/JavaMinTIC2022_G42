/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii_g42;

/**
 *
 * @author apmejiar
 */
public class ConductorClass {
    //Nombre, matricula, categoria, multa, nro_documento
    private String nombre_propietario = "";
    private int nro_documento = 0;
    private char categoria;
    private String tipo_infraccion = "";
    private boolean multar = false;
    
    public boolean asignar_multa(int numero_doc, String nombre_conductor, String infraccion){
        setNombre_propietario(nombre_conductor);
        setNro_documento(numero_doc);
        setTipo_infraccion(infraccion);
        
        if (getTipo_infraccion() != ""){
            System.out.println(getNombre_propietario() + "se le impondrá una multa por la infracción "+getTipo_infraccion());
            setMultar(true);
        }else{
            System.out.println(getNombre_propietario() + ". Felicitaciones. Te salvaste de ser multado");
        }
        return isMultar();
    }
    
    
    public void asignar_multa_m(int numero_doc, String nombre_conductor, String infraccion){
        setNombre_propietario(nombre_conductor);
        setNro_documento(numero_doc);
        setTipo_infraccion(infraccion);
        
        if (getTipo_infraccion() != ""){
            System.out.println(getNombre_propietario() + " Se le impondrá una multa por la infracción "+getTipo_infraccion());
            setMultar(true);
        }else{
            System.out.println(getNombre_propietario() + " Felicitaciones. Te salvaste de ser multado");
        }
    }
    
    public String asignar_multa_f(int numero_doc, String nombre_conductor, String infraccion){
        setNombre_propietario(nombre_conductor);
        setNro_documento(numero_doc);
        setTipo_infraccion(infraccion);
        String mensaje = "";
        if (getTipo_infraccion() != ""){
            mensaje= getNombre_propietario() + " Se le impondrá una multa por la infracción "+getTipo_infraccion();
            setMultar(true);
        }else{
            mensaje = getNombre_propietario() + " Felicitaciones. Te salvaste de ser multado";
        }
        return mensaje;
    }

    /**
     * @return the nombre_propietario
     */
    public String getNombre_propietario() {
        return nombre_propietario;
    }

    /**
     * @param nombre_propietario the nombre_propietario to set
     */
    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
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
     * @return the categoria
     */
    public char getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the tipo_infraccion
     */
    public String getTipo_infraccion() {
        return tipo_infraccion;
    }

    /**
     * @param tipo_infraccion the tipo_infraccion to set
     */
    public void setTipo_infraccion(String tipo_infraccion) {
        this.tipo_infraccion = tipo_infraccion;
    }

    /**
     * @return the multar
     */
    public boolean isMultar() {
        return multar;
    }

    /**
     * @param multar the multar to set
     */
    public void setMultar(boolean multar) {
        this.multar = multar;
    }
    
}
