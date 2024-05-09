/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Employee extends javax.swing.JFrame {

    private Object ClassPackage;

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        FillcomboboxusingDatabase1();
        FillcomboboxusingDatabase2();
    }

    public Employee(Locale lcl) {
        Locale.setDefault(lcl);
        initComponents();
        FillcomboboxusingDatabase1();
        FillcomboboxusingDatabase2();
    }

    public void FillcomboboxusingDatabase1() {

        try {
            String url = "jdbc:derby://localhost:1527/TheTechCompany";
            Connection con = DriverManager.getConnection(url, "abc", "123");

            String query = "SELECT  DEPARTMENTNAME FROM Department";
            PreparedStatement statement = con.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            for (int i = 0; resultSet.next(); i++) {
                String value = resultSet.getString("DEPARTMENTNAME");
                cmbDepartment.addItem(value);
                System.out.println(value);

            }
        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    public void FillcomboboxusingDatabase2() {

        try {
            String url = "jdbc:derby://localhost:1527/TheTechCompany";
            Connection con = DriverManager.getConnection(url, "abc", "123");

            String query = "SELECT  DESIGNATIONNAME FROM Designation";
            PreparedStatement statement = con.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            for (int i = 0; resultSet.next(); i++) {
                String value = resultSet.getString("DESIGNATIONNAME");
                cmbDesignation.addItem(value);
                System.out.println(value);

            }
        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeEPFNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbDesignation = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSallary = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        setTitle(bundle.getString("Employee.title")); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(89, 89, 89));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(bundle.getString("Employee.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 88, 135, -1));

        txtEmployeeName.setBackground(new java.awt.Color(51, 51, 51));
        txtEmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 85, 160, -1));

        jLabel2.setText(bundle.getString("Employee.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 34, 144, -1));

        txtEmployeeEPFNumber.setBackground(new java.awt.Color(51, 51, 51));
        txtEmployeeEPFNumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtEmployeeEPFNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 31, 160, -1));

        jLabel3.setText(bundle.getString("Employee.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 148, 102, -1));

        cmbDepartment.setBackground(new java.awt.Color(51, 51, 51));
        cmbDepartment.setForeground(new java.awt.Color(255, 255, 255));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 145, 105, -1));

        jLabel4.setText(bundle.getString("Employee.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 220, 93, -1));

        cmbDesignation.setBackground(new java.awt.Color(51, 51, 51));
        cmbDesignation.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cmbDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 217, 105, -1));

        btnInsert.setBackground(new java.awt.Color(102, 102, 102));
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText(bundle.getString("Employee.btnInsert.text")); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText(bundle.getString("Employee.btnUpdate.text")); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText(bundle.getString("Employee.btnDelete.text")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel5.setText(bundle.getString("Employee.jLabel5.text")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 291, 72, -1));

        txtSallary.setBackground(new java.awt.Color(51, 51, 51));
        txtSallary.setForeground(new java.awt.Color(255, 255, 255));
        txtSallary.setText(bundle.getString("Employee.txtSallary.text")); // NOI18N
        jPanel1.add(txtSallary, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 291, 105, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(bundle.getString("Employee.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 490, 420));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(bundle.getString("Employee.jLabel8.text")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\TheTechCompany\\Assets\\Gadient Bricks - IPhone Wallpapers (1).png")); // NOI18N
        jLabel6.setText(bundle.getString("Employee.jLabel6.text")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed

    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (txtEmployeeName.getText().isEmpty() || txtEmployeeEPFNumber.getText().isEmpty() || cmbDesignation.getSelectedItem().toString().isEmpty() || cmbDepartment.getSelectedItem().toString().isEmpty() || txtSallary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Add a new Employee", JOptionPane.WARNING_MESSAGE);

        } else {

            String name = txtEmployeeName.getText();
            String Number = txtEmployeeEPFNumber.getText().toString();
            String Department = cmbDepartment.getSelectedItem().toString();
            String Designation = cmbDesignation.getSelectedItem().toString();
            String Sallary = txtSallary.getText().toString();

            ClassPackage.Employee newEmp = new ClassPackage.Employee(name, Number, Department, Designation, Sallary);

            if (newEmp.AddEmployee()) {

                JOptionPane.showMessageDialog(null, "Employee added succesfully", "Add a new Employee", JOptionPane.INFORMATION_MESSAGE);
                try {

                    Date dt = new Date();
                    DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
                    File f = new File("C:\\Users\\User\\OneDrive\\Desktop\\Log.txt");
                    FileWriter fw = new FileWriter(f, true);
                    fw.write("Record Added"+"  " + txtEmployeeEPFNumber.getText() + " " + df.format(dt) + "\n");
                    fw.flush();
                    fw.close();
                } catch (IOException e) {

                    System.out.println(e.getMessage());
                }
                txtEmployeeEPFNumber.setText("");
                txtEmployeeName.setText("");
                txtSallary.setText("");
                txtEmployeeName.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "sorry!something went wrong with the application", "Add a new employee", JOptionPane.WARNING_MESSAGE);

            }
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtEmployeeName.getText().isEmpty() || txtEmployeeEPFNumber.getText().isEmpty() || cmbDesignation.getSelectedItem().toString().isEmpty() || cmbDepartment.getSelectedItem().toString().isEmpty() || txtSallary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty", "Add a new Employee", JOptionPane.WARNING_MESSAGE);

        } else {
            String name = txtEmployeeName.getText().trim();
            String Number = txtEmployeeEPFNumber.getText();
            String Department = cmbDepartment.getSelectedItem().toString();
            String Designation = cmbDesignation.getSelectedItem().toString();
            String Sallary = txtSallary.getText().toString();

            ClassPackage.Employee UpdateEmp = new ClassPackage.Employee(name, Number, Department, Designation, Sallary);
            if (UpdateEmp.UpdateEmployee()) {
                JOptionPane.showMessageDialog(null, "Employee Details Update succesfully", "Update  Employee", JOptionPane.INFORMATION_MESSAGE);
                txtEmployeeEPFNumber.setText("");
                txtEmployeeName.setText("");
                txtSallary.setText("");
                txtEmployeeName.requestFocus();
            } else {

                JOptionPane.showMessageDialog(null, "sorry!something went wrong with the application", "Update employee", JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (txtEmployeeEPFNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Employee EPF Number Field is empty", "Delete Employee Details", JOptionPane.ERROR_MESSAGE);
        } else {
            String Number = txtEmployeeEPFNumber.getText();
            try {
                String url = "jdbc:derby://localhost:1527/TheTechCompany";
                Connection con = DriverManager.getConnection(url, "abc", "123");
                Statement stmt = con.createStatement();

                String deleteQuery = "DELETE FROM EMPLOYEE WHERE EPFNUMBER = ?";
                PreparedStatement preparedStatement = con.prepareStatement(deleteQuery);
                preparedStatement.setString(1, Number);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully Delete Employee ", "Delete Employee", JOptionPane.INFORMATION_MESSAGE);
                    txtEmployeeEPFNumber.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, " No Employee found  ", "Delete Employee", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ManagerMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbDesignation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmployeeEPFNumber;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtSallary;
    // End of variables declaration//GEN-END:variables

    boolean searchEmployee(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean DeleteEmployee(String Number) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
