/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Orders;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class OrderDirectory {
    
    private ArrayList<Orders> orderDirectory;
    
    public OrderDirectory()
    {
       orderDirectory = new ArrayList<Orders>(); 
    }
    
    public Orders addnewOrder(){
        Orders newOrder = new Orders();
        orderDirectory.add(newOrder);
        return newOrder;
    }
    
    

    /**
     * @return the orderDirectory
     */
    public ArrayList<Orders> getOrderDirectory() {
        return orderDirectory;
    }

    /**
     * @param orderDirectory the orderDirectory to set
     */
    public void setOrderDirectory(ArrayList<Orders> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
}
