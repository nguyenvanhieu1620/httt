<%-- 
    Document   : TinhCach6
    Created on : Nov 28, 2023, 4:00:14 PM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>KET QUA</title>
        <link rel="stylesheet" type="text/css" href="css/resetCss.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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


        <section class="intro">
            <div class="container">
                <div class="intro__content">
                    <img src="./Asset/image/ToChuc.jpg" alt="Large Image" class="intro__image">
                    <h3 class="intro__title">Bạn thuộc nhóm người tổ chức</h3>
                    <p class="intro__text">
                        Những người thuộc nhóm Tổ chức thích làm việc với dữ liệu, con số và văn bản, giấy tờ. Họ thường được mô tả là những người thực tế, cẩn thận, năng suất, tổ chức và kiên trì. Họ cảm thấy thoải mái với các luật lệ, quy định, và các hoạt động mang tính ổn định,  do vậy phù hợp làm việc trong các môi trường có tính cấu trúc cao và sự tổ chức chặt chẽ. Họ cũng coi trọng các giá trị như danh tiếng, quyền lực và địa vị xã hội.
                        Dưới đây là gợi ý các trường Cao đẳng và ngành học phù hợp với bạn:
                    </p>
                </div>
            </div>
        </section>

        <section class="featured-destinations">
            <div class="container">
                <h2 class="featured-destinations__title">CAO ĐẲNG KINH TẾ KĨ THUẬT CÔNG NGHIỆP</h2>
                <hr class="divider">
                <div class="row">
                    <div class="col-md-4">
                        <div class="destination">
                            <img src="./Asset/image/KeToan.png" alt="Destination 1" class="destination__image">
                            <h3 class="destination__title"><a href="#" style="color: black; text-decoration: none;">KẾ TOÁN</a></h3>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="destination">
                            <img src="./Asset/image/KiemToan.jpg" alt="Destination 2" class="destination__image">
                            <h3 class="destination__title"><a href="#" style="color: black; text-decoration: none;">KIỂM TOÁN</a></h3>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="destination">
                            <img src="./Asset/image/HanhChinh.jpg" alt="Destination 3" class="destination__image">
                            <h3 class="destination__title"><a href="#" style="color: black; text-decoration: none;">HÀNH CHÍNH </a></h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="more-blog-container">
                            <div class="more-blog-box">
                                <a href="/TuVanTuyenSinh/home" class="more-blog" style="color: black;">Quay lại</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>



<footer class="footer">
    <div class="container">
        <div class="footer__container">
            <p class="footer__text">&copy; Career orientation UTT | Powered by Pan</p>
            <div class="footer__social">
                <a href="#" class="footer__social-link">
                    <img src="./Asset/image/fb_icon_325x325.png" alt="Facebook" class="footer__social-icon">
                </a>
                <a href="#" class="footer__social-link">
                    <img src="./Asset/image/pngtree-twitter-social-media-round-icon-png-image_8704823.png" alt="Twitter" class="footer__social-icon">
                </a>
                <a href="#" class="footer__social-link">
                    <img src="./Asset/image/Pinterest .png" alt="Instagram" class="footer__social-icon">
                </a>
            </div>
        </div>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
