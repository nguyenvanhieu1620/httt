/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author OS
 */
public class JDBCConnection {
    private static final String sql = "jdbc:mysql://localhost:3306/tuyen_sinh_db";
    private static final String root = "pan";
    private static final String password = "1234";
    public static Connection getJDBCConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(sql, root, password);
        return conn;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection conn = getJDBCConnection();
//        if(conn != null) System.out.println("YES");
//        else System.out.println("NO");

        String pattern = "yyyy-MM-dd HH:mm:ss";

        // Create an instance of SimpleDateFormat used for formatting 
        // the string representation of date according to the chosen pattern
        DateFormat df = new SimpleDateFormat(pattern);

        // Get the today date using Calendar object.
        Date today = Calendar.getInstance().getTime();        
        // Using DateFormat format method we can create a string 
        // representation of a date with the defined format.
        String todayAsString = df.format(today);

        // Print the result!
        System.out.println("Today is: " + todayAsString);
    }
}
