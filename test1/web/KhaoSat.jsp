<%-- 
    Document   : KhaoSat
    Created on : Nov 26, 2023, 2:43:44 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Khảo Sát</title>
        <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background: url('Asset/image/BGKS2.jpg') no-repeat center center fixed;
                background-size: cover;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }

            .container {
                width: 50%;
                background: rgba(228, 228, 228, 0.8);
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(255, 255, 255, 0.2);
                padding: 20px;
            }

            label {
                display: block;
                margin-bottom: 8px;
                color: #333;
            }

            select {
                width: 100%;
                padding: 10px;
                margin-bottom: 15px;
                box-sizing: border-box;
            }

            button {
                width: 100%;
                padding: 12px;
                background-color: #4CAF50;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 16px;
            }

            button:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>


        <div class="container">
            <h2>Form Khảo Sát</h2>
            <form method="post" action="survey">
                <label for="diemThi">Điểm Thi Thử:</label>
                <select id="diemThi" name="diemThi">
                    <option value="T">Dưới 15 điểm</option>
                    <option value="TB">Từ 15 đến 21 điểm</option>
                    <option value="K">Từ 21 đến 24 điểm</option>
                    <option value="C">Từ 24 đến 30 điểm</option>
                </select>

                <label for="thuNhap">Thu nhập gia đình:</label>
                <select id="thuNhap" name="thuNhap">
                    <option value="C">Thu nhập cao</option>
                    <option value="TB">Thu nhập trung bình</option>
                    <option value="T">Thu nhập thấp</option>
                </select>

                <label for="thoiGianDaoTao">Thời gian đào tạo:</label>
                <select id="thoiGianDaoTao" name="thoiGianDaoTao">
                    <option value="N">Ngắn</option>
                    <option value="D">Dài</option>
                </select>

                <label for="kienThuc">Kiến thức:</label>
                <select id="kienThuc" name="kienThuc">
                    <option value="TH">Thiên hướng thực hành</option>
                    <option value="LT">Thiên hướng lý thuyết</option>
                </select>

                <button type="submit">Gửi</button>
            </form>
        </div>
    </body>
</html>
