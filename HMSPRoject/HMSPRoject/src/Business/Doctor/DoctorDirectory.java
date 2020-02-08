/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Patient.PatientDirectory;
import Business.Role.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Ashmita
 */
public class DoctorDirectory {

    ArrayList<DoctorDetails> docDetails = new ArrayList<DoctorDetails>();

    public DoctorDetails CreateDoctor(int doctorId, String firstName) {
        DoctorDetails doc = new DoctorDetails();
        doc.setFirstName(firstName);
        doc.setEmployeeId(doctorId);
        doc.setPatientDirectory(new PatientDirectory());
        docDetails.add(doc);
        return doc;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<DoctorDetails> getDocDetails() {
        return docDetails;
    }

    public void setDocDetails(ArrayList<DoctorDetails> docDetails) {
        this.docDetails = docDetails;
    }
    
    
}
