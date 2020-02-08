/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Engineering;

import Business.EquipmentMaintenance.*;
import static Business.Department.DepartmentClass.Type.EquipmentMaintenance;
import Business.WorkQueue.WorkQueueDirectory;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class EngineeringTeamDirectory {

    private ArrayList<EngineeringTeamDetails> enggTeamList;
    
    public EngineeringTeamDirectory() {
        enggTeamList = new ArrayList<EngineeringTeamDetails>();
    }

    public EngineeringTeamDetails createEnggTeam(int empId, String firstName) {
        EngineeringTeamDetails emDetails = new EngineeringTeamDetails();
        emDetails.setEmployeeId(empId);
        emDetails.setFirstName(firstName);
        emDetails.setWorkQueueDirectory(new WorkQueueDirectory());
        enggTeamList.add(emDetails);
        return emDetails;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the emDirectory
     */
    public ArrayList<EngineeringTeamDetails> getEnggTeamList() {
        return enggTeamList;
    }

    /**
     * @param emDirectory the emDirectory to set
     */
    public void setEnngTeamDirectory(ArrayList<EngineeringTeamDetails> enggTeamList) {
        this.enggTeamList = enggTeamList;
    }

    
    
    
    
}
