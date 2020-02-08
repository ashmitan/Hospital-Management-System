/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTechnician;

import Business.Nurse.Nurse;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class LabTechiciaDirectory {
    ArrayList<LabTechnician> labTechnicianList = new ArrayList<LabTechnician>();

    public LabTechnician createLabTechnician(int empId,String firstName)
    {
        LabTechnician labTechnician = new LabTechnician();
        labTechnician.setEmployeeId(empId);
        labTechnician.setFirstName(firstName);
        labTechnician.setPatientDirectory(new PatientDirectory());
        labTechnicianList.add(labTechnician);
        return labTechnician; 
    }
    public ArrayList<LabTechnician> getLabTechnicianList() {
        return labTechnicianList;
    }

    public void setLabTechnicianList(ArrayList<LabTechnician> labTechnicianList) {
        this.labTechnicianList = labTechnicianList;
    }
    
}
