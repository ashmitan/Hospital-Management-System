/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Department.DepartmentClass.Type;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class DepartmentDirectory {
  
    private ArrayList<DepartmentClass> departmentList;

    public DepartmentDirectory() {
        departmentList = new ArrayList();
    }

    public ArrayList<DepartmentClass> getDepartmentList() {
        return departmentList;
    }
    
    public DepartmentClass createDepartment(Type type){
        DepartmentClass dept = null;
        if (type.getValue().equals(Type.Accounts.getValue())){
            dept = new AccountsDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.Doctor.getValue())){
            dept = new DoctorDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.Engineering.getValue())){
            dept = new EngineeringDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.EquipmentMaintenance.getValue())){
            dept = new EquipmentMaintenanceDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            dept = new LabDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            dept = new NurseDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            dept = new PatientDepartment("");
            departmentList.add(dept);
        }
        else if (type.getValue().equals(Type.SystemAdmin.getValue())){
            dept = new SystemAdminDepartment("");
            departmentList.add(dept);
        }
        
        return dept;
    }
}
