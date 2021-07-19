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
public class PetClass {
    private int code;
    private String name;
    private String breed;
    private String health_status;
    private int born_yearn;
    private String color;
    private boolean pedigree;
    private char pet_sex;
    private VeterinaryClass veterinary;

    public PetClass(int code, String name, String breed, String health_status, int born_yearn, String color, boolean pedigree, char pet_sex) {
        this.code = code;
        this.name = name;
        this.breed = breed;
        this.health_status = health_status;
        this.born_yearn = born_yearn;
        this.color = color;
        this.pedigree = pedigree;
        this.pet_sex = pet_sex;
    }

    public VeterinaryClass getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(VeterinaryClass veterinary) {
        this.veterinary = veterinary;
    }

    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public int getBorn_yearn() {
        return born_yearn;
    }

    public void setBorn_yearn(int born_yearn) {
        this.born_yearn = born_yearn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public char getPet_sex() {
        return pet_sex;
    }

    public void setPet_sex(char pet_sex) {
        this.pet_sex = pet_sex;
    }
    
    
}
