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
public class CompanyClass {
    private String company_name;
    private String NIT;

    public CompanyClass(String company_name, String NIT) {
        this.company_name = company_name;
        this.NIT = NIT;
    }

    /**
     * @return the company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
