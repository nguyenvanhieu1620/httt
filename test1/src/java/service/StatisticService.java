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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CareerChart;
import model.TrainingChart;

/**
 *
 * @author THINKPAD
 */
public class StatisticService {
    public List<CareerChart> getCareerCharts() {
        String sql1 = "select result, count(*) from career group by result";
        int id = 1;
        List<CareerChart> datas = new ArrayList<>();
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql1);
            
            ResultSet rs = state.executeQuery();
            Map<String, Integer> careers = new HashMap<>();
            careers.put("g1", 0);
            careers.put("g2", 0);
            careers.put("g3", 0);
            careers.put("g4", 0);
            careers.put("g5", 0);
            careers.put("g6", 0);
            
            
            while(rs.next()){
                String tmp = rs.getString(1);
                String careerString = rs.getString(1);
                careers.put(careerString, rs.getInt(2));
               
            }
            for (Map.Entry<String, Integer> entry : careers.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();
                CareerChart careerChart = new CareerChart(key, val);
                switch (key) {
                    case "g1":
                        careerChart.setDisplayName("Kỹ Thuật");
                        break;
                    case "g2":
                        careerChart.setDisplayName("Nghiên Cứu");
                        break;
                    case "g3":
                        careerChart.setDisplayName("Nghệ Thuật");
                        break;
                    case "g4":
                        careerChart.setDisplayName("Xã Hội");
                        break;
                    case "g5":
                        careerChart.setDisplayName("Quản Lý");
                        break;
                    case "g6":
                        careerChart.setDisplayName("Nghiệp Vụ");
                        break;
                        
                }
                    
                datas.add(careerChart);
            }
            Collections.sort(datas);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StatisticService.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return datas;
    }
    
    public List<TrainingChart> getTrainingCharts() {
        String sql1 = "select result, count(*) from training group by result";
        int id = 1;
        List<TrainingChart> datas = new ArrayList<>();
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareCall(sql1);
            
            ResultSet rs = state.executeQuery();
            Map<String, Integer> trainings = new HashMap<>();
            trainings.put("DH", 0);
            trainings.put("CD", 0);

            while(rs.next()){
                String tmp = rs.getString(1);
                String trainingString = rs.getString(1);
                trainings.put(trainingString, rs.getInt(2));
               
            }
            for (Map.Entry<String, Integer> entry : trainings.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();
                TrainingChart trainingChart = new TrainingChart(key, val);
                switch (key) {
                    case "CD":
                        trainingChart.setDisplayName("Cao Đẳng");
                        break;
                    case "DH":
                        trainingChart.setDisplayName("Đại học");
                        break;   
                }
                datas.add(trainingChart);
            }
            Collections.sort(datas);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StatisticService.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return datas;
    }
}
