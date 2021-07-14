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
public class ClientClass extends PersonClass{
    
    private CompanyClass company;
    
    public ClientClass(int document, String name, String correo) {
        super(document, name, correo);
    }

    /**
     * @return the company
     */
    public CompanyClass getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(CompanyClass company) {
        this.company = company;
    }

}
