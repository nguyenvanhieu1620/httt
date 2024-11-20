/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author OS
 */
@WebServlet(name = "GradeController", urlPatterns = {"/grade"})
public class GradeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
            String url="DiemTongKet.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="";
                Float diemToan = Float.parseFloat(request.getParameter("toan").trim());
                Float diemLy = Float.parseFloat(request.getParameter("ly").trim());
                Float diemHoa = Float.parseFloat(request.getParameter("hoa").trim());
                
                Float diemSinh = Float.parseFloat(request.getParameter("sinh").trim());
                Float diemVan = Float.parseFloat(request.getParameter("van").trim());
                Float diemSu = Float.parseFloat(request.getParameter("su").trim());
                
                Float diemDia = Float.parseFloat(request.getParameter("dia").trim());
                Float diemGDCD = Float.parseFloat(request.getParameter("gdcd").trim());
                
                Float diemTB = (diemToan + diemLy + diemHoa + diemSinh + diemVan + diemSu + diemDia + diemGDCD) / 8;
                
		HttpSession session = request.getSession();
		session.setAttribute("diemTB", diemTB);
                url = "/TuVanTuyenSinh/survey";
		response.sendRedirect(url);
		
		
	}
}
