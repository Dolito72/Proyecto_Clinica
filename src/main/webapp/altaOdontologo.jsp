
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<h1>Alta Odontólogos</h1>
<form class="user"  method ="POST" action="SVOdontologos"  >
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="dni"
               name="dni"    placeholder="Dni">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
              name="nombre"     placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="apellido"
              name="apellido"     placeholder="Apellido">
        </div>
         <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="telefono"
               name="telefono"    placeholder="Telefono">
        </div>
         <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="direccion"
                name="direccion"   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="date" class="form-control form-control-user" id="fechanac"
                name="fecha"  placeholder="Fecha de nacimiento">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="especialidad"
                 name="especialidad"  placeholder="Especialidad">
        </div>
        <!-- aca va a ir todo lo q respecta a horarios y usuarios  -->
    </div>
  
    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Crear odontologo
    </button>
    <hr>
  
</form>

<%@include file="components/bodyFinal.jsp"  %>
