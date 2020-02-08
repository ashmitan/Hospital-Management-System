/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.Nurse.NurseDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class NurseDepartment extends DepartmentClass {
    
    
    private NurseDirectory nurseDirectory;
    public NurseDepartment(String name) {
        super(DepartmentClass.Type.Nurse.getValue());
        nurseDirectory = new NurseDirectory();
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
    
}
