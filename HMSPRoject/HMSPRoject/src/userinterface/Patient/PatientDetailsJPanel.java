/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.Department.DepartmentClass;
import Business.Department.DoctorDepartment;
import Business.Department.EngineeringDepartment;
import Business.Department.EquipmentMaintenanceDepartment;
import Business.Department.PatientDepartment;
import Business.Doctor.DoctorDetails;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DoctorRole.RequestForLabReportsJPanel;

/**
 *
 * @author Ashmita
 */
public class PatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientDetailsJPanel
     */
    private JPanel displayJPanel;
    private UserAccount account;
    private DepartmentClass department;
    private Enterprise enterprise;
    private Ecosystem ecosystem;
    private int patientId = 0;
    public PatientDetailsJPanel(JPanel displayJPanel, UserAccount account, DepartmentClass department, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.department = department;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = ecosystem;
        Patient pat = null;
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                for(Patient patient: ((PatientDepartment) dept).getPatientDirectory().getPatientList())
                {
                    if(patient.getPatientName().equalsIgnoreCase(account.getUserName()))
                    {
                        patientId = patient.getPatientId();
                        pat = patient;
                        break;
                    }
                }
            }
        }
        pidjTextField.setText(""+patientId);
        pidjTextField.setEnabled(false);
        fnamejTextField.setText(account.getUserName());
        fnamejTextField.setEnabled(false);
        lnamejTextField.setText(pat.getLastName());
        dobjTextField.setText(pat.getDob());
        agejTextField.setText(pat.getAge());
        sexjTextField.setText(pat.getSex());
        bloodgrpjTextField.setText(pat.getBloodGroup());
        htjTextField.setText(pat.getHeight());
        wtjTextField.setText(pat.getWeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fnamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pidjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lnamejTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dobjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        agejTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sexjTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bloodgrpjTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        htjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        wtjTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currenttreatmentjTable = new javax.swing.JTable();
        submitBtn = new javax.swing.JButton();
        reqLabReports = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        teamjComboBox = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        lastSubmitjButton = new javax.swing.JButton();
        rateReviewjButton = new javax.swing.JButton();
        issuejTextField1 = new javax.swing.JTextField();

        jLabel1.setText("Grey Sloan Medical Centre");

        jLabel2.setText("Welcome<Ria>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Personal details:");

        jLabel4.setText("First Name:");

        jLabel5.setText("Patient Id:");

        jLabel6.setText("Last Name:");

        jLabel7.setText("Date Of Birth:");

        jLabel8.setText("Age:");

        jLabel9.setText("Sex:");

        jLabel10.setText("Blood Group:");

        jLabel11.setText("Height:");

        jLabel12.setText("Weight:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Treatment:");

        currenttreatmentjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno.", "Ailment", "Drug Prescribed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(currenttreatmentjTable);
        if (currenttreatmentjTable.getColumnModel().getColumnCount() > 0) {
            currenttreatmentjTable.getColumnModel().getColumn(0).setResizable(false);
            currenttreatmentjTable.getColumnModel().getColumn(1).setResizable(false);
            currenttreatmentjTable.getColumnModel().getColumn(2).setResizable(false);
        }

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        reqLabReports.setText("Request Lab Reports");
        reqLabReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqLabReportsActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Raise A Request:");

        jLabel16.setText("Target Team:");

        teamjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Engineering Team", "Tech Support Team", "Equipment Maintenance Team" }));

        jLabel17.setText("Issue description:");

        lastSubmitjButton.setText("Submit");
        lastSubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastSubmitjButtonActionPerformed(evt);
            }
        });

        rateReviewjButton.setText("Rate And Review a Doctor>>");
        rateReviewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateReviewjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fnamejTextField)
                            .addComponent(lnamejTextField)
                            .addComponent(sexjTextField)
                            .addComponent(htjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(39, 39, 39)
                                    .addComponent(wtjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bloodgrpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(59, 59, 59)
                                .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dobjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(submitBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(reqLabReports))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teamjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(issuejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lastSubmitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rateReviewjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(pidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dobjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sexjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bloodgrpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(htjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(wtjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(submitBtn)
                .addGap(7, 7, 7)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reqLabReports)
                .addGap(8, 8, 8)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teamjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(issuejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastSubmitjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rateReviewjButton)
                .addGap(0, 241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
        String firstName = (String) fnamejTextField.getText();
        String lastName = (String) lnamejTextField.getText();
        String dob = dobjTextField.getText();
        String age = agejTextField.getText();
        String sex = sexjTextField.getText();
        String bloodGroup = bloodgrpjTextField.getText();
        String height = htjTextField.getText();
        String weight = wtjTextField.getText();
        
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                for(Patient patient: ((PatientDepartment) dept).getPatientDirectory().getPatientList())
                {
                    if(patient.getPatientName().equalsIgnoreCase(account.getUserName()))
                    {
                        patient.setLastName(lastName);
                        patient.setDob(dob);
                        patient.setAge(age);
                        patient.setSex(sex);
                        patient.setBloodGroup(bloodGroup);
                        patient.setHeight(height);
                        patient.setWeight(weight);
                        break;
                    }
                }
            }
        }
       JOptionPane.showMessageDialog(displayJPanel,"Details saved Successfully!"); 
    }//GEN-LAST:event_submitBtnActionPerformed

    private void reqLabReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqLabReportsActionPerformed
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                for(Patient patient: ((PatientDepartment) dept).getPatientDirectory().getPatientList())
                {
                    if(patient!=null && patient.getPatientId()==patientId)
                                {
                                    CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
                                    this.displayJPanel.add(new RequestForLabReportsJPanel(displayJPanel, ecosystem, patient));
                                    layout.next(displayJPanel);
                                    break;
                                }
                }
            }
        }
    }//GEN-LAST:event_reqLabReportsActionPerformed

    private void rateReviewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateReviewjButtonActionPerformed
        for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
        {
            if(dept instanceof PatientDepartment)
            {
                for(Patient patient: ((PatientDepartment) dept).getPatientDirectory().getPatientList())
                {
                    if(patient!=null && patient.getPatientId()==patientId)
                                {
                                    CardLayout layout = (CardLayout)this.displayJPanel.getLayout();
                                    this.displayJPanel.add(new RateAndReview(displayJPanel, ecosystem, patient));
                                    layout.next(displayJPanel);
                                }
                }
            }
        }
    }//GEN-LAST:event_rateReviewjButtonActionPerformed

    private void lastSubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastSubmitjButtonActionPerformed
        String teamType = (String)teamjComboBox.getSelectedItem();
        String issueDesc = issuejTextField1.getText();
        if("Equipment Maintenance Team".equalsIgnoreCase(teamType))
        {
            try
            {
                for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
                {
                    if(dept instanceof EquipmentMaintenanceDepartment)
                    {
                        ((EquipmentMaintenanceDepartment) dept).getEquipmentMaintananceDirectory().getEquipmentMaintananceList().get(0).getWorkQueueDirectory().createWorkQueue(issueDesc);

                    }
                }
                JOptionPane.showMessageDialog(displayJPanel,"Work Queue added to Equipment Maintenance Team.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(displayJPanel,"Equipment Maintenance team not available");
            }
            
        }
        else if("Engineering Team".equalsIgnoreCase(teamType))
        {
            try
            {
                for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
                {
                    if(dept instanceof EngineeringDepartment)
                    {
                        ((EngineeringDepartment) dept).getEngineeringTeamDirectory().getEnggTeamList().get(0).getWorkQueueDirectory().createWorkQueue(issueDesc);
                    }
                }
                JOptionPane.showMessageDialog(displayJPanel,"Work Queue added to Egineering Team.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(displayJPanel,"Engineering team not available");
            }
            
        }
        else if("Tech Support Team".equalsIgnoreCase(teamType))
        {
            try
            {
                for(DepartmentClass dept: ecosystem.getNetworkList().get(0).getDepartmentDirectory().getDepartmentList())
                {
                    if(dept instanceof EngineeringDepartment)
                    {
                        ((EngineeringDepartment) dept).getEngineeringTeamDirectory().getEnggTeamList().get(0).getWorkQueueDirectory().createWorkQueue(issueDesc);
                    }
                }
                JOptionPane.showMessageDialog(displayJPanel,"Work Queue added to Egineering Team.");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(displayJPanel,"Engineering team not available");
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(displayJPanel,"Selected team not available");
        }
    }//GEN-LAST:event_lastSubmitjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agejTextField;
    private javax.swing.JTextField bloodgrpjTextField;
    private javax.swing.JTable currenttreatmentjTable;
    private javax.swing.JTextField dobjTextField;
    private javax.swing.JTextField fnamejTextField;
    private javax.swing.JTextField htjTextField;
    private javax.swing.JTextField issuejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastSubmitjButton;
    private javax.swing.JTextField lnamejTextField;
    private javax.swing.JTextField pidjTextField;
    private javax.swing.JButton rateReviewjButton;
    private javax.swing.JButton reqLabReports;
    private javax.swing.JTextField sexjTextField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox teamjComboBox;
    private javax.swing.JTextField wtjTextField;
    // End of variables declaration//GEN-END:variables
}
