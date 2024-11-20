<%-- 
    Document   : LichSu
    Created on : Nov 29, 2023, 9:20:42 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lich Su</title>
        <style>
            table {
                border-collapse: collapse;
                width: 100%;
            }

            table, th, td {
                border: 1px solid black;
            }

            th, td {
                padding: 8px;
                text-align: left;
            }

            th {
                background-color: #f2f2f2;
            }
            /* Modal styles */
            .modal {
                display: none;
                position: fixed;
                z-index: 1;
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgba(0, 0, 0, 0.5); /* Darker background */
                backdrop-filter: blur(5px); /* Blur background */
                animation: fadeIn 0.5s; /* Fade in effect */
            }

            .modal-content {
                background-color: #fff;
                margin: 10% auto; /* Center vertically and horizontally */
                padding: 20px;
                border: 1px solid #888;
                width: 60%; /* Width of modal */
                max-width: 600px; /* Max width of modal */
                border-radius: 10px; /* Rounded corners */
                box-shadow: 0 5px 15px rgba(0,0,0,0.3); /* Shadow for better appearance */
                animation: slideIn 0.5s; /* Slide in effect */
            }

            .close {
                color: #aaa;
                float: right;
                font-size: 28px;
                font-weight: bold;
                transition: color 0.3s; /* Smooth color transition */
            }

            .close:hover,
            .close:focus {
                color: #000;
                text-decoration: none;
                cursor: pointer;
            }

            /* Keyframes for animations */
            @keyframes fadeIn {
                from {
                    background-color: rgba(0, 0, 0, 0);
                }
                to {
                    background-color: rgba(0, 0, 0, 0.5);
                }
            }

            @keyframes slideIn {
                from {
                    transform: translateY(-50px);
                    opacity: 0;
                }
                to {
                    transform: translateY(0);
                    opacity: 1;
                }
            }


        </style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Career orientation UTT</title>
        <link rel="stylesheet" href="css/Style2.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">




    </head>
    <body>
        <header class="header">
            <div class="container">
                <h1 class="header__title">Career orientation UTT</h1>
                <nav class="header__nav">
                    <ul class="header__nav__list">
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/home" class="header__nav__link">Trang chủ</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/grade" class="header__nav__link">Bài khảo sát</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/history" class="header__nav__link">Kết quả đã khảo sát</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/chart" class="header__nav__link">Thống kê</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/login" class="header__nav__link">Đăng nhập</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/signup" class="header__nav__link">Đăng ký</a></li>
                    </ul>
                </nav>
            </div>
        </header>


        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lịch sử kết quả</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 20px;
                line-height: 1.6;
            }
            h2 {
                color: #333;
                margin-bottom: 10px;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin-bottom: 20px;
            }
            table, th, td {
                border: 1px solid #ddd;
            }
            th, td {
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #f2f2f2;
            }
            tr:nth-child(even) {
                background-color: #f9f9f9;
            }


            .header__nav__link:hover {
                background-color: #0056b3;
            }
            .export-btn {
                display: inline-block;
                padding: 10px 15px;
                color: white;
                background-color: rgb(223, 116, 70);
                text-decoration: none;
                border-radius: 5px;
                text-align: right;
                float: right;
                margin-bottom: 20px;
            }
            .export-btn:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
