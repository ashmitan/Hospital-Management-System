/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AccountsTeam;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashmita
 */
public class ManageSalariesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSalariesJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    private EmployeeDirectory empDir;
    public ManageSalariesJPanel(JPanel displayJPanel, Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.displayJPanel = displayJPanel;
        this.empDir = empDir;
        populateEmployeeType();
        
        //populateTotalSalary();
    }
    
    public void populateEmployeeType()
    {
        employeeTypeComboBox.addItem("Accounts Team");
        employeeTypeComboBox.addItem("Engineering Team");
        employeeTypeComboBox.addItem("Equipment Maintenance Team");
        employeeTypeComboBox.addItem("Doctor");
        employeeTypeComboBox.addItem("Nurse");
        employeeTypeComboBox.addItem("Lab Technician");
        employeeTypeComboBox.addItem("Tech Support Team");
    }
    public void populateDesignation()
    {
        if(employeeTypeComboBox.getSelectedItem() == "Accounts Team")
        {
            designationComboBox.addItem("Trainee Consultant");
            designationComboBox.addItem("Junior Consultant");
            designationComboBox.addItem("Senior Consultant");
            designationComboBox.addItem("Manager of Finance");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Engineering Team")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee");
            designationComboBox.addItem("Engineer");
            designationComboBox.addItem("Senior Engineer");
            designationComboBox.addItem("Manager");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Equipment Maintenance Team")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee");
            designationComboBox.addItem("Engineer");
            designationComboBox.addItem("Senior Engineer");
            designationComboBox.addItem("Manager");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Doctor")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee Doctor");
            designationComboBox.addItem("Physician");
            designationComboBox.addItem("Senior Doctor");
            designationComboBox.addItem("Head Doctor");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Nurse")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee Nurse");
            designationComboBox.addItem("Nurse");
            designationComboBox.addItem("Senior Nurse");
            designationComboBox.addItem("HeadNurse");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Lab Technician")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee");
            designationComboBox.addItem("Engineer");
            designationComboBox.addItem("Senior Engineer");
            designationComboBox.addItem("Manager");
        }
        else if(employeeTypeComboBox.getSelectedItem() == "Tech Support Team")
        {
            designationComboBox.removeAllItems();
            designationComboBox.addItem("Trainee");
            designationComboBox.addItem("Engineer");
            designationComboBox.addItem("Senior Engineer");
            designationComboBox.addItem("Manager");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid option selected");
        }
    }
     public String PopulateSalary()
  {
      Employee employee = new Employee();
      
      if(designationComboBox.getSelectedItem() == "Trainee")
      {
        salaryTextField.setText("2000.00");
      }
      else if(designationComboBox.getSelectedItem() == "Engineer")
      {
          salaryTextField.setText("2250.00");
      }
      else if(designationComboBox.getSelectedItem() == "Senior Engineer")
      {
          salaryTextField.setText("25000.00");
      }
      else
      {
          salaryTextField.setText("4000.00");
      }
      if(designationComboBox.getSelectedItem()=="Trainee Doctor")
      {
          salaryTextField.setText("2000.00");
      }
      else if(designationComboBox.getSelectedItem()=="Physician")
      {
          salaryTextField.setText("2250.00");
      }
      else if(designationComboBox.getSelectedItem()=="Senior Doctor")
      {
          salaryTextField.setText("2500.00");
      }
      else
      {
          salaryTextField.setText("4000.00");
      }
      if(designationComboBox.getSelectedItem()=="Trainee Nurse")
      {
          salaryTextField.setText("2000.00");
      }
      else if(designationComboBox.getSelectedItem()=="Nurse")
      {
          salaryTextField.setText("2250.00");
      }
      else if(designationComboBox.getSelectedItem()=="Senior Nurse")
      {
          salaryTextField.setText("2500.00");
      }
      else
      {
          salaryTextField.setText("4000.00");
      }
      if(designationComboBox.getSelectedItem()=="Trainee Consultant")
      {
          salaryTextField.setText("2000.00");
      }
      else if(designationComboBox.getSelectedItem()=="Junior Consultant")
      {
          salaryTextField.setText("2250.00");
      }
      else if(designationComboBox.getSelectedItem()=="Senior Consultant")
      {
          salaryTextField.setText("2500.00");
      }
      else
      {
          salaryTextField.setText("4000.00");
      }
   return salaryTextField.getText();   
  }
public void populateTotalSalary()
{
    DefaultTableModel dtm =  (DefaultTableModel)salaryTable.getModel();
    dtm.setRowCount(0);
    int totalSalary=0;
     for(Employee emp : empDir.getEmployeeList())
     {
        Object row[] = new Object[3];
        row[0] = emp.getTeamType();
        row[1] = emp.getDesignation();
        row[2] = emp.getSalary();
        totalSalary += Integer.parseInt(emp.getSalary());
     }
  totalSalaryCalculated.setText("" +totalSalary);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeTypeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        designationComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        totalSalaryCalculated = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Manage Salaries");

        jLabel2.setText("Employee Type :");

        employeeTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employeeTypeComboBoxItemStateChanged(evt);
            }
        });
        employeeTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Designation :");

        designationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        designationComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                designationComboBoxItemStateChanged(evt);
            }
        });
        designationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Salary :");

        salaryTextField.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("        Salary for month of December 2018");

        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Type", "Designation", "Salary"
            }
        ));
        jScrollPane2.setViewportView(salaryTable);

        jLabel6.setText("Total salaries calculated :");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(employeeTypeComboBox, 0, 171, Short.MAX_VALUE)
                                .addComponent(designationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salaryTextField)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalSalaryCalculated, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(backBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(designationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalSalaryCalculated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(backBtn)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void designationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationComboBoxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_designationComboBoxActionPerformed

    private void employeeTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTypeComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_employeeTypeComboBoxActionPerformed

    private void employeeTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employeeTypeComboBoxItemStateChanged
        // TODO add your handling code here:
        populateDesignation();
    }//GEN-LAST:event_employeeTypeComboBoxItemStateChanged

    private void designationComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_designationComboBoxItemStateChanged
        // TODO add your handling code here:
         
         PopulateSalary();
    }//GEN-LAST:event_designationComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox designationComboBox;
    private javax.swing.JComboBox employeeTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable salaryTable;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JTextField totalSalaryCalculated;
    // End of variables declaration//GEN-END:variables
}
