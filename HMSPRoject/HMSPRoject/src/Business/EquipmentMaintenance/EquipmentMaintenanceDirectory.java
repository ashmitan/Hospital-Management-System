/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EquipmentMaintenance;

import static Business.Department.DepartmentClass.Type.EquipmentMaintenance;
import Business.WorkQueue.WorkQueueDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class EquipmentMaintenanceDirectory {

    private ArrayList<EquipmentMaintenanceDetails> equipmentMaintananceList;
    
    public EquipmentMaintenanceDirectory() {
        equipmentMaintananceList = new ArrayList<EquipmentMaintenanceDetails>();
    }

    public EquipmentMaintenanceDetails createEMEmployee(int empId, String firstName) {
        EquipmentMaintenanceDetails emDetails = new EquipmentMaintenanceDetails();
        emDetails.setEmployeeId(empId);
        emDetails.setFirstName(firstName);
        emDetails.setWorkQueueDirectory(new WorkQueueDirectory());
        equipmentMaintananceList.add(emDetails);
        return emDetails;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the emDirectory
     */
    public ArrayList<EquipmentMaintenanceDetails> getEquipmentMaintananceList() {
        return equipmentMaintananceList;
    }

    /**
     * @param emDirectory the emDirectory to set
     */
    public void setEmDirectory(ArrayList<EquipmentMaintenanceDetails> equipmentMaintananceList) {
        this.equipmentMaintananceList = equipmentMaintananceList;
    }

    
    
    
    
}
