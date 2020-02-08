/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Ashmita
 */
public class Orders {
    private Date date;
    private int orderId;
    private String deviceName;
    private String issueDesc;
    private String placedBy;
    private String noOfUnits;
    private double cost;
    private String status;
    public static int id = 101;

    /**
     * @return the date
     */
    public Orders()
    {
        orderId = id;
        id ++;
        System.out.println("Order Id = " +orderId);
    }
    
    
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the orderId
     */
    public int getOrderId() {
      
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName the deviceName to set
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return the issueDesc
     */
    public String getIssueDesc() {
        return issueDesc;
    }

    /**
     * @param issueDesc the issueDesc to set
     */
    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    /**
     * @return the placedBy
     */
    public String getPlacedBy() {
        return placedBy;
    }

    /**
     * @param placedBy the placedBy to set
     */
    public void setPlacedBy(String placedBy) {
        this.placedBy = placedBy;
    }

    /**
     * @return the noOfUnits
     */
    public String getNoOfUnits() {
        return noOfUnits;
    }

    /**
     * @param noOfUnits the noOfUnits to set
     */
    public void setNoOfUnits(String noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
