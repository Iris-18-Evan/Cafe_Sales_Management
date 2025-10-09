/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe_Sales_Managment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ucwaz
 */
public class ConnectionClass {
    static Connection createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_sales_management", "root", "274123");
        return c;
    }
}
