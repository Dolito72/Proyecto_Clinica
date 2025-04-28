<%--   --%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<h1>Editar Usuarios</h1>
<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); %>
<form class="user"  method ="POST" action="SVEditUsuarios">
    <div class="form-group col">
       
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="nombreusu" id="nombreusu"
                   placeholder="Nombre usuario" value="<%=usu.getNombreUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3" >
            <input type="password" class="form-control form-control-user" name="contrasenia" id="contrasenia"
                   placeholder="Contraseña" value="<%=usu.getContrasenia()%>"  >
        </div>
         <div class="col-sm-6 mb-3" >
             <input type="text" class="form-control form-control-user" name="rol" id="rol"
                   placeholder="Rol" value="<%=usu.getRol()%>"   >
        </div>
         
      
    </div>
  
    <button  class="btn btn-primary btn-user btn-block" type="submit">
        Guardar modificación
    </button>
    <hr>
  
</form>

<%@include file="components/bodyFinal.jsp"  %>

