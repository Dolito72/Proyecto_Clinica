<%@page import="java.util.List"%>
<%@page import="logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"  %>
<%@include file="components/body.jsp"  %>

<!-- Page Heading -->
<h1 class="h3 mb-2 text-gray-800">Ver pacientes</h1>
<p class="mb-4">A continuación podrá visualizar la lista completa de pacientes</p>

<!-- DataTales Example -->
<div class="card shadow mb-4">
  
    <div class="card-body">
        <div class="table-responsive">
           <table class="table table-bordered mx-auto" id="dataTable" style="width: 80%;" cellspacing="0">

                <thead>
                    <tr>
                        <th style="width: 40px;">ID</th>
                         <th>Dni</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Direccion</th>
                        <th>Fecha Nacimiento</th>
                        <th>Tiene OS</th>
                        <th style="width: 30px;">Sangre</th>
                        <th style="width: 210px">Acción</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th style="width: 40px;">ID</th>
                        
                        <th>Dni</th>
                         <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Direccion</th>
                        <th>Fecha Nacimiento</th>
                        
                        <th>Tiene OS</th>
                        <th style="width: 30px;">Sangre</th>
                        <th style="width: 190px">Acción</th>
                      
                    </tr>
                </tfoot>
                
                <%
                    List<Paciente> listaPacientes =(List) request.getSession().getAttribute("listaPacientes");
                           
                    %>
                <tbody>
                    <% for(Paciente paciente: listaPacientes){ %>
                    <tr>
                        <td id="id_paciente"><%=paciente.getId()%></td>
                        <td><%=paciente.getDni() %></td>
                        <td><%=paciente.getNombre() %></td>
                        <td><%=paciente.getApellido() %></td>
                        <td><%=paciente.getTelefono() %></td>
                        <td><%=paciente.getDireccion() %></td>
                        <td><%=paciente.getFecha_nacimiento() %></td>
                        <td><%= paciente.isTiene_os() ? "Sí" : "No" %></td>

                        <td><%=paciente.getTipo_sangre()%></td>
                        <td style="display: flex; width: 200px;">
                            <form name="eliminar"  method ="POST" action="SVEliminarPacientes">
                                <button  class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;" type="submit">
                                    <i class="fas fa-trash-alt"></i>  Eliminar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=paciente.getId() %>">
                            </form>
                            <form name="editar"  method ="GET" action="SVEditPacientes">
                                <button  class="btn btn-primary btn-user btn-block" style=" margin-left: 5px;" type="submit">
                                    <i class="fas fa-pencil-alt"></i>  Editar
                                    
                                </button>
                                <input type="hidden"  name="id" value="<%=paciente.getId() %>">
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
