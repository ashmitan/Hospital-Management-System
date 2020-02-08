/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.DepartmentClass;
import Business.Department.DoctorDepartment;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorJPanel;

/**
 *
 * @author Ashmita
 */
public class Doctor extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel displayJPanel, UserAccount account, DepartmentClass department, Enterprise enterprise, Ecosystem business) {
       return new DoctorJPanel(displayJPanel, account, (DoctorDepartment)department, enterprise, business);
    }
    
}
