/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Department.DepartmentClass;
import Business.Department.DepartmentDirectory;
import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Ashmita
 */

    public abstract class Enterprise extends DepartmentClass{
    
    private EnterpriseType enterpriseType;
    private EnterpriseDirectory enterpriseDirectory;

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        MedicalEquipmentSupplier("Medical EquipmentSupplier");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        enterpriseDirectory=new EnterpriseDirectory();
    }
    
}
