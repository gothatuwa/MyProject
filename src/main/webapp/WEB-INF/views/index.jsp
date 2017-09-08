<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html data-ng-app="userRegistrationModule">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Customer Register</title>
    <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
    <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />

    <!-- Fav and touch icons -->

</head>


<body>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><link rel="shortcut icon" href="<c:url value='/static/img/' />"> </a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="about.html">Home</a>
                </li>
                <li>
                    <a href="services.html">Contact</a>
                </li>
                <li>
                    <a href="contact.html">Register</a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Portfolio <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="portfolio-1-col.html">1 Column Portfolio</a>
                        </li>
                        <li>
                            <a href="portfolio-2-col.html">2 Column Portfolio</a>
                        </li>
                        <li>
                            <a href="portfolio-3-col.html">3 Column Portfolio</a>
                        </li>
                        <li>
                            <a href="portfolio-4-col.html">4 Column Portfolio</a>
                        </li>
                        <li>
                            <a href="portfolio-item.html">Single Portfolio Item</a>
                        </li>
                    </ul>
                </li>



            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Header Carousel -->

<header id="myCarousel" class="carousel slide">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
        <div class="item active">
            <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide One');"></div>
            <div class="carousel-caption">
                <h2>Text Will Be Displayed Here</h2>
            </div>
        </div>
        <div class="item">
            <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Two');"></div>
            <div class="carousel-caption">
                <h2>Text Will Be Displayed Here</h2>
            </div>
        </div>
        <div class="item">
            <div class="fill" style="background-image:url('http://placehold.it/1900x1080&text=Slide Three');"></div>
            <div class="carousel-caption">
                <h2>Text Will Be Displayed Here</h2>
            </div>
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
        <span class="icon-prev"></span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
        <span class="icon-next"></span>
    </a>
</header>


<!-- Page Content -->
<div class="container">

    <!-- Marketing Icons Section -->
    <div class="row">
    <!---Customer Registraction form-->

            <h1 class="well">Registration Form</h1>
            <div class="col-lg-12 well"  data-ng-controller="userRegistrationController">
                <div class="row">
                    <form>

                        <div class="col-sm-12">
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>First Name</label>
                                    <input type="text" data-ng-model="firstname"  id="firstname" placeholder="Enter First Name Here.." class="form-control">
                                </div>
                                <div class="col-sm-6 form-group">
                                    <label>Last Name</label>
                                    <input type="text" data-ng-model="lastname" id="lastname" placeholder="Enter Last Name Here.." class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Address</label>
                                <textarea data-ng-model="address" id="address" placeholder="Enter Address Here.." rows="3" class="form-control"></textarea>
                            </div>
                            <div class="row">
                                <div class="col-sm-4 form-group">
                                    <label>City</label>
                                    <input type="text"  data-ng-model="city" id="city" placeholder="Enter City Name Here.." class="form-control">
                                </div>
                                <div class="col-sm-4 form-group">
                                    <label>State</label>
                                    <input type="text" data-ng-model="statee" id="statee" placeholder="Enter State Name Here.." class="form-control">
                                </div>
                                <div class="col-sm-4 form-group">
                                    <label>Job</label>
                                    <input type="text" data-ng-model="job" id="job" placeholder="Enter Job Here.." class="form-control">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6 form-group">
                                    <label>Title</label>
                                    <input type="text"data-ng-model="titlee" id="titlee"placeholder="Enter Designation Here.." class="form-control">
                                </div>
                                <div class="col-sm-6 form-group">
                                    <label>Company</label>
                                    <input type="text" data-ng-model="comname" id="comname" placeholder="Enter Company Name Here.." class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Phone Number</label>
                                <input type="text" data-ng-model="phone" id="phone"placeholder="Enter Phone Number Here.." class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Email Address</label>
                                <input type="text" data-ng-model="email1" id="email1" placeholder="Enter Email Address Here.." class="form-control">
                            </div>
                            <button class="btn btn-primary  btn-padding  margin-right10" onclick="studentSave();">click</button>

                            <button class="btn btn-primary  btn-padding  margin-right10" onclick="saveValues();"><spring:message code="Add"/>(saveValues)</button>
                        </div>
                    </form>
                </div>
            </div>


    </div>
    <!-- /.row -->

    <!-- Portfolio Section -->
    <div class="row">
        <div class="col-lg-12" >
            <section class="wow fadeInRight" data-wow-delay="0.5s">
                <h2 class="page-header">Portfolio Heading</h2>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
        <div class="col-md-4 col-sm-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <a href="portfolio-item.html">
                    <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                </a>
            </section>
        </div>
    </div>
    <!-- /.row -->
    <!-- Application JS -->


    <!-- Features Section -->
    <div class="row">
        <div class="col-lg-12">
            <section class="wow fadeInRight" data-wow-delay="0.5s">
                <h2 class="page-header">Modern Business Features</h2>
            </section>
        </div>
        <div class="col-md-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <p>The Modern Business template by Start Bootstrap includes:</p>
                <ul>
                    <li><strong>Bootstrap v3.2.0</strong>
                    </li>
                    <li>jQuery v1.11.0</li>
                    <li>Font Awesome v4.1.0</li>
                    <li>Working PHP contact form with validation</li>
                    <li>Unstyled page elements for easy customization</li>
                    <li>17 HTML pages</li>
                </ul>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, omnis doloremque non cum id reprehenderit, quisquam totam aspernatur tempora minima unde aliquid ea culpa sunt. Reiciendis quia dolorum ducimus unde.</p>
            </section>
        </div>
        <div class="col-md-6">
            <section class="wow fadeInDown" data-wow-delay="0.5s">
                <img class="img-responsive" src="http://placehold.it/700x450" alt="">
            </section>
        </div>
    </div>
    <!-- /.row -->

    <hr>

    <!-- Call to Action Section -->
    <div class="well">
        <div class="row">
            <div class="col-md-8">
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestias, expedita, saepe, vero rerum deleniti beatae veniam harum neque nemo praesentium cum alias asperiores commodi.</p>
            </div>
            <div class="col-md-4">
                <a class="btn btn-lg btn-default btn-block" href="#">Call to Action</a>
            </div>
        </div>
    </div>

    <hr>

    <!-- Footer -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <p>Copyright &copy; Your Website 2014</p>
            </div>
        </div>
    </footer>

