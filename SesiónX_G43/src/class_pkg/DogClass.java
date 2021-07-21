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
public class DogClass extends PetClass{
    private VeterinaryClass veterinary;
    
    public DogClass(int code, String name, int born_year, String breed, char pet_sex, String health_status, boolean pedigree) {
        super(code, name, born_year, breed, pet_sex, health_status, pedigree);
    }

    public VeterinaryClass getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(VeterinaryClass veterinary) {
        this.veterinary = veterinary;
    }
    
    
    
}
