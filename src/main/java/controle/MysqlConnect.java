/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gregory
 */
public class MysqlConnect {
  
    public static Connection connectDB() throws
    SQLException, ClassNotFoundException {
    // Carregando o driver
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/testdb", "admim",
    "admimrefeitorio");

    return conn;
    }
}
