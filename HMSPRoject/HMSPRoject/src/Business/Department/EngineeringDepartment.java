/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.Engineering.EngineeringTeamDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class EngineeringDepartment extends DepartmentClass {
    private EngineeringTeamDirectory engineeringTeamDirectory;
    public EngineeringDepartment(String name) {
        super(DepartmentClass.Type.Engineering.getValue());
        engineeringTeamDirectory = new EngineeringTeamDirectory();
    }

    public EngineeringTeamDirectory getEngineeringTeamDirectory() {
        return engineeringTeamDirectory;
    }

    public void setEngineeringTeamDirectory(EngineeringTeamDirectory engineeringTeamDirectory) {
        this.engineeringTeamDirectory = engineeringTeamDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
