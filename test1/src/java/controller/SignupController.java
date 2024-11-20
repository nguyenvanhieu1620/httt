/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import service.UserService;

/**
 *
 * @author OS
 */
@WebServlet(urlPatterns = {"/signup"})
public class SignupController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "SignUp.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";
        request.setCharacterEncoding("utf-8");
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm-password");
        
        if(!password.equals(confirmPassword)){
            request.setAttribute("error","Khong trung mat khau");
            url="/TuVanTuyenSinh/signup";
        }
        
        else{
            UserService service = new UserService();
            User user = new User();
            
            
            Integer newId = UserService.genNewId();
            user.setId(newId);
            user.setFullname(fullname);
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(password);
            
            try {
                service.saveUser(user);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
            }
            url = "/TuVanTuyenSinh/login";
        }
        response.sendRedirect(url);
    }


}
