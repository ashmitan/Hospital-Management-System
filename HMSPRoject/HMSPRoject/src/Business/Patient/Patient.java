/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author user
 */
public class Patient {
    private int patientId=1;
    private String patientName;
    private String patientRoomNo;
    private String patientType;
    private int doctorId;
    private String doctorName;
    private String nurseTask;
    private String nurseAcknowledged = "N";
    private String labTechnicianTask;
    private String labTechnicianAcknowledged;
    private String lastName;
    private String dob;
    private String age;
    private String sex;
    private String bloodGroup;
    private String height;
    private String weight;
        
    private static int id = 501;
    public Patient()
    {
        patientId= id;
        id++;
    }
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientRoomNo() {
        return patientRoomNo;
    }

    public void setPatientRoomNo(String patientRoomNo) {
        this.patientRoomNo = patientRoomNo;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getNurseTask() {
        return nurseTask;
    }

    public void setNurseTask(String nurseTask) {
        this.nurseTask = nurseTask;
    }

    public String getNurseAcknowledged() {
        return nurseAcknowledged;
    }

    public void setNurseAcknowledged(String nurseAcknowledged) {
        this.nurseAcknowledged = nurseAcknowledged;
    }

    public String getLabTechnicianTask() {
        return labTechnicianTask;
    }

    public void setLabTechnicianTask(String labTechnicianTask) {
        this.labTechnicianTask = labTechnicianTask;
    }

    public String getLabTechnicianAcknowledged() {
        return labTechnicianAcknowledged;
    }

    public void setLabTechnicianAcknowledged(String labTechnicianAcknowledged) {
        this.labTechnicianAcknowledged = labTechnicianAcknowledged;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
}
