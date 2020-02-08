/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.DepartmentClass;
import Business.Department.PatientDepartment;
import Business.Department.SystemAdminDepartment;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Patient.PatientDetailsJPanel;
import userinterface.SysadminRole.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Ashmita
 */
public class SystemAdmin extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel displayJPanel, UserAccount account, DepartmentClass department, Enterprise enterprise, Ecosystem business) {
       return new SystemAdminWorkAreaJPanel(displayJPanel, account, (SystemAdminDepartment)department, enterprise, business);
    } 
    
}
