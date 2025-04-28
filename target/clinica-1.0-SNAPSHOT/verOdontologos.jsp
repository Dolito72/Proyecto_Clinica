<%@page import="java.util.List"%>
<%@page import="logica.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<!-- Page Heading -->
<h1 class="h3 mb-2 text-gray-800">Ver odontologos</h1>
<p class="mb-4">A continuación podrá visualizar la lista completa de odontólogos</p>

<!-- DataTales Example -->
<div class="card shadow mb-4">
  
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>id</th>
                         <th>Dni</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Direccion</th>
                        <th>Fecha Nacimiento</th>
                        <th>Especialidad</th>
                        <th style="width: 210px">Acción</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>id</th>
                        <th>Dni</th>
                         <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Direccion</th>
                        <th>Fecha Nacimiento</th>
                        <th>Especialidad</th>
                        <th style="width: 190px">Acción</th>
                      
                    </tr>
                </tfoot>
                
                <%
                    List<Odontologo> listaOdontologos =(List) request.getSession().getAttribute("listaOdontologos");
                           
                    %>
                <tbody>
                    <% for(Odontologo odonto: listaOdontologos){ %>
                    <tr>
                        <td id="id_odonto"><%=odonto.getId()%></td>
                        <td><%=odonto.getDni() %></td>
                        <td><%=odonto.getNombre() %></td>
                        <td><%=odonto.getApellido() %></td>
                        <td><%=odonto.getTelefono() %></td>
                        <td><%=odonto.getDireccion() %></td>
                        <td><%=odonto.getFecha_nacimiento() %></td>
                        <td><%=odonto.getEspecialidad() %></td>
                        <td style="display: flex; width: 200px;">
                            <form name="eliminar"  method ="POST" action="SVEliminarOdontologos">
                                <button  class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;" type="submit">
                                    <i class="fas fa-trash-alt"></i>  Eliminar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=odonto.getId() %>">
                            </form>
                            <form name="editar"  method ="GET" action="SVEditOdontologos">
                                <button  class="btn btn-primary btn-user btn-block" style=" margin-left: 5px;" type="submit">
                                    <i class="fas fa-pencil-alt"></i>  Editar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=odonto.getId() %>">
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