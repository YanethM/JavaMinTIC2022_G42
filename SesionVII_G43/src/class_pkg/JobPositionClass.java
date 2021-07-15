/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;

/**
 *
 * @author apmejiar
 */
public class JobPositionClass {
    private String name_job;
    private String herarchy_job;

    public JobPositionClass(String name_job, String herarchy_job) {
        this.name_job = name_job;
        this.herarchy_job = herarchy_job;
    }

    public String getName_job() {
        return name_job;
    }

    public void setName_job(String name_job) {
        this.name_job = name_job;
    }

    public String getHerarchy_job() {
        return herarchy_job;
    }

    public void setHerarchy_job(String herarchy_job) {
        this.herarchy_job = herarchy_job;
    }
    
    public void crud_jobs(){
        ArrayList<JobPositionClass> jobs_list = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {}
        
    }
}
