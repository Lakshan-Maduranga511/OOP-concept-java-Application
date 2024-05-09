/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Department {

    private String Department;

    public Department(String Department) {

        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public boolean AddDepartment() {
        try {
            String url = "jdbc:derby://localhost:1527/TheTechCompany";
            Connection con = DriverManager.getConnection(url, "abc", "123");
            String record = Department;
            String InsertQuery = "INSERT INTO Department (DEPARTMENTNAME) VALUES (?)";
            PreparedStatement preparedStatement = con.prepareStatement(InsertQuery);
            preparedStatement.setString(1, record);
            int rowsNum = preparedStatement.executeUpdate();

            if (rowsNum > 0) {
                System.out.println("Data inserted successfully!");
                return true;
            } else {
                System.out.println("Data insertion failed!");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

}
