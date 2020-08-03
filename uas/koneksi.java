/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author iqbal
 */
public class koneksi {
    
    private static Connection MySQLConfig = null;
    
    public static Connection  configDB() throws SQLException {
            
        try
        {
            String connectionURL = "jdbc:mysql://localhost/uasdatabase";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            MySQLConfig = (Connection) DriverManager.getConnection(connectionURL, username, password);
           
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
     }
        return MySQLConfig;
    }
}