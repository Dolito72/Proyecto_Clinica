
<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<!-- Page Heading -->
<h1 class="h3 mb-2 text-gray-800">Ver usuarios</h1>
<p class="mb-4">A continuación podrá visualizar la lista completa de usuarios</p>

<!-- DataTales Example -->
<div class="card shadow mb-4">
  
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nombre de usuario</th>
                        <th>Rol</th>
                        <th style="width: 210px">Acción</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>id</th>
                        <th>Nombre de usuario</th>
                        <th>Rol</th>
                        <th style="width: 210px">Acción</th>
                      
                    </tr>
                </tfoot>
                <%
                    List<Usuario> listaUsuarios =(List) request.getSession().getAttribute("listaUsuarios");
                    %>
                <tbody>
                    <% for(Usuario usu: listaUsuarios){ %>
                    <tr>
                        <td id="id_usu"><%=usu.getId_usuario()%></td>
                        <td><%=usu.getNombreUsuario() %></td>
                        <td><%=usu.getRol() %></td>
                        <td style="display: flex; width: 230px;">
                            <form name="eliminar"  method ="POST" action="SVEliminarUsuarios">
                                <button  class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;" type="submit">
                                    <i class="fas fa-trash-alt"></i>  Eliminar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=usu.getId_usuario() %>">
                            </form>
                            <form name="editar"  method ="GET" action="SVEditUsuarios">
                                <button  class="btn btn-primary btn-user btn-block" style=" margin-left: 5px;" type="submit">
                                    <i class="fas fa-pencil-alt"></i>  Editar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=usu.getId_usuario() %>">
                            </form>
                         
                         
                         
                         </td>
                        
                    </tr>
                  <%}%>
                </tbody>
            </table>
        </div>
    </div>
</div>

</div>
<!-- /.container-fluid -->

            



<%@include file="components/bodyFinal.jsp"  %>

