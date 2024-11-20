<%-- 
    Document   : ThongKe
    Created on : Jun 16, 2024, 5:33:11 PM
    Author     : THINKPAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Career orientation UTT</title>
        <link rel="stylesheet" href="css/Style2.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    </head>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <script src="js/chart.js"></script>
        <style>
            .chart-container {
                display: flex;
                justify-content: space-around;
                width: 100%;
                margin: auto;
            }

            canvas {
                width: 100%;
                height: 100%;
            }
        </style>
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
        <!--        <div>
                    <canvas id="trainingChart"></canvas>
                </div>-->
        <div class="chart-container">
            <div class="chart-container" style="position: relative; height:80vh; width:80vw">
                <canvas id="trainingChart"></canvas>
            </div>
            <div class="chart-container" style="position: relative; height:80vh; width:80vw">
                <canvas id="careerChart"></canvas>
            </div>
        </div>



        <script>
            async function fetchCareerData() {
                const response = await fetch('http://localhost:8080/TuVanTuyenSinh/static/career');
                const data = await response.json();
                return data.map(point => ({
                        displayName: point.displayName,
                        quantity: point.quantity
                    }));
            }

            async function renderCareerChart() {
                let dataPoints = await fetchCareerData();

                let labels = dataPoints.map(point => point.displayName);
                let values = dataPoints.map(point => point.quantity);
                const data = {
                    labels,
                    datasets: [{
                            label: 'Số lượt',
                            data: values,
                            backgroundColor: [
                                'rgba(255, 87, 34, 0.7)', // Deep Orange
                                'rgba(33, 150, 243, 0.7)', // Blue
                                'rgba(255, 235, 59, 0.7)', // Yellow
                                'rgba(0, 188, 212, 0.7)', // Cyan
                                'rgba(156, 39, 176, 0.7)', // Purple
                                'rgba(255, 193, 7, 0.7)'     // Amber
                            ],
                            borderColor: [
                                'rgba(255, 87, 34, 1)', // Deep Orange
                                'rgba(33, 150, 243, 1)', // Blue
                                'rgba(255, 235, 59, 1)', // Yellow
                                'rgba(0, 188, 212, 1)', // Cyan
                                'rgba(156, 39, 176, 1)', // Purple
                                'rgba(255, 193, 7, 1)'     // Amber
                            ],
                            borderWidth: 1
                        }]

                };

                const careerCtx = document.getElementById('careerChart').getContext('2d');
                new Chart(careerCtx, {
                    type: 'pie',
                    data,
                    options: {
                        responsive: true,
                        plugins: {
                            title: {
                                display: true,
                                text: 'Số lượt tham gia khảo sát chương trình đào tạo', // Add the title text here
                                font: {
                                    size: 20
                                },
                                padding: {
                                    top: 10,
                                    bottom: 30
                                }
                            },
                            legend: {
                                position: 'bottom'
                            },
                            tooltip: {
                                callbacks: {
                                    label: function (context) {
                                        let label = context.label || '';
                                        if (label) {
                                            label += ': ';
                                        }
                                        label += Math.round(context.raw * 100) / 100;
                                        return label;
                                    }
                                }
                            }
                        }
                    }
                });
            }

            async function fetchTrainingData() {
                let response = await fetch('http://localhost:8080/TuVanTuyenSinh/static/training');
                let data = await response.json();
                return data.map(point => ({
                        displayName: point.displayName,
                        quantity: point.quantity
                    }));
            }

            async function renderTrainingChart() {
                let dataPoints = await fetchTrainingData();

                let labels = dataPoints.map(point => point.displayName);
                let values = dataPoints.map(point => point.quantity);
                const data = {
                    labels,
                    datasets: [{
                            label: 'Số lượt',
                            data: values,
                            backgroundColor: [
                                'rgba(63, 81, 181, 0.7)', // Indigo
                                'rgba(233, 30, 99, 0.7)', // Pink
                                'rgba(139, 195, 74, 0.7)', // Light Green
                                'rgba(255, 152, 0, 0.7)', // Orange
                                'rgba(96, 125, 139, 0.7)'    // Blue Grey
                            ],
                            borderColor: [
                                'rgba(63, 81, 181, 1)', // Indigo
                                'rgba(233, 30, 99, 1)', // Pink
                                'rgba(139, 195, 74, 1)', // Light Green
                                'rgba(255, 152, 0, 1)', // Orange
                                'rgba(96, 125, 139, 1)'     // Blue Grey
                            ],
                            borderWidth: 1
                        }]
                };
                console.log(values)

                let trainingCtx = document.getElementById('trainingChart').getContext('2d');
                new Chart(trainingCtx, {
                    type: 'pie', // or 'line', 'pie', etc.
                    data,
                    options: {
                        responsive: true,
                        plugins: {
                            title: {
                                display: true,
                                text: 'Số lượt tham gia khảo sát ngành học', // Add the title text here
                                font: {
                                    size: 20
                                },
                                padding: {
                                    top: 10,
                                    bottom: 30
                                }
                            },
                            legend: {
                                position: 'bottom'
                            },
                            tooltip: {
                                callbacks: {
                                    label: function (context) {
                                        let label = context.label || '';
                                        if (label) {
                                            label += ': ';
                                        }
                                        label += Math.round(context.raw * 100) / 100;
                                        return label;
                                    }
                                }
                            }
                        }
                    }
                });
            }

            renderCareerChart();
            renderTrainingChart();
        </script>   

        <footer class="footer">
            <div class="container">
                <div class="footer__container">
                    <p class="footer__text">&copy; 2023 Career orientation UTT | Powered by Pan</p>
                    <div class="footer__social">
                        <a href="#" class="footer__social-link">
                            <img src="Asset/image/fb_icon_325x325.png" alt="Facebook" class="footer__social-icon">
                        </a>
                        <a href="#" class="footer__social-link">
                            <img src="Asset/image/pngtree-twitter-social-media-round-icon-png-image_8704823.png" alt="Twitter" class="footer__social-icon">
                        </a>
                        <a href="#" class="footer__social-link">
                            <img src="Asset/image/Pinterest .png" alt="Instagram" class="footer__social-icon">
                        </a>
                    </div>
                </div>
            </div>
        </footer>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
