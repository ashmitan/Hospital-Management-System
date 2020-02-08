/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public Patient createNewPatient(String patientName, String roomNo, String patientType,int doctorId,String doctorName)
    {
        Patient patient = new Patient();
        patient.setPatientName(patientName);
        patient.setPatientRoomNo(roomNo);
        patient.setPatientType(patientType);
        patient.setDoctorId(doctorId);
        patient.setDoctorName(doctorName);
        patientList.add(patient);
        return patient;
        
    }
    public void removePatient(int patientId)
    {
        Patient patient = null;
        for(Patient pat:patientList)
        {
           if(pat!=null && patientId == pat.getPatientId())
           {
               patient = pat;
           }
        }
        if(patient!=null)
        {
            patientList.remove(patient);
        }
    }
}
