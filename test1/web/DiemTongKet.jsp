<%-- 
    Document   : DiemTongKet
    Created on : Nov 25, 2023, 11:30:53 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Điểm Tổng Kết</title>
        <style>
            body {
                margin: 0;
                padding: 0;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background-image: url('/Asset/image/BG2.jpg'); /* Thay đổi 'background.jpg' thành tên ảnh nền của bạn */
                background-size: cover;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
            }

            .container {
                width: 70%;
                overflow: hidden;
                background: rgba(255, 255, 255, 0.9); /* Điều chỉnh độ trong suốt của form */
                border-radius: 10px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            }

            .column {
                width: 50%;
                float: left;
                box-sizing: border-box;
                padding: 20px;
            }

            h2 {
                text-align: center;
                color: #333;
            }

            form {
                margin-top: 20px;
            }

            label {
                display: block;
                margin-bottom: 8px;
                color: #333;
            }

            input {
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


            <form method="post" action="grade">
                <div class="column">
                    <label for="toan">Toán:</label>
                    <input type="text" id="toan" name="toan">

                    <label for="ly">Lý:</label>
                    <input type="text" id="ly" name="ly">

                    <label for="hoa">Hóa:</label>
                    <input type="text" id="hoa" name="hoa">

                    <label for="sinh">Sinh:</label>
                    <input type="text" id="sinh" name="sinh">
                </div>
                <div class="column">
                    <label for="van">Văn:</label>
                    <input type="text" id="van" name="van">

                    <label for="su">Sử:</label>
                    <input type="text" id="su" name="su">

                    <label for="dia">Địa:</label>
                    <input type="text" id="dia" name="dia">

                    <label for="gdcd">GDCD:</label>
                    <input type="text" id="gdcd" name="gdcd">

                    <button type="submit">Gửi</button>
                </div>
            </form>
        </div>
    </div>

    <script>
        function validateForm(...fields) {
            for (let field of fields) {
                let value = document.getElementById(field).value.trim();
                if (value === "" || isNaN(value) || +value <= 0 || +value >= 10) {
                    alert(`Vui lòng nhập giá trị hợp lệ cho ${field}. Giá trị phải là số lớn hơn 0 và nhỏ hơn 10.`);
                    return false;
                }
            }

            return true;
        }
    </script>
</body>
</html>