</div>
<!-- /.container -->

<div class="sectiona">
    <!-- Portfolio Section -->

    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <section class="wow fadeInRight" data-wow-delay="0.5s">
                    <h2 class="page-header">Portfolio Heading</h2>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
            <div class="col-md-4 col-sm-6">
                <section class="wow fadeInDown" data-wow-delay="0.5s">
                    <a href="portfolio-item.html">
                        <img class="img-responsive img-portfolio img-hover" src="http://placehold.it/700x450" alt="">
                    </a>
                </section>
            </div>
        </div>

    </div>



    <div id="owl-demo" class="owl-carousel owl-theme">
        <div class="item"><h2>Text Here </h2><p>"Quisque condimentum nec mauris rutrum consectetur… </p>
        </div>
        <div class="item"><h2>Text Here </h2><p>"Quisque condimentum nec mauris rutrum consectetur… </p>
        </div>
        <div class="item"><h2>Text Here </h2><p>"Quisque condimentum nec mauris rutrum consectetur… </p>
        </div>
    </div>





    <div class="sectionb">
        <div class="container"><link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

            <div class="facontainer">
                <section class="wow fadeInDown" data-wow-delay="0.2s"><h2>Get in touch</h2></section>
                <section class="wow fadeInDown" data-wow-delay="0.2s">
                    <p>Sed ut perspiciatis unde omnis is natus error sit voluptantium doloremqtium, totam rem aperiam, eaque ipsa quae abtore veritatis et quasi architecto beatae vitae dicta.</p></section>

                <li class="wow fadeInDown" data-wow-delay="0.6s"><a href="">
                    <i class="bd-ra fa fa-google-plus"></i></a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="0.8s"><a href="">
                    <i class="bd-ra fa fa-twitter"></i></a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="1s"><a href="">
                    <i class="fa fa-facebook"></i></a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="1.2s"><a href="">
                    <i class="bd-ra fa fa-pinterest"></i></a>
                </li>
                <li class="wow fadeInDown" data-wow-delay="1.4s"><a href="">
                    <i class="bd-ra fa fa-linkedin"></i></a>
                </li>
            </div></div>
    </div>

    <!-- /.row -->
</div>




<!-- Script to Activate the Carousel -->


<script src="<c:url value='/static/scripts/application_js/jquery-1.2.4.min.js' />"></script>
<script src="<c:url value='/static/scripts/application_js/jquery-1.2.6.js' />"></script>

<script src="<c:url value='/static/scripts/application_js/CustomerReg.js' />"></script>
</body>

</html>
