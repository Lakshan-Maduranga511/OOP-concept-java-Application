/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Employee {

    private String EmployeeName;
    private String EmployeeEPFNumber;
    private String Department;
    private String Designation;
    private String Sallary;

    public static Connection mycon() {
        Connection connection = null;
        try {
            String url = "jdbc:derby://localhost:1527/TheTechCompany";
            connection = DriverManager.getConnection(url, "abc", "123");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return connection;
    }

    public Employee() {
    }

    public Employee(String EmployeeName, String EmployeeEPFNumber, String Department, String Designation, String Sallary) {

        this.EmployeeName = EmployeeName;
        this.EmployeeEPFNumber = EmployeeEPFNumber;
        this.Department = Department;
        this.Designation = Designation;
        this.Sallary = Sallary;

    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeEPFNumber() {
        return EmployeeEPFNumber;
    }

    public void setEmployeeEPFNumber(String EmployeeEPFNumber) {
        this.EmployeeEPFNumber = EmployeeEPFNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;

    }

    public String getSallary() {

        return Sallary;
    }

    public void setSallary(String Sallary) {
        this.Sallary = Sallary;

    }

    public boolean AddEmployee() {
        Connection connection = mycon();

        if (connection != null) {

            try {

                Statement s = connection.createStatement();
                s.executeUpdate("INSERT INTO Employee" + "(NAME,EPFNUMBER,DEPARTMENT,DESIGNATION,SALLARY) VALUES ('" + EmployeeName + "','" + EmployeeEPFNumber + "','" + Department + "','" + Designation + "','" + Sallary + "')");
                return true;

            } catch (SQLException e) {

                System.out.println("Error: +" + e.getMessage());
            }
        }
        return true;
    }

    public boolean UpdateEmployee() {

        Connection connection = mycon();

        if (connection != null) {

            try {

                Statement s = connection.createStatement();
                s.executeUpdate("UPDATE Employee SET NAME ='" + EmployeeName + "', DEPARTMENT ='" + Department + "', DESIGNATION ='" + Designation + "', SALLARY='" + Sallary + "' WHERE EPFNUMBER ='" + EmployeeEPFNumber + "'");

            } catch (SQLException e) {

                System.out.println("Error: " + e.getMessage());

            }

        }
        return true;

    }

}
