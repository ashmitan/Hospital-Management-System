/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Role.SystemAdmin;

/**
 *
 * @author lsrajput
 */
public class ConfigureASystem {
   private  EmployeeDirectory empDir;
    private  UserAccountDirectory userDir;
    private EnterpriseDirectory enterpriseDir;
    
    
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmpDir().createEmployee("Ria");
        //Enterprise enterprise = system.createAndAddNetwork().getEnterpriseDirectory().createAndAddEnterprise("", Enterprise.EnterpriseType.Hospital);
    
        Network network = system.createAndAddNetwork();
        network.setName("main");
        
        
        UserAccount ua = system.getUserDir().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdmin());
        UserAccount ua2 = system.getUserDir().createUserAccount("admin", "admin", employee, new Admin());
        
        return system;
    }
}
