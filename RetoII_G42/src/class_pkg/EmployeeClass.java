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
public class EmployeeClass extends PersonClass{
    private int salary;
    private JobPositionClass job_position;
    
    public EmployeeClass(int document, String name, String correo, JobPositionClass job_position, int salary) {
        super(document, name, correo);
        this.job_position = job_position;
        this.salary = salary;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the job_position
     */
    public JobPositionClass getJob_position() {
        return job_position;
    }

    /**
     * @param job_position the job_position to set
     */
    public void setJob_position(JobPositionClass job_position) {
        this.job_position = job_position;
    }
    
    
}
