/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.StatisticService;

/**
 *
 * @author THINKPAD
 */
@WebServlet(name = "StatisticController", urlPatterns = {"/static/*"})
public class StatisticController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        StatisticService statisticService = new StatisticService();
        if (pathInfo == null || pathInfo.equals("/")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing endpoint");
            return;
        }

        switch (pathInfo) {
            case "/career":
                getCareerData(response, statisticService);
                break;
            case "/training":
                getTrainingData(response, statisticService);
                break;
            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Endpoint not found");
                break;
        }
        
        
//        String url = "ThongKe.jsp";
//        RequestDispatcher rd = request.getRequestDispatcher(url);
//        rd.forward(request, response);
    }

    
    private void getCareerData(
            HttpServletResponse response, 
            StatisticService statisticService
    ) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        
        Gson gson = new Gson();
        String json = gson.toJson(statisticService.getCareerCharts());

        // Trả về JSON response
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
        
    }
    
    private void getTrainingData(
            HttpServletResponse response, 
            StatisticService statisticService
    ) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        
        Gson gson = new Gson();
        String json = gson.toJson(statisticService.getTrainingCharts());

        // Trả về JSON response
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }
    
    
    
   
        
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
