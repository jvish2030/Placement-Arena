<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Placement arena</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="BS5assets/img/favicon.png" rel="icon">
        <link href="BS5assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@300&display=swap" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@300&family=M+PLUS+1+Code&display=swap" rel="stylesheet">        <!-- Vendor CSS Files -->
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


        <style>


            .progress .progress-bar {
                height: 100% !important;
            }
            .proj-progress-card .progress {
                height: 6px;
                overflow: visible;
                margin-bottom: 0px;
            }

            .proj-progress-card .progress .progress-bar {
                position: relative;
            }

            .proj-progress-card .progress .progress-bar:after {
                content: "";
                background: #fff;
                position: absolute;
                right: -6px;
                top: -4px;
                border-radius: 50%;
                width: 15px;
                height: 15px;
            }

            .proj-progress-card .progress .progress-bar.bg-primary {
                border:  1px solid #448aff;
                -webkit-box-shadow: 0 0 0 1px rgba(68, 138, 255, 0.5), 0 5px 7px 0 rgba(62, 57, 107, 0.18);
                box-shadow: 0 0 0 1px rgba(68, 138, 255, 0.5), 0 5px 7px 0 rgba(62, 57, 107, 0.18);
            }

            @media only screen and (max-width: 992px) {
                .proj-progress-card h6 {
                    margin-top: 15px;
                }
                .proj-progress-card .progress {
                    margin-bottom: 30px;
                }
            }
            .appointment{
                background: url(photos/home.jpg) no-repeat center;
                background-attachment: fixed;
            }

            .counts{
                background: url(photos/home.jpg) no-repeat center;
                background-attachment: fixed;
            }

            .image-layer {
                background-color: rgb(241,247,253,0.5);
            }
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
            .sent-message {
                color: #fff;
                background: #18d26e;
                text-align: center;
                padding: 15px;
                font-weight: 600;
            }
        </style>
        <sj:head loadAtOnce="true"/>
    </head>

    <body>

        <!-- ======= Top Bar ======= -->
        <div id="topbar" class="d-flex align-items-center fixed-top">
            <div class="container d-flex justify-content-between">
                <div class="contact-info d-flex align-items-center">
                    <i class="bi bi-envelope"></i> <a href="mailto:contact@example.com">tpo@sbjit.edu.in</a>
                    <i class="bi bi-phone"></i> 9860078055
                </div>
                <div class="d-none d-lg-flex social-links align-items-center">
                    <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
                    <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                    <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                    <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
                </div>
            </div>
        </div>

        <!-- ======= Top Bar ======= -->
        <div id="topbar" class="d-flex align-items-center fixed-top">
            <div class="container d-flex justify-content-between">
                <div class="contact-info d-flex align-items-center">
                    <i class="bi bi-envelope"></i> <a href="mailto:contact@example.com">tpo@sbjit.edu.in</a>
                    <i class="bi bi-phone"></i> 9860078055
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
        <header id="header" class="fixed-top" >
            <div class="container d-flex align-items-center " >

                <h1 class="logo me-auto "><a href="index.html">Placement Arena</a></h1>
                <!-- Uncomment below if you prefer to use an image logo -->
                <!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

                <nav id="navbar"  class="navbar order-last order-lg-0">
                    <ul>
                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About</a></li>
                        <li><a class="nav-link scrollto" href="#placement_Ratio">Placement Ratio</a></li>
                        <li><a class="nav-link scrollto" href="#companies">Companies</a></li>
                        <li><a class="nav-link scrollto" href="#appointment">Appointment</a></li>
                        <li class="dropdown"><a href="#"><span>More</span> <i class="bi bi-chevron-down"></i></a>
                            <ul>
                                <li><a href="#process">Placement Process</a></li>
                                <li><a href="#faq">F.A.Q</a></li>
                                <li><a href="#reviews">Reviews</a></li>
                                <li><a href="#gallery">Gallery</a></li>
                                <li class="dropdown"><a ><span>more</span> <i class="bi bi-chevron-right"></i></a>
                                    <ul>
                                        <li><a href="placedStudent">All Placements</a></li>
                                        <li><a href="recuriters">Our Recuriters</a></li>
                                        <li><a href="#">...</a></li>

                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->
                <a href="register" class="appointment-btn scrollto">6<sup>th</sup>-SEM <span class="d-none d-md-inline"></span></a>
            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex align-items-center" style="background-image: url(photos/home.jpg)" >
            <div class="container"  back>
                <h1 class="text-white " class="pb-6" >Welcome to Placement Arena</h1>
                <a href="#about" class="btn-get-started scrollto">Get Started</a>
            </div>
        </section><!-- End Hero -->

        <main id="main">

            <!-- ======= Why Us Section ======= -->
            <section id="why-us" class="why-us">
                <div class="container">

                    <div class="row">
                        <div class="col-lg-4 d-flex align-items-stretch">
                            <div class="content">
                                <h3>Top Companies</h3>
                                <p>
                                    Top CTC Offer to our Students by various top Multinational companay. SB JAIN has a dynamic, enthusiastic Placement Department working for the benefit of the students in this direction.
                                </p>
                                <div class="text-center">
                                    <a href="#" class="more-btn">Learn More <i class="bx bx-chevron-right"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-8 d-flex align-items-stretch">
                            <div class="icon-boxes d-flex flex-column justify-content-center">
                                <div class="row">
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="fas fa-hand-holding-usd"></i>
                                            <h4>Placement Packages</h4>
                                            <p class="mb-0">Packages Upto 5 Lacs</p>
                                            <p class="mb-0">Packages from 5 - 8 Lacs</p>
                                            <p class="mb-0">Packages from 8 - 10 Lacs</p>
                                            <p class="mb-0">Packages from 10 - 12 Lacs</p>                                            
                                        </div>
                                    </div>
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="fas fa-chart-line"></i>
                                            <h4>Campus Placement Tracker</h4>
                                            <p class="mb-0">3,500+ Placements In 600+ Companies</p>
                                            <p class="mb-0">12+ LPA Milestone Packages</p>
                                            <p class="mb-0">450+ Students Acquire Internship Every Year</p>
                                        </div>
                                    </div>
                                    <div class="col-xl-4 d-flex align-items-stretch">
                                        <div class="icon-box mt-4 mt-xl-0">
                                            <i class="fas fa-street-view"></i>
                                            <h4>Placements Training</h4>
                                            <p class="mb-0">Aptitude Training</p>
                                            <p class="mb-0">Technical Training</p>
                                            <p class="mb-0">Soft Skill Training</p>
                                            <p class="mb-0">Manthan (Pre- Placement Training)</p>
                                        </div>
                                    </div>
                                </div>
                            </div><!-- End .content-->
                        </div>

                    </div>
            </section><!-- End Why Us Section -->


            <!-- =======About us Section ======= -->
            <section id="about" class="doctors pt-1">
                <div class="container">
                    <div class="section-title mt-0">
                        <h2>Training and Placement officers</h2>
                        <p >Training & Placement Team lend support and advice to students in order to help them secure excellent placement. The Institute promises to offer to its student every facility and service required to help them to successfully establish themselves in their future professional career. SB JAIN has a dynamic, enthusiastic Placement Department working for the benefit of the students in this direction.</p>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="member d-flex align-items-start">
                                <div class="pic"><img src="photos/about.png" class="img-fluid" alt=""></div>
                                <div class="member-info">
                                    <h4>Madhav Deshpande</h4>
                                    <span>Training and Placement Officer</span>
                                    <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
                                    <div class="social">
                                        <a href=""><i class="ri-twitter-fill"></i></a>
                                        <a href=""><i class="ri-facebook-fill"></i></a>
                                        <a href=""><i class="ri-instagram-fill"></i></a>
                                        <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 mt-4 mt-lg-0">
                            <div class="member d-flex align-items-start">
                                <div class="pic"><img src="photos/about.png" class="img-fluid" alt=""></div>
                                <div class="member-info">
                                    <h4>Animesh Tayal</h4>
                                    <span>Head of the Department(CSE)</span>
                                    <p>Aut maiores voluptates amet et quis praesentium qui senda para</p>
                                    <div class="social">
                                        <a href=""><i class="ri-twitter-fill"></i></a>
                                        <a href=""><i class="ri-facebook-fill"></i></a>
                                        <a href=""><i class="ri-instagram-fill"></i></a>
                                        <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 mt-4">
                            <div class="member d-flex align-items-start">
                                <div class="pic"><img src="photos/about.png" class="img-fluid" alt=""></div>
                                <div class="member-info">
                                    <h4>Ram Samdekar</h4>
                                    <span>Training and placement officer</span>
                                    <p>Quisquam facilis cum velit laborum corrupti fuga rerum quia</p>
                                    <div class="social">
                                        <a href=""><i class="ri-twitter-fill"></i></a>
                                        <a href=""><i class="ri-facebook-fill"></i></a>
                                        <a href=""><i class="ri-instagram-fill"></i></a>
                                        <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 mt-4">
                            <div class="member d-flex align-items-start">
                                <div class="pic"><img src="photos/about.png" class="img-fluid" alt=""></div>
                                <div class="member-info">
                                    <h4>_____</h4>
                                    <span>Training and placement Officer</span>
                                    <p>Dolorum tempora officiis odit laborum officiis et et accusamus</p>
                                    <div class="social">
                                        <a href=""><i class="ri-twitter-fill"></i></a>
                                        <a href=""><i class="ri-facebook-fill"></i></a>
                                        <a href=""><i class="ri-instagram-fill"></i></a>
                                        <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section><!-- End About us Section -->


            <!-- ======= Counts Section ======= -->

            <section id="placement_Ratio" class="counts py-5 px-5" >
                <div class="image-layer mx-0 py-3">
                    <div class="container" data-aos="fade-up">
                        <div class="section-title mt-4">
                            <h2>Placement Ratio</h2>
                        </div>
                        <div class="row no-gutters">

                            <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch">
                                <div class="count-box">
                                    <i class="fas fa-laptop"></i>
                                    <span data-purecounter-start="0" data-purecounter-end="${cseValue}" data-purecounter-duration="1" class="purecounter"></span>
                                    <p><strong>Computer Science and Engineering </strong></p>

                                </div>
                            </div>


                            <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch">
                                <div class="count-box">
                                    <i class="fas fa-robot"></i>
                                    <span data-purecounter-start="0" data-purecounter-end="${etcValue}" data-purecounter-duration="1" class="purecounter"></span>
                                    <p><strong>Electronics and Telecommunication Engineering</strong> </p>
                                </div>
                            </div>

                            <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch">
                                <div class="count-box">
                                    <i class="fas fa-bolt"></i>
                                    <span data-purecounter-start="0" data-purecounter-end="${eeValue}" data-purecounter-duration="1" class="purecounter"></span>
                                    <p><strong>Electrical Engineering</strong> </p>
                                </div>
                            </div>


                            <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch">
                                <div class="count-box">
                                    <i class="fas fa-cogs"></i>
                                    <span data-purecounter-start="0" data-purecounter-end="${mechValue}" data-purecounter-duration="1" class="purecounter"></span>
                                    <p><strong>Mechanical Engineering</strong></p>
                                </div>
                            </div>
                        </div>

                        <div class="container mt-3">
                            <div class="row">
                                <div class="col px-0">

                                    <div class="card proj-progress-card">
                                        <div class="card-body">
                                            <div class="row">
                                                <div class="col">
                                                    <h6>Computer Science <span class="text-muted mx-2 float-end"> ${cseValue}%</span></h6>
                                                    <div class="progress">
                                                        <div class="progress-bar bg-primary" style="width:${cseValue}%"></div>
                                                    </div><br>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col">
                                                    <h6>Electronics and Tel. <span class="text-muted mx-2 float-end">${etcValue}%</span></h6>
                                                    <div class="progress">
                                                        <div class="progress-bar bg-primary" style="width:${etcValue}%"></div>
                                                    </div><br>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col">
                                                    <h6>Electrical <span class="text-muted mx-2 float-end">${eeValue}%</span></h6>
                                                    <div class="progress">
                                                        <div class="progress-bar bg-primary" style="width:${eeValue}%"></div>
                                                    </div><br>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col">
                                                    <h6>Mechanical <span class="text-muted mx-2 float-end">${mechValue}%</span></h6>
                                                    <div class="progress">
                                                        <div class="progress-bar bg-primary" style="width:${mechValue}%"></div>
                                                    </div><br>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </section><!-- End Counts Section -->





            <!-- ======= companies ======= -->
            <section id="companies" class="testimonials">
                <div class="container">
                    <div class="section-title">
                        <h2>Companies Arrived</h2>
                        <p>Top Upcoming companies Accenture,Cognizant,Byjus,Amazon,Infosys & Many More...</p>
                    </div>
                    <div class="testimonials-slider swiper" data-aos="fade-up" data-aos-delay="100">

                        <div class="swiper-wrapper">



                            <div class="swiper-slide">
                                <section  class="doctors">
                                    <div class="card member d-flex" style="max-width: 540px;">
                                        <div class="row g-0">
                                            <div class="col-md-4">
                                                <img src="companies/Persistent.png" class="img-fluid rounded-start" alt="...">
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body pt-1 mb-0 pb-0">
                                                    <h5 class="card-title mx-2 mb-0">PERSISTENT</h5>
                                                    <p class="card-text mt-0 mb-2 mx-2"><small class="text-muted">Pune/Goa/Hyderabad</small></p>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Package</div>
                                                        <div class="col text-md-start text-opacity-75">9 LPA</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Batch</div>
                                                        <div class="col text-md-start">2022</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Branch</div>
                                                        <div class="col text-start ">CSE/ETC/ELE</div>
                                                    </div>
                                                    <div class="row mx-2 mb-0">
                                                        <div class="col text-start mt-3">
                                                            <a href="persistent" class="more-btn ">visit <i class="bx bx-chevron-right"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <section class="doctors">
                                    <div class="card member d-flex" style="max-width: 540px;">
                                        <div class="row g-0">
                                            <div class="col-md-4">
                                                <img src="companies/infy.jpg" class="img-fluid rounded-start" alt="...">
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body pt-1 mb-0 pb-0">
                                                    <h5 class="card-title mx-2 mb-0">INFOSYS</h5>
                                                    <p class="card-text mt-0 mb-2 mx-2"><small class="text-muted">Pune/Goa/Hyderabad</small></p>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Package</div>
                                                        <div class="col text-md-start text-opacity-75">6 LPA</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Batch</div>
                                                        <div class="col text-md-start">2022</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Branch</div>
                                                        <div class="col text-start ">CSE/ETC</div>
                                                    </div>
                                                    <div class="row mx-2 mb-0">
                                                        <div class="col text-start mt-3">
                                                            <a href="#" class="more-btn ">visit <i class="bx bx-chevron-right"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <section  class="doctors">
                                    <div class="card member d-flex" style="max-width: 540px;">
                                        <div class="row g-0">
                                            <div class="col-md-4">
                                                <img src="companies/tcs.jpg" class="img-fluid rounded-start" alt="...">
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body pt-1 mb-0 pb-0">
                                                    <h5 class="card-title mx-2 mb-0">TCS</h5>
                                                    <p class="card-text mt-0 mb-2 mx-2"><small class="text-muted">Pune/Goa/Hyderabad</small></p>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Package</div>
                                                        <div class="col text-md-start text-opacity-75">4.5 LPA</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Batch</div>
                                                        <div class="col text-md-start">2022</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Branch</div>
                                                        <div class="col text-start ">CSE/ETC/MECH/ELE</div>
                                                    </div>
                                                    <div class="row mx-2 mb-0">
                                                        <div class="col text-start mt-3">
                                                            <a href="#" class="more-btn ">visit <i class="bx bx-chevron-right"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </div><!-- End testimonial item -->


                            <div class="swiper-slide">
                                <section  class="doctors">
                                    <div class="card member d-flex" style="max-width: 540px;">
                                        <div class="row g-0">
                                            <div class="col-md-4">
                                                <img src="companies/capg.jpg" class="img-fluid rounded-start" alt="...">
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body pt-1 mb-0 pb-0">
                                                    <h5 class="card-title mx-2 mb-0">CAPGEMINI</h5>
                                                    <p class="card-text mt-0 mb-2 mx-2"><small class="text-muted">Pune/Goa/Hyderabad</small></p>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Package</div>
                                                        <div class="col text-md-start text-opacity-75">4.5 LPA</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Batch</div>
                                                        <div class="col text-md-start">2022</div>
                                                    </div>
                                                    <div class="row mx-2">
                                                        <div class="col text-start text-black">Branch</div>
                                                        <div class="col text-start ">CSE/ETC/MECH/ELE</div>
                                                    </div>
                                                    <div class="row mx-2 mb-0">
                                                        <div class="col text-start mt-3">
                                                            <a href="#" class="more-btn ">visit <i class="bx bx-chevron-right"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </div><!-- End testimonial item -->


                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>

            </section>
            <!-- End Upcoming Opportunites  -->




            <!-- ======= Appointment Section ======= -->

            <section id="appointment" class="appointment  py-5 px-5">

                <div id="layer" class="image-layer mx-0 py-2 ">
                    <div class="container py-sm-3">


                        <div class="section-title">
                            <h2>Make an Appointment</h2>
                        </div>
                        <s:form id="testValidationForm" action="appointment"  method="post" theme="bootstrap" >
                            <div class="row">
                                <div class="col-md-4 form-group">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" name="name" id="floatingname" placeholder="john doe">
                                        <label for="floatingname">Full Name</label>
                                    </div>  
                                </div>
                                <div class="col-md-4 form-group mt-3 mt-md-0">
                                    <div class="form-floating ">
                                        <input type="email" name="email" class="form-control" id="floatingemail" placeholder="name@example.com">
                                        <label for="floatingemail">Email address</label>
                                    </div>
                                </div>
                                <div class="col-md-4 form-group mt-3 mt-md-0">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" name="phone" id="floatingphone" placeholder="9865422265">
                                        <label for="floatingphone">Your Phone</label>
                                    </div>  
                                </div>
                            </div>
                            <s:hidden name="pagename" value="appointment"/>
                            <div class="row">
                                <div class="col-md-4 form-group mt-3 ">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" name="subject" id="floatingsubject" placeholder="appointment">
                                        <label for="floatingsubject">Subject</label>
                                    </div>  
                                </div>
                                <div class="col-md-4 form-group mt-3">
                                    <div class="form-floating">
                                        <select class="form-select" name = "department" id="floatingSelect" aria-label="Select your Department">
                                            <option selected disabled value="">Open this select menu</option>
                                            <option value="CSE">Computer Science</option>
                                            <option value="ETC">Electronic & Tel.</option>
                                            <option value="EE">Electrical</option>
                                            <option value="MECH">Mechanical</option>

                                        </select>
                                        <label for="floatingSelect">Select your Department</label>
                                    </div>

                                </div>
                                <div class="col-md-4 form-group mt-3">

                                </div>
                            </div>
                            <div class="form-group mt-3 mb-0">
                                <div class="form-floating btn-">
                                    <textarea class="form-control" name="message" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 150px"></textarea>
                                    <label for="floatingTextarea2">message</label>
                                </div>

                            </div>
                            <div id="AppformResult">
                            </div>
                            <div class="form-group">
                                <div class="text-center">
                                    <!--                                <button type="submit">Make an Appointment</button>                     -->
                                    <sj:submit
                                        cssClass="btnblues mt-2"
                                        formIds="testValidationForm"
                                        validate="true"
                                        resetForm="true"
                                        clearForm="true"
                                        validateFunction="bootstrapValidation"
                                        value="Submit"
                                        targets="AppformResult" 
                                        onSuccessTopics="complete"
                                        />
                                </div>
                            </div>

                        </s:form>

                    </div>

                </div>

            </section>

            <!-- End Appointment Section -->


            <!-- ======= Placed Student Reviews Section ======= -->
            <section id="reviews" class="testimonials section-bg">
                <div class="container">
                    <div class="section-title mt-5">
                        <h2>Top Reviews</h2>
                    </div>

                    <div class="testimonials-slider swiper" data-aos="fade-up" data-aos-delay="100">
                        <div class="swiper-wrapper">

                            <div class="swiper-slide">
                                <div class="testimonial-wrap">
                                    <div class="testimonial-item">
                                        <img src="BS5assets/img/testimonials/testimonials-1.jpg" class="testimonial-img" alt="">
                                        <h3>Jatin Vishwakarma</h3>
                                        <h4>Ceo &amp; Founder</h4>
                                        <p>
                                            <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                            I'm ecstatic to announce that I've received a full-time offer from JPMorgan Chase & Co. for the post of Software Engineer.
                                            <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <div class="testimonial-wrap">
                                    <div class="testimonial-item">
                                        <img src="BS5assets/img/testimonials/testimonials-2.jpg" class="testimonial-img" alt="">
                                        <h3>Vijay Ghidoday</h3>
                                        <h4>Designer</h4>
                                        <p>
                                            <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                            Hi All,
                                            I am extremely happy and grateful to announce that I have started my position at Infosys as Software Developer.
                                            Also thank you so much Infosys for the thoughtful Welcome Kit and making us feel valuable.
                                            <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <div class="testimonial-wrap">
                                    <div class="testimonial-item">
                                        <img src="BS5assets/img/testimonials/testimonials-3.jpg" class="testimonial-img" alt="">
                                        <h3>Aman Gupta</h3>
                                        <h4>DBA</h4>
                                        <p>
                                            <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                            I'm ecstatic to announce that I've received a full-time offer from JPMorgan Chase & Co. for the post of Software Engineer.
                                            <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <div class="testimonial-wrap">
                                    <div class="testimonial-item">
                                        <img src="BS5assets/img/testimonials/testimonials-4.jpg" class="testimonial-img" alt="">
                                        <h3>Shivam Grover</h3>
                                        <h4>Freelancer</h4>
                                        <p>
                                            <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                            Hi All,
                                            I am extremely happy and grateful to announce that I have started my position at Infosys as Software Developer.
                                            Also thank you so much Infosys for the thoughtful Welcome Kit and making us feel valuable.
                                            <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->

                            <div class="swiper-slide">
                                <div class="testimonial-wrap">
                                    <div class="testimonial-item">
                                        <img src="BS5assets/img/testimonials/testimonials-4.jpg" class="testimonial-img" alt="">
                                        <h3>Liladhar Bodhke</h3>
                                        <h4>Freelancer</h4>
                                        <p>
                                            <i class="bx bxs-quote-alt-left quote-icon-left"></i>
                                            I would like to thank everyone who was involved in my hiring and onboarding proces Rahul T Mathew & Anusha. Special call out to Madhusudhan S & Supreeth Samuk for being so supportive and believing in me, I am glad to have mentors like you.
                                            <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                        </p>
                                    </div>
                                </div>
                            </div><!-- End testimonial item -->
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>
            </section><!-- End reviews Section -->


            <!-- ======= Placement Prepration ======= -->
            <section id="process" class="departments  py-5 px-5" s>
                <div class="container">
                    <div class="section-title mt-5 p-3">
                        <h2>Placement Process</h2>
                        <p>Steps To Appear for Placement Drive</p>
                    </div>
                    <div class="row">
                        <div class="col-lg-3">
                            <ul class="nav nav-tabs flex-column">
                                <li class="nav-item">
                                    <a class="nav-link active show" data-bs-toggle="tab" href="#tab-1">Application Form</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#tab-2">Apptitude Test</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#tab-3">Technical Interview-1</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#tab-4">Technical Interview-2</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" data-bs-toggle="tab" href="#tab-5">HR Round</a>
                                </li>
                            </ul>
                        </div>
                        <div class="col-lg-9 mt-4 mt-lg-0">
                            <div class="tab-content">
                                <div class="tab-pane active show" id="tab-1">
                                    <div class="row">
                                        <div class="col-lg-8 details order-2 order-lg-1">
                                            <h3>Application Process</h3>
                                            <p class="fst-italic"> Application process refers to the process of finding, selecting and hiring new employees to a company.</p>
                                            <p>Student has to register through their Valid Email ID and providing the valid details of communication to apply for the campus drive.</p>
                                        </div>
                                        <div class="col-lg-4 text-center order-1 order-lg-2">
                                            <img src="process/int.png" alt="" class="img-fluid">
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="tab-2">
                                    <div class="row">
                                        <div class="col-lg-8 details order-2 order-lg-1">
                                            <h3>Aptitude Test</h3>
                                            <p class="fst-italic">Applicant have to under go with the second phase that is apptitude test.</p>
                                            <p>An aptitude test is a way for employers to assess a candidate's abilities through a variety of different testing formats. Aptitude tests will test your ability to perform tasks and react to situations at work. This includes problem-solving, prioritisation and numerical skills, amongst other things.</p>
                                        </div>
                                        <div class="col-lg-4 text-center order-1 order-lg-2">
                                            <img src="process/apti.png" alt="" class="img-fluid">
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="tab-3">
                                    <div class="row">
                                        <div class="col-lg-8 details order-2 order-lg-1">
                                            <h3>Technical Interview-1</h3>
                                            <p class="fst-italic">In this round the applicant has to give Introduction,about project,which language he is comfortable with.</p>
                                            <p> Technical interviews allow interviewers to assess candidates' technical skills, problem-solving skills and critical thinking skills.</p>
                                        </div>
                                        <div class="col-lg-4 text-center order-1 order-lg-2">
                                            <img src="process/tech.jfif" alt="" class="img-fluid">
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="tab-4">
                                    <div class="row">
                                        <div class="col-lg-8 details order-2 order-lg-1">
                                            <h3>Technical Interview-2</h3>
                                            <p class="fst-italic">This phase is basically for cheking Analytical Skill,Communication skills,Reasoning Skill sometimes Group discussion will be conducted</p>
                                            <p>The second interview means that the employer believes you meet the core job requirements and seem interested in the opportunity. The next round ? or rounds ? of interviews will be spent determining whether you are the best fit for the team.</p>
                                        </div>
                                        <div class="col-lg-4 text-center order-1 order-lg-2">
                                            <img src="process/tech.jfif" alt="" class="img-fluid">
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="tab-5">
                                    <div class="row">
                                        <div class="col-lg-8 details order-2 order-lg-1">
                                            <h3>HR-Round</h3>
                                            <p class="fst-italic">Final Phase of Interview.</p>
                                            <p>HR interviews are done to gauge the personality- strengths and weaknesses of a candidate to handle the role and then understand whether the candidate is suitable to do the job. Sometimes, the interviews are conducted to decide how well the candidate can fit into the company's work culture.</p>
                                        </div>
                                        <div class="col-lg-4 text-center order-1 order-lg-2">
                                            <img src="process/hr.jfif" alt="" class="img-fluid">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section><!-- Placement Prepration-->


            <!-- ======= F.A.Q Section ======= -->
            <section id="faq" class="faq section-bg">
                <div class="container">

                    <div class="section-title mt-5 ">
                        <h2 data-aos="fade-up">F.A.Q</h2>
                    </div>

                    <div class="faq-list">
                        <ul>
                            <li data-aos="fade-up"  data-aos-delay="100">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-1" class="collapse">What time of the year is your placement program?  <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-1" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        The graduate placement program typically runs from the starting session of 7th semester till the end session of 8th sem. And also you will get furthermore
                                        assistance from the college after graduation.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="100">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-2" class="collapsed">Where can I get a placement guide?  <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-2" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        There is section named Resource section in the website where you can get all the placement materials as well as the guidance to crack the interview process.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="200">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-3" class="collapsed">What information is essential that is being provided in a PPT/Corporate Presentation/Brochure by the company for the students?<i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-3" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        The information that students typically look for in corporate presentations is: Profile of the company,

                                        Profile of the career role and responsibilities,

                                        Locations where the student is likely to be posted,

                                        Compensation / Stipend.

                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="300">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-4" class="collapsed">How a student can contact direcctly to TPO(Training and Placement Officer's)? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-4" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        There is a icon on the bottom right corner in the website.It's a live chat option by which you can directly chat with the TPO Officer
                                        and ask all the queries related to placement.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="400">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-5" class="collapsed">How can a student make an appointment directly with the TPO?<i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-5" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        On the top right corner in the website there is option of <strong>Make an Appointment</strong> , there you will have to fill the form and submit it.
                                        Then the TPO officer will get the appointment request,he will assign you with the date and the time for appointment
                                        and you can directly go to college on the specified date and can have an appointment.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="400">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-6" class="collapsed">What are the various ways of recruiting students?<i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-6" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Students can be recruited for:Entry-level full-time roles.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="400">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-7" class="collapsed">What are the typical steps in the placement process?<i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-7" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        The typical steps in the placement process would be:
                                        Opportunities posted by TPO,
                                        Apply for the drive,
                                        Upload CV's and form filling,
                                        Shortlisting of the students,
                                        Attend Corporate Presentation(Pre-Placement Talk),
                                        Pre-interview process(Technical test,group discussion),
                                        Interviews of the shortlisted students after test,
                                        Final placed students list.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="500">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-8" class="collapsed">What amenities/infrastructure are available for a presentation/placement process on campus? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-8" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        The campus is equipped with state-of-the-art physical, communication and computing infrastructure to facilitate a smooth placement process.
                                        Computing facilities, projection facilities for multimedia presentations; telecommunication facilities for teleconferencing and video-conferencing;
                                        seminar rooms and presentation halls for presentations.
                                    </p>
                                </div>
                            </li>
                            <li data-aos="fade-up" data-aos-delay="500">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-9" class="collapsed">How can I post jobs for students? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-9" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Please email placement officer and the placement officer will circulate the information amongst the students.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="600">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-10" class="collapsed">Is there a fee for placement? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-10" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        There is no fee for recruiting students for graduate placements.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="600">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-11" class="collapsed">How can I contact previos year placed students? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-11" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        There are various students placed in the different types of companies. Their names,salary with their linkedIn and GitHub profiles have been mentioned
                                        in the websites at various places like in the Home page and also under the Opportunities section as well (with the list of students placed in the
                                        particular company).You can contact seniors, super seniors by going into their LinkedIn profiles and can have your queries cleared.
                                    </p>
                                </div>
                            </li>

                        </ul>
                    </div>

                </div>
            </section><!-- End F.A.Q Section -->






            <!-- ======= Gallery Section ======= -->
            <section id="gallery" class="gallery">
                <div class="container">

                    <div class="section-title mt-4">
                        <h2>Gallery</h2>
                        <p>Our Placement Gallery.</p>
                    </div>
                </div>

                <div class="container-fluid">
                    <div class="row no-gutters">

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/2.jepg" class="galelry-lightbox">
                                    <img src="pla/2.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/3.jepg" class="galelry-lightbox">
                                    <img src="pla/3.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/4.jepg" class="galelry-lightbox">
                                    <img src="pla/4.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/5.jepg" class="galelry-lightbox">
                                    <img src="pla/5.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/6.jepg" class="galelry-lightbox">
                                    <img src="pla/6.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/4.jepg" class="galelry-lightbox">
                                    <img src="pla/7.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/8.jepg" class="galelry-lightbox">
                                    <img src="pla/8.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-4">
                            <div class="gallery-item">
                                <a href="pla/9.jepg" class="galelry-lightbox">
                                    <img src="pla/9.jpeg" alt="" class="img-fluid" height ="200">
                                </a>
                            </div>
                        </div>
                    </div>

                </div>
            </section><!-- End Gallery Section -->




            <!-- ======= Contact Section ======= -->
            <section id="contact" class="contact">
                <div class="container">

                    <div class="section-title">
                        <h2>Contact</h2>
                        <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
                    </div>
                </div>

                <div>
                    <iframe style="border:0; width: 100%; height: 350px;" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameborder="0" allowfullscreen></iframe>
                </div>

                <div class="container">
                    <div class="row mt-5">

                        <div class="col-lg-4">
                            <div class="info">
                                <div class="address">
                                    <i class="bi bi-geo-alt"></i>
                                    <h4>Location:</h4>
                                    <p>A108 Adam Street, New York, NY 535022</p>
                                </div>

                                <div class="email">
                                    <i class="bi bi-envelope"></i>
                                    <h4>Email:</h4>
                                    <p>info@example.com</p>
                                </div>

                                <div class="phone">
                                    <i class="bi bi-phone"></i>
                                    <h4>Call:</h4>
                                    <p>+1 5589 55488 55s</p>
                                </div>

                            </div>

                        </div>

                        <div class="col-lg-8 mt-5 mt-lg-0">

                            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                                <div class="row">
                                    <div class="col-md-6 form-group">
                                        <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required>
                                    </div>
                                    <div class="col-md-6 form-group mt-3 mt-md-0">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
                                    </div>
                                </div>
                                <div class="form-group mt-3">
                                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" required>
                                </div>
                                <div class="form-group mt-3">
                                    <textarea class="form-control" name="message" rows="5" placeholder="Message" required></textarea>
                                </div>
                                <div class="my-3">
                                    <div class="loading">Loading</div>
                                    <div class="error-message"></div>
                                    <div class="sent-message">Your message has been sent. Thank you!</div>
                                </div>
                                <div class="text-center"><button type="submit">Send Message</button></div>
                            </form>

                        </div>

                    </div>

                </div>
            </section><!-- End Contact Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">



            <div class="container d-md-flex py-4">

                <div class="me-md-auto text-center text-md-start">
                    <div class="copyright">
                        &copy; Copyright <strong><span>Placement arena</span></strong>. All Rights Reserved
                    </div>
                    <div class="credits">
                        <!-- All the links in the footer should remain intact. -->
                        <!-- You can delete the links only if you purchased the pro version. -->
                        <!-- Licensing information: https://bootstrapmade.com/license/ -->
                        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/medilab-free-medical-bootstrap-theme/ -->
                        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                    </div>
                </div>
                <div class="social-links text-center text-md-right pt-3 pt-md-0">
                    <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                    <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                    <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                    <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                    <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                </div>
            </div>
        </footer><!-- End Footer -->

        <div id="preloader"></div>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="BS5assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="BS5assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="BS5assets/vendor/purecounter/purecounter.js"></script>
        <script src="BS5assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="/Placement_Arena/struts/bootstrap/js/validation.min.js?s2b=4.0.0"></script>
        <!-- Template Main JS File -->
        <script src="BS5assets/js/main.js"></script>
        <script
            language="JavaScript"
            src="${pageContext.request.contextPath}/struts/utils.js"
            type="text/javascript">
        </script>
        <script
            language="JavaScript"
            src="${pageContext.request.contextPath}/struts/xhtml/validation.js"
            type="text/javascript">
        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                $.subscribe('complete', function (event, data) {
                    $("#testValidationForm").find(".is-invalid").removeClass("is-invalid");
                    $("#testValidationForm").find(".invalid-feedback").removeClass("invalid-feedback");
                    $("#testValidationForm").find("div.s2_help_inline").remove();
                    $("#testValidationForm").find("small.s2_feedback").remove();
                    $("#testValidationForm").find("div.s2_validation_errors").remove();

                });
            });
        </script> 
    </body>

</html>