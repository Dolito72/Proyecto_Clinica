
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"  %>

<body class="bg-gradient-primary">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image">
                                <img src="img/odonto4.jpeg" class="img-fluid" style="width: 100%; height: 100%; object-fit: cover;">
                            </div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Ingreso clínica</h1>
                                    </div>
                                    <form class="user" action="SVLogin" method="POST">
                                        
                                        <div class="form-group">

                                        </div>

                                        <hr>
                                        <br>
                                        <p>Necesita estar logueado para ingresar</p>
                                        <br>
                                        <a  href="loguin.jsp"  class="btn btn-primary btn-user btn-block" >
                                            Ir al loguin
                                            </a>
                                        <br>
                                    </form>
                                    <hr>
                                    <div class="text-center">

                                    </div>
                                    <div class="text-center">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

</body>


</html>
