/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.EquipmentMaintenance.EquipmentMaintenanceDirectory;
import Business.Role.Doctor;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class EquipmentMaintenanceDepartment extends DepartmentClass {
 
    private EquipmentMaintenanceDirectory equipmentMaintananceDirectory;
    
    public EquipmentMaintenanceDepartment(String name) {
        super(DepartmentClass.Type.EquipmentMaintenance.getValue());
        equipmentMaintananceDirectory = new EquipmentMaintenanceDirectory();
    }

    public EquipmentMaintenanceDirectory getEquipmentMaintananceDirectory() {
        return equipmentMaintananceDirectory;
    }

    public void setEquipmentMaintananceDirectory(EquipmentMaintenanceDirectory equipmentMaintananceDirectory) {
        this.equipmentMaintananceDirectory = equipmentMaintananceDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
