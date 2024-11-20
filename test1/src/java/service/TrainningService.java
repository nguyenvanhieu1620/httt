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
import model.History;
import model.Training;
import model.User;

/**
 *
 * @author OS
 */
public class TrainningService {
    public void saveAnswer(String mark, String capacity, String tuition, String time, String knowledge, String result, User user) throws ClassNotFoundException{
        String sql = "insert into training values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            int value = genId();
            System.out.println("Value ID: " + value);
            state.setInt(1, value);
            state.setString(2, mark);
            state.setString(3, capacity);
            state.setString(4, tuition);
            state.setString(5, time);
            state.setString(6, knowledge);
            state.setString(7, convertDateToString());
            state.setString(8, result);
            state.setInt(9, user.getId());
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

        String sql1 = "SELECT * FROM training";
        int id = 1;
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql1);
            
            ResultSet rs = state.executeQuery(sql1);
            
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
    public List<Training> getAllTrainings(User user) throws ClassNotFoundException {
        List<Training> trainings = new ArrayList<>();
        String sql = "SELECT * FROM training where user_id = ?";
        
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql);
            state.setInt(1, user.getId());
            ResultSet rs = state.executeQuery();
           
            while(rs.next()){
                Training training = new Training();
                training.setId(rs.getInt(1));
                training.setMark(rs.getString(2));
                training.setCapacity(rs.getString(3));
                training.setTuition(rs.getString(4));
                training.setTime(rs.getString(5));
                training.setKnowledge(rs.getString(6));
                training.setHistory(rs.getDate(7));
                training.setResult(rs.getString(8));
                trainings.add(training);
                
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return trainings;
    }
}
