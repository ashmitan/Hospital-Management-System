/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Doctor.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import static Business.Role.Role.TypeOfRole.Doctor;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class DoctorDepartment extends DepartmentClass{
    
    private DoctorDirectory doctorDirectory;
    public DoctorDepartment(String name) {
        super(DepartmentClass.Type.Doctor.getValue());
        doctorDirectory = new DoctorDirectory();
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
