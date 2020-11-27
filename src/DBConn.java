
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hammad Ashraf
 */
public class DBConn {
    public boolean UDI(String query)
    {   
            try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\MBB\\MarriageBeurro.accdb");
            conn.createStatement();
            Statement stmt = conn.createStatement();
            stmt.execute(query);
            conn.close();
            return true;
            
        } 
        catch(java.lang.ClassNotFoundException ex)
        {
            return false;
        } 
        catch(Exception ex)
        {
             return false;
        }  
    }    
     public ResultSet Search(String query)
    {   
            try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://D:\\MBB\\MarriageBeurro.accdb");
            conn.createStatement();
            Statement stmt = conn.createStatement();
            stmt.execute(query);
              ResultSet rs=stmt.getResultSet();
            return rs;
        } 
        catch(java.lang.ClassNotFoundException ex)
        {
            return null;
        } 
        catch(Exception ex)
        {
             return null;
        }  


    }
}

