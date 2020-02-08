/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class MedicalEquipmentSupplierEnterprise extends Enterprise {
    
    public MedicalEquipmentSupplierEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MedicalEquipmentSupplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
