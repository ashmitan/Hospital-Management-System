/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class NurseDirectory {
    ArrayList<Nurse> nurseList = new ArrayList<Nurse>();

    public Nurse createNurse(int nurseId, String firstName)
    {
        Nurse nurse = new Nurse();
        nurse.setEmployeeId(nurseId);
        nurse.setFirstName(firstName);
        nurse.setPatientDirectory(new PatientDirectory());
        nurseList.add(nurse);
        return nurse;
    }
    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }
    
    
}
