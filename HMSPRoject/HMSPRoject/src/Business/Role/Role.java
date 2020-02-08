/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Department.DepartmentClass;
import Business.*;
import Business.Enterprise.Enterprise;

/**
 *
 * @author Ashmita
 */
public abstract class Role {
    
    public enum TypeOfRole
    {
        Admin(),
        SystemAdmin(),
        Doctor(),
        Nurse(),
        LabTechnician(),
        EnggTeam(),
        AccountsTeam(),
        EquipmentMaintenanceTeam(),
        Patient(),
        MedicalEquipmentSupplier();
        
        private String roleValue;
        
        private void RoleType(String roleValue)
        {
            this.roleValue = roleValue;
        }
         public String getRoleValue()
         {
             return roleValue;
         }
         
         @Override
         public String toString()
         {
             return roleValue;
         }
         
          }
         public abstract JPanel createWorkArea(JPanel displayJPanel, 
            UserAccount account, 
            DepartmentClass department, 
            Enterprise enterprise, 
            Ecosystem business);
         
   
    @Override
    public String toString() {
    return this.getClass().getName();
    }
    
}
