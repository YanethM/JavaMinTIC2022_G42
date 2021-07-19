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
public class VeterinaryClass {
    private String veterinary_name;
    private String veterinary_NIT;
    private String veterinary_address;

    public VeterinaryClass(String veterinary_name, String veterinary_NIT, String veterinary_address) {
        this.veterinary_name = veterinary_name;
        this.veterinary_NIT = veterinary_NIT;
        this.veterinary_address = veterinary_address;
    }

    public String getVeterinary_name() {
        return veterinary_name;
    }

    public void setVeterinary_name(String veterinary_name) {
        this.veterinary_name = veterinary_name;
    }

    public String getVeterinary_NIT() {
        return veterinary_NIT;
    }

    public void setVeterinary_NIT(String veterinary_NIT) {
        this.veterinary_NIT = veterinary_NIT;
    }

    public String getVeterinary_address() {
        return veterinary_address;
    }

    public void setVeterinary_address(String veterinary_address) {
        this.veterinary_address = veterinary_address;
    }
    
    
    
}
