/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package service;

import config.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.User;

/**
 *
 * @author OS
 */
public class CareerService {
    public void saveAnswer(Double hollandIndex, String result, User user) throws ClassNotFoundException{
        String sql = "insert into career values(?, ?, ?, ?, ?)";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setInt(1, genId());
            state.setString(2, convertDateToString());
            state.setDouble(3, hollandIndex);
            state.setString(4, result);
            state.setInt(5, user.getId());
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public Integer genId() throws ClassNotFoundException{
//        List<User> users = new ArrayList<>();
        String sql1 = "SELECT * FROM career";
        int id = 1;
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql1);
            
            ResultSet rs = state.executeQuery();
            
            while(rs.next()){
                int tmp = rs.getInt(1);
                if(tmp == id)
                    id++;
                else
                    break;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
    
    public String convertDateToString() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);

        Date today = Calendar.getInstance().getTime();        
        String todayAsString = df.format(today);

        return todayAsString;
    }
    
}
