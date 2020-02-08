/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEquipmentSupplier;

/**
 *
 * @author Ashmita
 */
public class MedicalEquipmentSupplier {
    private String name;
    private int noOfUnitsAvailable;
    private int costPerUnit;
    private int orderId;
    private String equipmentName;
    private int noOfUnitsRequired;
    private String enterpriseName;
    private String status;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the noOfUnitsAvailable
     */
    public int getNoOfUnitsAvailable() {
        return noOfUnitsAvailable;
    }

    /**
     * @param noOfUnitsAvailable the noOfUnitsAvailable to set
     */
    public void setNoOfUnitsAvailable(int noOfUnitsAvailable) {
        this.noOfUnitsAvailable = noOfUnitsAvailable;
    }

    /**
     * @return the costPerUnit
     */
    public int getCostPerUnit() {
        return costPerUnit;
    }

    /**
     * @param costPerUnit the costPerUnit to set
     */
    public void setCostPerUnit(int costPerUnit) {
        this.costPerUnit = costPerUnit;
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
     * @return the equipmentName
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * @param equipmentName the equipmentName to set
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /**
     * @return the noOfUnitsRequired
     */
    public int getNoOfUnitsRequired() {
        return noOfUnitsRequired;
    }

    /**
     * @param noOfUnitsRequired the noOfUnitsRequired to set
     */
    public void setNoOfUnitsRequired(int noOfUnitsRequired) {
        this.noOfUnitsRequired = noOfUnitsRequired;
    }

    /**
     * @return the enterpriseName
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * @param enterpriseName the enterpriseName to set
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
