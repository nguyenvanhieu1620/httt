<%-- 
    Document   : SignIn
    Created on : Nov 25, 2023, 10:42:45 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/SignIn.css">
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

        <div class="login-form">
            <div class="login-form__logo">
                <img src="Asset/image/fb_icon_325x325.png" alt="Facebook Logo" onclick="redirectToFacebook()">
                <img src="Asset/image/GG.png" alt="Google Logo" onclick="redirectToGoogle()">
            </div>

            <h2 class="login-form__title">Đăng nhập tài khoản</h2>

            <%-- Display error message if login failed --%>
            <% if (request.getAttribute("loginError") != null && (boolean) request.getAttribute("loginError")) { %>
            <div style="color: red; margin-bottom: 10px;">Vui lòng kiểm tra lại thông tin đăng nhập.</div>
            <% }%>

            <form action="login" method="post">
                <label for="username" class="login-form__label">Tài khoản:</label>
                <input type="text" id="username" name="username" class="login-form__input" required>

                <label for="password" class="login-form__label">Mật khẩu:</label>
                <input type="password" id="password" name="password" class="login-form__input" required>

                <div class="login-form__link">
                    <a href="#">Quên mật khẩu?</a>
                </div>

                <button type="submit" class="login-form__button">Đăng nhập</button>
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
