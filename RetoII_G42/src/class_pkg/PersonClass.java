/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author apmejiar
 */
public class PersonClass {
    //1. Declarar las variables de la superclase con visibilidad private
    private int document;
    private String name;
    private String correo;

    //2. Insertar el constructor de la clase
    
    public PersonClass(int document, String name, String correo) {
        this.document = document;
        this.name = name;
        this.correo = correo;
    }

    //3. Insertar GETTER y SETTER
    /**
     * @return the document
     */
    public int getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(int document) {
        this.document = document;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
