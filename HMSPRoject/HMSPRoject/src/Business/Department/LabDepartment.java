/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Ecosystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.LabTechnician.LabTechiciaDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ashmita
 */
public class LabDepartment extends DepartmentClass {
    
    private LabTechiciaDirectory labTechnicianDirectory;
   public LabDepartment(String name) {
        super(DepartmentClass.Type.Lab.getValue());
        labTechnicianDirectory = new LabTechiciaDirectory();
    }

    public LabTechiciaDirectory getLabTechnicianDirectory() {
        return labTechnicianDirectory;
    }

    public void setLabTechnicianDirectory(LabTechiciaDirectory labTechnicianDirectory) {
        this.labTechnicianDirectory = labTechnicianDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
