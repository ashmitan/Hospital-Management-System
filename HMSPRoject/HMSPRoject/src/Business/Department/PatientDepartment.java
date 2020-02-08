/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class PatientDepartment extends DepartmentClass {
    
    private PatientDirectory patientDirectory;
    
    public PatientDepartment(String name) {
        super(DepartmentClass.Type.Patient.getValue());
        patientDirectory=new PatientDirectory();
    }
    
    public PatientDirectory getPatientDirectory()
    {
        return patientDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
    
}
