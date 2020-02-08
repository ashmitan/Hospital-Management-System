/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class UserAccountDirectory {
    
    //UserAccountDirectory userDir;
    private ArrayList<UserAccount> userAccountsList;
    
    public UserAccountDirectory()
    {
        //userAccountsList =  new ArrayList<UserAccount>();
        userAccountsList = new ArrayList();
        //userDir = new UserAccountDirectory();
    }

    /**
     * @return the userAccountsList
     */
    public ArrayList<UserAccount> getUserAccountsList() {
        return userAccountsList;
    }

    /**
     * @param userAccountsList the userAccountsList to set
     */
    public void setUserAccountsList(ArrayList<UserAccount> userAccountsList) {
        this.userAccountsList = userAccountsList;
        
        
    }
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountsList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
   
    public UserAccount createUserAccount(String username, String password, Employee employee,Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountsList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount uacct : userAccountsList){
            if (uacct.getUserName().equals(username))
                return false;
        }
        return true;
    }
    
    
}
