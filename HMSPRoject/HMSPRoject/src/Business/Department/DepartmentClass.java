
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public abstract class DepartmentClass {
    
    private String fullname;
    private EmployeeDirectory empDir;
    private UserAccountDirectory userDir;
    private static int counter = 0;
    private int departmentID;
    
    public enum Type {
        
        SystemAdmin("SystemAdminDepartment"),Doctor("DoctorDepartment"),Engineering("EngineeringDepartment"),
                      EquipmentMaintenance("EquipmentmaintenanceDepartment"),Lab("LabDepartment"),Nurse("NurseDepartment"),
                      Patient("PatientDepartment"),Accounts("AccountsDepartment");
                      
       private String value;
       private Type (String value){
           this.value=value;
       }
       
       public String getValue (){
           return value;
       }
        
        
    }

    public DepartmentClass(String fullname) {
        this.fullname = fullname;
        empDir =new EmployeeDirectory();
        userDir = new UserAccountDirectory();
        departmentID = counter;
        ++counter;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DepartmentClass.counter = counter;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    /**
     * @return the empDir
     */
    public EmployeeDirectory getEmpDir() {
        return empDir;
    }

    /**
     * @param empDir the empDir to set
     */
    public void setEmpDir(EmployeeDirectory empDir) {
        this.empDir = empDir;
    }

    /**
     * @return the userDir
     */
    public UserAccountDirectory getUserDir() {
        return userDir;
    }

    /**
     * @param userDir the userDir to set
     */
    public void setUserDir(UserAccountDirectory userDir) {
        this.userDir = userDir;
    }
    
 @Override
 public String toString()
 {
     return fullname;
 }
    
}