<body>

    <div>
        <h3>Thông tin người dùng</h3>
        <p>Họ tên: <span>${user.getFullname()}</span></p>
        <p>Email: <span>${user.getEmail()}</span></p>
    </div>
    <h2>Lịch sử kết quả chương trình đào tạo:</h2>
    <table>
        <tr>
            <th>STT</th>
            <th>Lịch sử</th>
            <th>Điểm thi thử</th>
            <th>Học lực</th>
            <th>Chi phí</th>
            <th>Thời gian đào tạo</th>
            <th>Kiến thức</th>
            <th>Kết quả</th>
        </tr>
        <c:forEach var="item" items="${requestScope.trainings}">
            <tr>
                <td>${item.getId()}</td>
                <td>${item.getHistory()}</td>
                <td>${item.getMark()}</td>
                <td>${item.getCapacity()}</td>
                <td>${item.getTuition()}</td>
                <td>${item.getTime()}</td>
                <td>${item.getKnowledge()}</td>
                <td>
                    <c:choose>
                        <c:when test="${item.getResult()=='CD'}">Cao đẳng</c:when>
                        <c:when test="${item.getResult()=='DH'}">Đại học</c:when>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h2>Lịch sử kết quả nhóm tính cách:</h2>
    <table>
        <tr>
            <th>STT</th>
            <th>Lịch sử</th>
            <th>Chỉ số Holland</th>
            <th>Nhóm tính cách</th>
        </tr>
        <c:forEach var="item" items="${requestScope.historys}">
            <tr>
                <td>${item.getId()}</td>
                <td>${item.getHistory()}</td>
                <td>${item.getHollandIndex()}</td>
                <td>
                    <c:choose>
                        <c:when test="${item.getResult()=='g1'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG1')">Nhóm người Thực tế</a>
                        </c:when>
                        <c:when test="${item.getResult()=='g2'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG2')">Nhóm người Khám phá</a>
                        </c:when>
                        <c:when test="${item.getResult()=='g3'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG3')">Nhóm người Sáng tạo</a>
                        </c:when>
                        <c:when test="${item.getResult()=='g4'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG4')">Nhóm người Xã hội</a>
                        </c:when>
                        <c:when test="${item.getResult()=='g5'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG5')">Nhóm người Thử thách</a>
                        </c:when>
                        <c:when test="${item.getResult()=='g6'}">
                            <a href="javascript:void(0)" onclick="showModal('modalG6')">Nhóm người Tổ chức</a>
                        </c:when>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>

    <!-- Modal G1 -->
    <div id="modalG1" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG1')">&times;</span>
            <h2>Nhóm người Thực tế</h2>
            <p> Những người thuộc nhóm thực tế thích làm việc với đồ vật (dụng cụ, máy móc, thiết bị), động vật hoặc cây cối. 
                Họ thường được mô tả là những người thực tế, khiêm tốn, kiên trì và trung thực. Họ cũng có xu hướng quyết đoán, cạnh tranh, và thích thú với các hoạt động cần nhiều sự vận động cơ thể, các kỹ năng và sức mạnh thể lực.</p>
            <p>Những ngành nghề có thể phù hợp vs bạn là: Nhà nông nghiệp, Vận động viên, Nhà nghiên cứu khoa học, Kỹ sư máy tính, Kỹ sư lập trình, Kỹ sư xây dựng, Kỹ sư cơ khí, Lính cứu hỏa,, Huấn luyện viên thể thao,...
            </p>
        </div>
    </div>

    <!-- Modal G2 -->
    <div id="modalG2" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG2')">&times;</span>
            <h2>Nhóm người Khám phá</h2>
            <p>Những người thuộc nhóm Khám phá thích làm việc với ý tưởng và dữ liệu. Họ thường được mô tả là những người có tư duy logic, tò mò, cẩn thận, độc lập, thông minh, khiêm tốn và trầm tính. Khi giải quyết vấn đề, họ thường đặt nhiều câu hỏi, suy nghĩ và quan sát, sau đó tổng hợp dữ liệu, tổ chức và phân tích thông tin. Họ cũng thích làm việc độc lập, thích các hoạt động cá nhân hoặc làm việc trong nhóm nhỏ hơn là các hoạt động cần sự tham gia của nhiều người.</p>
            <p>Những ngành nghề có thể phù hợp với bạn là: Nhà sinh vật học, Nhà hóa học, Nhà tham vấn tâm lý, Bác sĩ, Dược sĩ, Chuyên gia dinh dưỡng, Nhà kinh tế học, Nhà phân tích tài chính, Nhà tâm lý học, Nhà động vật học...
            </p>
        </div>
    </div>

    <!-- Modal G3 -->
    <div id="modalG3" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG3')">&times;</span>
            <h2>Nhóm người Sáng tạo</h2>
            <p>Những người thuộc nhóm Sáng tạo thích làm việc với ý tưởng và sự sáng tạo. Họ thường được mô tả là cởi mở, sáng tạo, độc đáo, nhạy cảm, bốc đồng và khác biệt. Họ không thích tuân theo các quy tắc và luật lệ hay làm các công việc lặp đi lặp lại, mà có hứng thú với các công việc có tính mới mẻ, cần vận dụng khả năng sáng tạo để giải quyết vấn đề hay tạo ra sản phẩm. Do vậy họ thường cảm thấy hứng thú và bị thu hút với các lĩnh vực nghệ thuật, văn hóa, thẩm mỹ...</p>
            <p>Những ngành nghề có thể phù hợp với bạn là: Nhà thiết kế nội thất, Nhà thiết kế thời trang, Nhà thiết kế đồ họa/nội thất, Họa sĩ, Thợ điêu khắc, Nhạc sĩ, Ca sĩ, Nhà thơ, Nhà văn, Nhiếp ảnh gia, Diễn viên, Diễn viên múa, Biên tập viên, Phiên dịch viên, Chuyên viên marketing, Kiến trúc sư, ...
            </p>
        </div>
    </div>

    <!-- Modal G4 -->
    <div id="modalG4" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG4')">&times;</span>
            <h2>Nhóm người Xã hội</h2>
            <p>Những người thuộc nhóm Xã hội thích làm việc với con người, họ cảm thấy hứng thú với việc giúp đỡ những người xung quanh hay làm các công việc giảng dạy, đào tạo, huấn luyện. Họ thường được mô tả là những người tốt bụng, có trách nhiệm, ấm áp, hợp tác, thân thiện, tốt bụng, hào phóng và kiên nhẫn. Họ có xu hướng tìm kiếm cũng như hình thành các mối quan hệ gần gũi với những người xung quanh.</P>
            <p>   Những ngành nghề có thể phù hợp với bạn là: Nhà hoạt động xã hội, Nhà tham vấn/tư vấn tâm lý, Nhà trị liệu tâm lý, Nhân viên công tác xã hội, Nhân viên chăm sóc khách hàng, Giáo viên, Giảng viên, Y tá, Điều dưỡng, Nhà ngoại giao,...
            </p>
        </div>
    </div>

    <!-- Modal G5 -->
    <div id="modalG5" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG5')">&times;</span>
            <h2>Nhóm người Thử thách</h2>
            <p>Những người thuộc nhóm Thử Thách thích làm việc với ý tưởng và con người. Họ thường được mô tả là dễ gần, năng động, lạc quan, quảng giao, liều lĩnh và tự tin. Họ có khả năng giao tiếp tốt và có thể sử dụng năng lực này để thuyết phục, thương lượng, tạo ảnh hưởng lên người khác, thuyết trình, lãnh đạo hay quản lý một đội nhóm vì một mục tiêu chung. Họ cũng coi trọng các giá trị như danh tiếng, quyền lực và địa vị xã hội.</p>
            <p>  Những ngành nghề có thể phù hợp với bạn là: Tiếp thị sản phẩm, tư vấn bất động sản, Luật sư, Chính trị gia, nhân viên tài chính ngân hàng,..
            </p>
        </div>
    </div>

    <!-- Modal G6 -->
    <div id="modalG6" class="modal">
        <div class="modal-content">
            <span class="close" onclick="closeModal('modalG6')">&times;</span>
            <h2>Nhóm người Tổ chức</h2>
            <p>Những người thuộc nhóm Tổ chức thích làm việc với dữ liệu, con số và văn bản, giấy tờ. Họ thường được mô tả là những người thực tế, cẩn thận, năng suất, tổ chức và kiên trì. Họ cảm thấy thoải mái với các luật lệ, quy định, và các hoạt động mang tính ổn định,  do vậy phù hợp làm việc trong các môi trường có tính cấu trúc cao và sự tổ chức chặt chẽ. Họ cũng coi trọng các giá trị như danh tiếng, quyền lực và địa vị xã hội.</p>
            <p>Những ngành nghề có thể phù hợp với bạn là: Kế toán viên, Kiểm toán viên, Thư ký, Nhân viên ngân hàng, Thủ thư, Nhân viên xử lý dữ liệu, Kỹ thuật viên, Nhân viên thống kê, Nhân viên văn thư, Các công việc hành chính - văn phòng...
            </p>
        </div>
    </div>
    <a href="/TuVanTuyenSinh/export" class="export-btn">Xuất file</a>

    <script>
        function showModal(modalId) {
            document.getElementById(modalId).style.display = "block";
        }

        function closeModal(modalId) {
            document.getElementById(modalId).style.display = "none";
        }

        window.onclick = function (event) {
            var modals = document.getElementsByClassName('modal');
            for (var i = 0; i < modals.length; i++) {
                var modal = modals[i];
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        }
    </script>
</body>
</html>

