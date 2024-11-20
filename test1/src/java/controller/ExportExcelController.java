/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.History;
import model.Training;
import model.User;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.HistoryService;
import service.TrainningService;

/**
 *
 * @author THINKPAD
 */
@WebServlet(name = "ExportExcelController", urlPatterns = {"/export"})
public class ExportExcelController extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        User user = (User) session.getAttribute("user");
        HistoryService historyService = new HistoryService();
        TrainningService trainningService = new TrainningService();
        
        Workbook workbook = new XSSFWorkbook();
        
        // Tạo một sheet trong workbook
        Sheet sheet = workbook.createSheet("Data");
        // Tạo dữ liệu mẫu
        
        
        // Duyệt qua dữ liệu và ghi vào sheet
        Row titleRow = sheet.createRow(0);
        Cell titleCell = titleRow.createCell(0);
        titleCell.setCellValue("Lịch sử kết quả và thông tin người dùng");
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 7)); // Merge cells
        
        
        
        Row inforRow1 = sheet.createRow(1);
        Cell inforCell2 = inforRow1.createCell(0);
        inforCell2.setCellValue("Thong tin ca nhan");
        sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 7)); //
        
        Row inforDetailsRow1 = sheet.createRow(2);
        Cell fullnameCell1 = inforDetailsRow1.createCell(0);
        fullnameCell1.setCellValue("Ho tẻn: ");
        Cell fullnameCell2 = inforDetailsRow1.createCell(1);
        fullnameCell2.setCellValue(user.getFullname());
        
        Row inforDetailsRow2 = sheet.createRow(3);
        Cell emailCell1 = inforDetailsRow2.createCell(0);
        emailCell1.setCellValue("Email: ");
        Cell emailCell2 = inforDetailsRow2.createCell(1);
        emailCell2.setCellValue(user.getEmail());
        
        
        Row titleRow1 = sheet.createRow(4);
        Cell titleCell1 = titleRow1.createCell(0);
        titleCell1.setCellValue("Lịch sử kết quả chương trình đào tạo");
        sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 7)); // Merge cells
        
        int currentRow = 5;
        // Tiêu đề cột cho dữ liệu của "Lịch sử kết quả chương trình đào tạo"
        String[] columnHeaders1 = {"STT","Lịch sử","Điểm thi thử","Học lực","Chi phí","Thời gian đào tạo","Kiến thức","Kết quả"};
        Row headerRow1 = sheet.createRow(currentRow);
        for (int i = 0; i < columnHeaders1.length; i++) {
            Cell headerCell = headerRow1.createCell(i);
            headerCell.setCellValue(columnHeaders1[i]);
        }
        currentRow++;
        
        try {
            int countNum1 = 1;
            List<Training> trainings = trainningService.getAllTrainings(user);
            for (int i = 0; i < trainings.size(); i++) {
                Row headerRowTbl1 = sheet.createRow(currentRow);
                Cell headerCell0 = headerRowTbl1.createCell(0);
                headerCell0.setCellValue(countNum1++);
                Cell headerCell1 = headerRowTbl1.createCell(1);
                headerCell1.setCellValue(trainings.get(i).getHistory());
                Cell headerCell2 = headerRowTbl1.createCell(2);
                headerCell2.setCellValue(trainings.get(i).getMark());
                Cell headerCell3 = headerRowTbl1.createCell(3);
                headerCell3.setCellValue(trainings.get(i).getCapacity());
                Cell headerCell4 = headerRowTbl1.createCell(4);
                headerCell4.setCellValue(trainings.get(i).getTuition());
                Cell headerCell5 = headerRowTbl1.createCell(5);
                headerCell5.setCellValue(trainings.get(i).getTime());
                Cell headerCell6 = headerRowTbl1.createCell(6);
                headerCell6.setCellValue(trainings.get(i).getKnowledge());
                Cell headerCell7 = headerRowTbl1.createCell(7);
                headerCell7.setCellValue(trainings.get(i).getResult());
                
                currentRow++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Row titleRow2 = sheet.createRow(currentRow);
        Cell titleCell2 = titleRow2.createCell(0);
        titleCell2.setCellValue("Lịch sử kết quả nhóm tính cách");
        sheet.addMergedRegion(new CellRangeAddress(currentRow, currentRow, 0, 7)); // Merge cells
        currentRow++;
        String[] columnHeaders2 = {"STT",	"Lịch sử",	"Chỉ số Holland",	"Nhóm tính cách"};
        Row headerRow2 = sheet.createRow(currentRow++);
        for (int i = 0; i < columnHeaders2.length; i++) {
            Cell headerCell = headerRow2.createCell(i);
            headerCell.setCellValue(columnHeaders2[i]);
        }
        
        try {
            int countNum1 = 1;
            List<History> historys = historyService.getAllHistorys(user);
            for (int i = 0; i < historys.size(); i++) {
                Row headerRowTbl1 = sheet.createRow(currentRow);
                Cell headerCell0 = headerRowTbl1.createCell(0);
                headerCell0.setCellValue(countNum1++);
                Cell headerCell1 = headerRowTbl1.createCell(1);
                headerCell1.setCellValue(historys.get(i).getHistory());
                Cell headerCell2 = headerRowTbl1.createCell(2);
                headerCell2.setCellValue(historys.get(i).getHollandIndex());
                Cell headerCell3 = headerRowTbl1.createCell(3);
                String result = historys.get(i).getResult();
                if (result.equals("g1")) {
                    headerCell3.setCellValue("Thực tế");
                } else if (result.equals("g2")) {
                    headerCell3.setCellValue("Khám phá");
                } else if (result.equals("g3")) {
                    headerCell3.setCellValue("Sáng tạo");
                } else if (result.equals("g4")) {
                    headerCell3.setCellValue("Xã hội");
                } else if (result.equals("g5")) {
                    headerCell3.setCellValue("Thử thách");
                } else if (result.equals("g6")) {
                    headerCell3.setCellValue("Tổ chức");
                }
                
              
                currentRow++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Tạo một luồng để ghi workbook ra file
        try (FileOutputStream outputStream = new FileOutputStream("data.xlsx")) {
            workbook.write(outputStream);
        }
        
        // Thiết lập các header cho phản hồi HTTP
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=data.xlsx");
        
        // Gửi dữ liệu xuống client
        try (FileOutputStream fileOut = new FileOutputStream("data.xlsx")) {
            workbook.write(response.getOutputStream());
        }
        
        // Giải phóng tài nguyên
        workbook.close();
    }

    
    

}
