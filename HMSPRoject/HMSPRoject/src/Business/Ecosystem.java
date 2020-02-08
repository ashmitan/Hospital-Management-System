/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Department.DepartmentClass;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import java.util.ArrayList;
import Business.Role.Admin;

/**
 *
 * @author Ashmita
 */
public class Ecosystem extends DepartmentClass {
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new Admin());
        return roleList;
    }
    public Ecosystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
