<%-- 
    Document   : SignUp
    Created on : Nov 26, 2023, 9:13:32 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/SignUp.css">
        <title>Career Orientation UTT</title>
    </head>
    <body>
        <header class="header">
            <div class="container">
                <h1 class="header__title">Career Orientation UTT</h1>
                <nav class="header__nav">
                    <ul class="header__nav__list">
                        <li class="header__nav__item"><a href="#" class="header__nav__link">Trang chủ</a></li>
                        <li class="header__nav__item"><a href="#" class="header__nav__link">Bài khảo sát</a></li>
                        <li class="header__nav__item"><a href="#" class="header__nav__link">Kết quả đã khảo sát</a></li>
                        <li class="header__nav__item"><a href="#" class="header__nav__link">Thống kê</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/login" class="header__nav__link">Đăng nhập</a></li>
                        <li class="header__nav__item"><a href="/TuVanTuyenSinh/signup" class="header__nav__link">Đăng ký</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <div class="register-form">
            <h2 class="register-form__title">Đăng ký tài khoản</h2>

            <%
                String ten_tai_khoan_err = "";
                if (request.getAttribute("error") != null) {
                    ten_tai_khoan_err = (String) request.getAttribute("error");
                }
            %>
            <p style="color:red"><%=ten_tai_khoan_err%></p>
            <form method="post" action="signup">
                <label for="fullname" class="register-form__label">Họ và tên:</label>
                <input type="text" id="fullname" name="fullname" class="register-form__input" required>

                <label for="email" class="register-form__label">Email:</label>
                <input type="email" id="email" name="email" class="register-form__input" required>

                <label for="username" class="register-form__label">Tên đăng nhập:</label>
                <input type="text" id="username" name="username" class="register-form__input" required>

                <label for="password" class="register-form__label">Mật khẩu:</label>
                <input type="password" id="password" name="password" class="register-form__input" pattern=".{8,}" oninvalid="this.setCustomValidity('Mật khẩu tối thiểu cần 8 ký tự')" oninput="this.setCustomValidity('')" required>

                <label for="confirm-password" class="register-form__label">Xác nhận mật khẩu:</label>
                <input type="password" id="confirm-password" name="confirm-password" class="register-form__input" pattern=".{8,}" oninvalid="this.setCustomValidity('Mật khẩu tối thiểu cần 8 ký tự')" oninput="this.setCustomValidity('')" required>

                <div class="register-form__checkbox">
                    <input type="checkbox" id="agree" name="agree" required>
                    <label for="agree">Tôi đồng ý với điều khoản</label>
                </div>

                <button type="submit" class="register-form__button">Đăng ký</button>
            </form>
        </div>

        <script>
            function redirectToFacebook() {
                // Add logic to redirect to Facebook login page
                alert("Redirecting to Facebook...");
            }

            function redirectToGoogle() {
                // Add logic to redirect to Google login page
                alert("Redirecting to Google...");
            }
        </script>
    </body>
</html>
