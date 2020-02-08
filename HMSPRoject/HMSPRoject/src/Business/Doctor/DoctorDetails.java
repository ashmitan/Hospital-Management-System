/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Patient.PatientDirectory;
import java.util.Date;

/**
 *
 * @author Ashmita
 */
public class DoctorDetails {
    private String firstName;
    private String lastName;
    private int employeeId;
    private Date dateOfBirth;
    private String teamType;
    private String issueDesc;
    private double salary;
    private String designation;
    private PatientDirectory patientDirectory;
    /**
     * @return the firstName
     */
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
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
     * @return the issueDesc
     */
    public String getIssueDesc() {
        return issueDesc;
    }

    /**
     * @param issueDesc the issueDesc to set
     */
    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
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

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
}
