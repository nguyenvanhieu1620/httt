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
import model.History;
import model.User;

/**
 *
 * @author OS
 */
public class HistoryService {
    public List<History> getAllHistorys(User user) throws ClassNotFoundException {
        List<History> historys = new ArrayList<>();
        String sql = "SELECT * FROM career where user_id = ?";
        
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql);
            state.setInt(1, user.getId());
            
            ResultSet rs = state.executeQuery();
           
            while(rs.next()){
                History history = new History();
                history.setId(rs.getInt(1));
                history.setHistory(rs.getDate(2));
                history.setHollandIndex(rs.getFloat(3));
                history.setResult(rs.getString(4));
                historys.add(history);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return historys;
    }
}
