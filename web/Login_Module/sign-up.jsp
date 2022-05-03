<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Sign-up</title>

        <!-- Meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />

        <meta name="keywords" content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
        <meta name="author" content="Codedthemes" />
        <!-- Favicon icon -->

        <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
        <!-- Google font-->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,700" rel="stylesheet">
        <!-- Required Fremwork -->
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap/css/bootstrap.min.css">
        <!-- waves.css -->
        <link rel="stylesheet" href="assets/pages/waves/css/waves.min.css" type="text/css" media="all">
        <!-- themify-icons line icon -->
        <link rel="stylesheet" type="text/css" href="assets/icon/themify-icons/themify-icons.css">
        <!-- ico font -->
        <link rel="stylesheet" type="text/css" href="assets/icon/icofont/css/icofont.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" type="text/css" href="assets/icon/font-awesome/css/font-awesome.min.css">
        <!-- Style.css -->
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <style type="text/css">
            .errorMessage{
                color:red;
            }
            /*            .welcome {
                            background-color:green;
                            border:1px solid black;
                            width:400px;
                        }*/
        </style>
    </head>

    <body themebg-pattern="theme1">
        <!-- Pre-loader start -->
        <div class="theme-loader">
            <div class="loader-track">
                <div class="preloader-wrapper">
                    <div class="spinner-layer spinner-blue">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                    <div class="spinner-layer spinner-red">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>

                    <div class="spinner-layer spinner-yellow">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>

                    <div class="spinner-layer spinner-green">
                        <div class="circle-clipper left">
                            <div class="circle"></div>
                        </div>
                        <div class="gap-patch">
                            <div class="circle"></div>
                        </div>
                        <div class="circle-clipper right">
                            <div class="circle"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Pre-loader end -->


        <section class="login-block">
            <!-- Container-fluid starts -->
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12">
                            <form class="md-float-material form-material"  action="signup.action" method="post" onreset="clearErrorMessages(this); clearErrorLabels(this);">
                                <div class="text-center">
                                    <h3 class="text-light" >Placement Arena</h3>
                                </div>
                                <div class="auth-box card">
                                    <div class="card-block">
                                        <div class="row m-b-20">
                                            <div class="col-md-12">

                                                <h3 class="text-center txt-primary">Sign-up</h3>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="col-sm-6">
                                                <div class="form-group form-primary">
                                                    <s:textfield name="firstname"  errorPosition="bottom" cssClass="form-control pl-1"/>  
                                                    <!--                                                <span class="form-bar"></span>-->
                                                    <label class="float-label" id="firstname_float">First Name</label>
                                                </div>
                                            </div>
                                            <div class="col-sm-6">
                                                <div class="form-group form-primary">
                                                    <s:textfield name="lastname" errorPosition="bottom" cssClass="form-control pl-1"/>  
                                                    <!--                                                <span class="form-bar"></span>-->
                                                    <label class="float-label" id="lastname_float">Last Name</label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group form-primary">
                                            <s:textfield name="email" errorPosition="bottom" cssClass="form-control pl-1"/>  
                                            <!--                                        <span class="form-bar"></span>-->
                                            <label class="float-label" id="email_float">Your Email Address</label>
                                        </div>
                                        <div class="row">
                                            <div class="col">
                                                <div class="form-group form-primary">

                                                    <s:password name="password" id="pwd" errorPosition="bottom"  cssClass="form-control pl-1"/>                                           
                                                    <!--                                                <span class="form-bar"></span>-->
                                                    <label class="float-label" id="password_float">Password</label>
                                                </div>
                                            </div>

                                        </div>
                                        <s:hidden name="pagename" value="signup" />
                                        <div class="row m-t-25 text-left">

                                            <div class="col-md-12">
                                                <div class="checkbox-fade fade-in-primary">
                                                    <label>
                                                        <input type="checkbox" id="check" value="">
                                                        <span class="cr"><i class="cr-icon icofont icofont-ui-check txt-primary"></i></span>
                                                        <span class="text-inverse">Show Password</span>
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row m-t-30">
                                            <div class="col-md-12">
                                                <button type="submit" class="btn btn-primary btn-md btn-block waves-effect waves-light text-center m-b-20">Sign up</button>

                                                <!--                                            <input type="submit" id="submit_0" value="Submit"/>-->
                                            </div>
                                        </div>
                                        <hr/>
                                        <div class="row">
                                            <div class="col-md-10">
                                                <p class="text-inverse text-left "><s:a href="signin-page"><b>Already have an account?</b></s:a></p>
                                                </div>
                                                <div class="col-md-2">
                                                    <img src="assets/images/auth/Logo-small-bottom.png" alt="small-logo.png">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                            </form>
                    </div>
                    <!-- end of col-sm-12 -->
                </div>
                <!-- end of row -->
            </div>
            <!-- end of container-fluid -->
        </section>

        <script type="text/javascript" src="assets/js/jquery/jquery.min.js "></script>
        <script type="text/javascript" src="assets/js/jquery-ui/jquery-ui.min.js "></script>

        <script type="text/javascript" src="assets/js/popper.js/popper.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap/js/bootstrap.min.js "></script>
        <!-- waves js -->
        <script src="assets/pages/waves/js/waves.min.js"></script>

        <!-- jquery slimscroll js -->
        <script type="text/javascript" src="assets/js/jquery-slimscroll/jquery.slimscroll.js"></script>
        <script type="text/javascript" src="assets/js/common-pages.js"></script>
        <script>
                            $(document).ready(function () {
                                if ($('#firstname').val()) {
                                    $("#firstname_float").css({"top": "-15px", "font-size": "14px"});
//                                    alert("empty");
                                }
                                if ($('#lastname').val()) {
                                    $("#lastname_float").css({"top": "-15px", "font-size": "14px"});
//                                    alert("empty");
                                }
                                if ($('#email').val()) {
                                    $("#email_float").css({"top": "-15px", "font-size": "14px"});
//                                    alert("empty");
                                }
                                if ($('#password').val()) {
                                    $("#password_float").css({"top": "-15px", "font-size": "14px"});
//                                    alert("empty");
                                }


                                $('#check').click(function () {
                                    if ($('#pwd').attr('type') === 'password') {
                                        $('#pwd').prop('type', 'text');
                                    } else {
                                        $('#pwd').prop('type', 'password');
                                    }
                                });
                            });
        </script>
    </body>

</html>
