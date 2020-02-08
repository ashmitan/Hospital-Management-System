/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

//import Business.EcoSystem;
import Business.Department.DepartmentClass;
import Business.Department.DepartmentDirectory;
import Business.Ecosystem;
import Business.Enterprise.EnterpriseDirectory;
import Business.OrderDirectory;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class Network {

private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private DepartmentDirectory departmentDirectory;
    private OrderDirectory orderDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        //departmentDirectory=new DepartmentDirectory();
        /*
        departmentDirectory.createDepartment(DepartmentClass.Type.Accounts);
        departmentDirectory.createDepartment(DepartmentClass.Type.Doctor);
        departmentDirectory.createDepartment(DepartmentClass.Type.Engineering);
        departmentDirectory.createDepartment(DepartmentClass.Type.EquipmentMaintenance);
        departmentDirectory.createDepartment(DepartmentClass.Type.Lab);
        departmentDirectory.createDepartment(DepartmentClass.Type.Nurse);
        departmentDirectory.createDepartment(DepartmentClass.Type.Patient);
        departmentDirectory.createDepartment(DepartmentClass.Type.SystemAdmin);
                  */
        orderDirectory = new OrderDirectory();
              
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public DepartmentDirectory getDepartmentDirectory()
    {
        return departmentDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    }
    

