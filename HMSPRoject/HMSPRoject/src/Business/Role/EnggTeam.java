/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.AccountsDepartment;
import Business.Department.DepartmentClass;
import Business.Department.EngineeringDepartment;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EngineeringTeam.EnggTeamJPanel;

/**
 *
 * @author Ashmita
 */
public class EnggTeam extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel displayJPanel, UserAccount account, DepartmentClass department, Enterprise enterprise, Ecosystem business) {
       return new EnggTeamJPanel(displayJPanel, account, (EngineeringDepartment)department, enterprise, business);
    }
}
