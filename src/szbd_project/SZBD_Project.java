/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szbd_project;
import java.sql.*;
/**
 *
 * @author Patryk
 */
public class SZBD_Project {
    public final static String USERNAME = "user45";
    public final static String PASSWORD = "huhu4";
    public final static String URL = "jdbc:mysql://localhost:3306/testdb";
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Polaczono");
        Statement stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("select DISTINCT * from first");
        while(rs.next())
        {
            System.out.println(rs.getInt(1));
        }
        
        /* for (int i = 0; i < 15; i++)
        {
           stmt.executeUpdate("INSERT INTO first VALUES (" + new Integer(i).toString() + ")");
        }*/
        
        rs.close();
        stmt.close();
        conn.close();
    }
    
}
