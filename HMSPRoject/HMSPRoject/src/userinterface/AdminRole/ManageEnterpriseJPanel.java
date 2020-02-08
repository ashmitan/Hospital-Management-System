/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.MedicalEquipmentSupplierEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lsrajput
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel displayJPanel;
    private Ecosystem ecosystem;
    public ManageEnterpriseJPanel(JPanel displayJPanel, Ecosystem ecosystem) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.ecosystem = ecosystem;
        populateTable();
        populateEnterpriseComboBox();
        
    }

    public void populateEnterpriseComboBox(){
        enterpriseTypeComboBox.removeAllItems();
        enterpriseTypeComboBox.addItem(Enterprise.EnterpriseType.Hospital);
        enterpriseTypeComboBox.addItem(Enterprise.EnterpriseType.MedicalEquipmentSupplier);

    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) manageEnterpriseJTable.getModel();
        
        model.setRowCount(0);
        
        for (Enterprise ent : ecosystem.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
            Object[] row = new Object[2];
            row[0] = ent.getFullname();
            row[1] = ent.getEnterpriseType();
            model.addRow(row);
        }
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
        manageEnterpriseJTable = new javax.swing.JTable();
        enterpriseTypeJLabel = new javax.swing.JLabel();
        enterpriseTypeComboBox = new javax.swing.JComboBox();
        enterpriseNameJLabel = new javax.swing.JLabel();
        enterpriseNameTxtField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        manageEnterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageEnterpriseJTable);
        if (manageEnterpriseJTable.getColumnModel().getColumnCount() > 0) {
            manageEnterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            manageEnterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        enterpriseTypeJLabel.setText("Enterprise Type :");

        enterpriseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hospital", "Supplier" }));

        enterpriseNameJLabel.setText("Enterprise Name :");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

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
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enterpriseTypeJLabel)
                                .addComponent(enterpriseNameJLabel))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(enterpriseTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseNameTxtField)))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseTypeJLabel)
                    .addComponent(enterpriseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseNameJLabel)
                    .addComponent(enterpriseNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(backBtn))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        displayJPanel.remove(this);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        //Enterprise enterprise = (Enterprise) enterpriseTypeComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeComboBox.getSelectedItem();
        String name = enterpriseNameTxtField.getText();
        
        Enterprise enterprise = ecosystem.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise(name, type);
        populateTable();
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JTextField enterpriseNameTxtField;
    private javax.swing.JComboBox enterpriseTypeComboBox;
    private javax.swing.JLabel enterpriseTypeJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageEnterpriseJTable;
    // End of variables declaration//GEN-END:variables
}