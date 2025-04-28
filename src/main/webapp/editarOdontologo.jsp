
<%@page import="logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<h1>Editar Odontólogos</h1>
<% Odontologo odonto = (Odontologo) request.getSession().getAttribute("odontoEditar");%>

<form class="user"  method ="POST" action="SVEditOdontologos"  >
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="dni"
                   name="dni"    placeholder="Dni" value="<%=odonto.getDni()%>"  >
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   name="nombre" value="<%=odonto.getNombre()%>"    placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="apellido"
                   name="apellido" value="<%=odonto.getApellido()%>"    placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="telefono"
                   name="telefono" value="<%=odonto.getTelefono()%>"   placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="direccion"
                   name="direccion" value="<%=odonto.getDireccion()%>"  placeholder="Dirección">
        </div>
        <%
            String fechaFormateada = "";
            if (odonto.getFecha_nacimiento() != null) {
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                fechaFormateada = sdf.format(odonto.getFecha_nacimiento());
            }
        %>
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="fechanac"
                   name="fecha" value="<%=fechaFormateada%>" placeholder="Fecha de nacimiento">
        </div>

        <div class="col-sm-6 mb-3" >
            <input type="text" class="form-control form-control-user" id="especialidad"
                   name="especialidad" value="<%=odonto.getEspecialidad()%>"  placeholder="Especialidad">
        </div>
        <!-- aca va a ir todo lo q respecta a horarios y usuarios  -->
    </div>

    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Guardar modificación
    </button>
    <hr>

</form>

<%@include file="components/bodyFinal.jsp"  %>

