/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedChat.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bikrant bikram
 */
public class DBConnection {
    private static Connection conn;
    static
    {
         try
                {
                    Class.forName("oracle.jdbc.OracleDriver");
                    conn=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@//MAURYA:1521/xe","system","abhishek@786");
 //                   JOptionPane.showMessageDialog(null,"connect to database");
               
                   JOptionPane.showMessageDialog(null,"connected to database");
                   
                    
                }
                catch(Exception e) 
                        {
                          e.printStackTrace();
                          JOptionPane.showMessageDialog(null,"can't connect to the database");
                        }
    }
    public  static Connection getConnection()//bcs we didnt wanted to create object of this class
    {
        return conn;
    }
    
    
    public static void closeConnection()//for closing connection 
    {
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null,"connnection closed from database");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
             JOptionPane.showMessageDialog(null,"connt close the connection");
        }
    
}
}

