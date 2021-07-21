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
    private int nit;

    public VeterinaryClass(String veterinary_name, int nit) {
        this.veterinary_name = veterinary_name;
        this.nit = nit;
    }

    public String getVeterinary_name() {
        return veterinary_name;
    }

    public void setVeterinary_name(String veterinary_name) {
        this.veterinary_name = veterinary_name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
}
