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
public class JobPositionClass {
    private String job_name;
    private String herarchy_name;

    public JobPositionClass(String job_name, String herarchy_name) {
        this.job_name = job_name;
        this.herarchy_name = herarchy_name;
    }

    
    /**
     * @return the job_name
     */
    public String getJob_name() {
        return job_name;
    }

    /**
     * @param job_name the job_name to set
     */
    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    /**
     * @return the herarchy_name
     */
    public String getHerarchy_name() {
        return herarchy_name;
    }

    /**
     * @param herarchy_name the herarchy_name to set
     */
    public void setHerarchy_name(String herarchy_name) {
        this.herarchy_name = herarchy_name;
    }
    
}
