/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ashmita
 */
public class Employee {
    private String firstName; 
    private String lastName;
    private int employeeId;
    private String dateOfBirth;
    private String designation;
    private String teamType;
    private String salary;
    private static int id = 1001;

    /**
     * @return the firstName
     */
     
    public Employee()
    {
        employeeId = id;
        id++;
    
    }
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the teamType
     */
    public String getTeamType() {
        return teamType;
    }

    /**
     * @param teamType the teamType to set
     */
    public void setTeamType(String teamType) {
        this.teamType = teamType;
    }

    /**
     * @return the Salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(String Salary) {
        this.salary = Salary;
    }
    
  public String PopulateSalary(String designation)
  {
      Employee employee = new Employee();
      
      if(designation == "Trainee")
      {
        employee.setSalary("2000");
      }
      else if(designation == "Engineer")
      {
          employee.setSalary("2250");
      }
      else if(designation == "Senior Engineer")
      {
          employee.setSalary("2500");
      }
      else
      {
          employee.setSalary("4000");
      }
   return employee.getSalary();   
  }

}
