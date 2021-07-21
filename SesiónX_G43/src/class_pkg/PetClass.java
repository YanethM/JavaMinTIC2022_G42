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
    private int born_year;
    private String breed;
    private char pet_sex;
    private String health_status;
    private boolean pedigree;

    public PetClass(int code, String name, int born_year, String breed, char pet_sex, String health_status, boolean pedigree) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.breed = breed;
        this.pet_sex = pet_sex;
        this.health_status = health_status;
        this.pedigree = pedigree;
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

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getPet_sex() {
        return pet_sex;
    }

    public void setPet_sex(char pet_sex) {
        this.pet_sex = pet_sex;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
