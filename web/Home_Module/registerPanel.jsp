<%-- 
    Document   : registerPanel
    Created on : Jan 2, 2022, 8:24:01 PM
    Author     : jatin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <title>Medilab Bootstrap Template - Index</title>
        <meta content="" name="description">
        <meta content="" name="keywords">
        <!-- Favicons -->
        <link href="BS5assets/img/favicon.png" rel="icon">
        <link href="BS5assets/img/apple-touch-icon.png" rel="apple-touch-icon">
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <!-- Vendor CSS Files -->
        <link href="BS5assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="BS5assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="BS5assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="BS5assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="BS5assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
        <link href="BS5assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="BS5assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="BS5assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="BS5assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: Medilab - v4.6.0
        * Template URL: https://bootstrapmade.com/medilab-free-medical-bootstrap-theme/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
        <style>
            .btnblues{
                background: #1977cc;
                border: 0;
                padding: 10px 35px;
                color: #fff;
                transition: 0.4s;
                border-radius: 50px;
            }
            .btnblues:hover {
                background: #1c84e3;
            }
        </style>
        <sj:head jqueryui="true" jquerytheme="cupertino"/>
    </head>

    <body>
        <!-- ======= Top Bar ======= -->
        <div id="topbar" class="d-flex align-items-center fixed-top">
            <div class="container d-flex justify-content-between">
                <div class="contact-info d-flex align-items-center">
                    <i class="bi bi-envelope"></i> <a href="mailto:contact@example.com">tpo@sbjit.edu.in</a>
                    <i class="bi bi-phone"></i> +1 5589 55488 55
                </div>
                <div class="d-none d-lg-flex social-links align-items-center">
                    <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
                    <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                    <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                    <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
                </div>
            </div>
        </div>


        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container d-flex align-items-center">

                <h1 class="logo me-auto"><a href="index.html">Placement Arena</a></h1>
                <!-- Uncomment below if you prefer to use an image logo -->
                <!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

                <nav id="navbar" class="navbar order-last order-lg-0">
                    <ul>
                        <li><a class="nav-link scrollto active" href="">Registration</a></li>

                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

                <a href="Placement-Arena" class="appointment-btn scrollto"><span class="d-none d-md-inline">Back to Home</span></a>

            </div>
        </header><!-- End Header -->
        <main id="main">
            <section id="appointment" class="appointment section-bg ">


                <div class="container section-bg">

                    <div style="background-color: " class="section-title mt-lg-5 py-5">
                        <h2>Register</h2>
                    </div>

                    <s:url var="remoteurl1" action="StudReg"/>
                    <s:url var="remoteurl2" action="DiplomaStudReg"/>


                    <sj:tabbedpanel
                        id="remotetabs">
                        <sj:tab id="tab1" href="%{remoteurl1}"  label="12th Students"/>
                        <sj:tab id="tab2" href="%{remoteurl2}" label="Diploma Students"/>

                    </sj:tabbedpanel>

                </div>
            </section>
        </main>
        <div id="preloader"></div>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="BS5assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="BS5assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="BS5assets/vendor/php-email-form/validate.js"></script>
        <script src="BS5assets/vendor/purecounter/purecounter.js"></script>
        <script src="BS5assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="/Placement_Arena/struts/bootstrap/js/validation.min.js?s2b=4.0.0"></script>
        <!-- Template Main JS File -->
        <script src="BS5assets/js/main.js"></script>

    </body>

</html>