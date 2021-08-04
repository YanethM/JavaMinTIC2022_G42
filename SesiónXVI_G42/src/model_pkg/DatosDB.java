/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

/**
 *
 * @author apmejiar
 */
public class DatosDB {
    //Datos creación cliente
    private int idClient;
    private String name;
    private String document_type;
    private int document;
    
    //Datos creación producto
    private int idProduct;
    private String product;
    private String description;
    private int precio;

    public DatosDB() {
        //Inicializamos las variables String en vacío ""
        this.name = "";
        this.document_type = "";
        this.product = "";
        this.description = "";
        //Inicializamos las variables tipo entero en cero
        this.idClient = 0;
        this.idProduct = 0;
        this.document = 0;
        this.precio = 0;
    }

    /**
     * @return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
     * @return the document_type
     */
    public String getDocument_type() {
        return document_type;
    }

    /**
     * @param document_type the document_type to set
     */
    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

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
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
