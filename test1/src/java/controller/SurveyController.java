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
@WebServlet(name = "SurveyController", urlPatterns = {"/survey"})
public class SurveyController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "KhaoSat.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="";
        String diemThi = request.getParameter("diemThi");
        String thuNhap = request.getParameter("thuNhap");
        String thoiGianDaoTao = request.getParameter("thoiGianDaoTao");
        String kienThuc = request.getParameter("kienThuc");
        
        System.out.println(diemThi);
        System.out.println(thuNhap);
        System.out.println(thoiGianDaoTao);
        System.out.println(kienThuc);

        HttpSession session = request.getSession();
        Float diemTB = (Float) session.getAttribute("diemTB");
        System.out.println("Diem trung binh : " + diemTB);
        url = "/TuVanTuyenSinh/multichoice";
        
        Float caoDangXS = 1.f;
        Float daiHocXS = 1.f;
        if(diemTB < 5.0){
            caoDangXS *= (4.f/12.f);
            daiHocXS *= 0.f;
            session.setAttribute("mark", "Y");
        }
        else if(diemTB < 7.0) {
            caoDangXS *= (5.f/12.f);
            daiHocXS *= (2.f/8.f);
            session.setAttribute("mark", "TB");
        }
        else if(diemTB < 8.0) {
            caoDangXS *= (2.f/12.f);
            daiHocXS *= (2.f/8.f);
            session.setAttribute("mark", "K");
        }
        else{
            caoDangXS *= (1.f/12.f);
            daiHocXS *= (4.f/8.f);
            session.setAttribute("mark", "G");
        }
        
        if(diemThi.equals("T")){
            caoDangXS *= (3.f/12.f);
            daiHocXS *= 0.f;
            session.setAttribute("capacity", "T_Y");
        }
        else if(diemThi.equals("TB")){
            caoDangXS *= (4.f/12.f);
            daiHocXS *= (2.f/8.f);
            session.setAttribute("capacity", "T_TB");
        }
        else if(diemThi.equals("K")){
            caoDangXS *= (3.f/12.f);
            daiHocXS *= (4.f/8.f);
            session.setAttribute("capacity", "T_K");
        }
        else if(diemThi.equals("C")){
            caoDangXS *= (2.f/12.f);
            daiHocXS *= (2.f/8.f);
            session.setAttribute("capacity", "T_G");
        }
        
        if(thuNhap.equals("T")){
            caoDangXS *= (3.f/12.f);
            daiHocXS *= 0.f;
            session.setAttribute("tuition", "TNT");
        }
        else if(thuNhap.equals("TB")){
            caoDangXS *= (7.f/12.f);
            daiHocXS *= (3.f/8.f);
            session.setAttribute("tuition", "TNB");
        }
        else if(thuNhap.equals("C")){
            caoDangXS *= (2.f/12.f);
            daiHocXS *= (5.f/8.f);
            session.setAttribute("tuition", "TNC");
        }
        
        if(thoiGianDaoTao.equals("N")){
            caoDangXS *= (6.f/12.f);
            daiHocXS *= (3.f/8.f);
            session.setAttribute("time", "TGN");
        }
        else if(thoiGianDaoTao.equals("D")){
            caoDangXS *= (6.f/12.f);
            daiHocXS *= (5.f/8.f);
            session.setAttribute("time", "TGD");
        }
        
        if(kienThuc.equals("TH")){
            caoDangXS *= (6.f/13.f);
            daiHocXS *= (3.f/7.f);
            session.setAttribute("knowledge", "KTTH");
        }
        else if(kienThuc.equals("LT")){
            caoDangXS *= (7.f/13.f);
            daiHocXS *= (4.f/7.f);
            session.setAttribute("knowledge", "KTLT");
        }
        
        System.out.println("Chi so dao tao : " + caoDangXS + " " + daiHocXS);
        if(daiHocXS > caoDangXS) {
            session.setAttribute("CTDT", "DH");
        }
        else
            session.setAttribute("CTDT", "CD");
        response.sendRedirect(url);
    }

}
