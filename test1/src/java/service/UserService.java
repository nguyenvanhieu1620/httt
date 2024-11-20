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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author OS
 */
public class UserService {
    public void saveUser(User user) throws ClassNotFoundException{
        String sql = "insert into user values(?, ?, ?, ?, ?)";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setInt(1, user.getId());
            state.setString(2, user.getFullname());
            state.setString(3, user.getEmail());
            state.setString(4, user.getUsername());
            state.setString(5, user.getPassword());
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    public User getInforUser(String username, String password) throws ClassNotFoundException {
        User user = new User();
        String sql = "select * from user where username = ? and password = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, username);
            state.setString(2, password);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
               user.setId(rs.getInt(1));
               user.setFullname(rs.getString(2));
               user.setEmail(rs.getString(3));
               user.setUsername(rs.getString(4));
               user.setPassword(rs.getString(5));
               return user;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static List<User> getAllItems() throws ClassNotFoundException{
        List<User> users = new ArrayList<>();
        String sql1 = "SELECT * FROM user";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state1 = conn.prepareCall(sql1);
            
            ResultSet rs = state1.executeQuery();
            int id = 0;
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setFullname(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setUsername(rs.getString(4));
                user.setPassword(rs.getString(5));
                users.add(user);
            }
            state1.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }
    public static Integer genNewId(){
        List<User> users = new ArrayList<>();
        String sql1 = "select max(id) from user;";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state1 = conn.prepareCall(sql1);
            
            ResultSet rs = state1.executeQuery();
            int id = 0;
            rs.next();
            Integer newId = rs.getInt(1) + 1;
            state1.close();
            conn.close();
            return newId;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return 1;
    }
}
