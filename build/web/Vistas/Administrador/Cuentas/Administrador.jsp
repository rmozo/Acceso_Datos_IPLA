
<%@page import="Modelo.Personas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.control_personas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% //Crear un objeto a control_personas 
    control_personas per=new control_personas();
    ArrayList<Personas> lista=new ArrayList<Personas>();
    lista=per.listar();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head>
    <body>
        <h1>Gestión de Cuentas</h1><hr/>
		<fieldset>
			<legend>Lista de Usuarios</legend>
                        <a href="Crear_Cuentas.jsp">
                            <img src="../../../Images/add.png" alt="Agregar"/>
                        </a>                   
                        
			<table width="60%" border="1" align="center">
  <tr>
    <th>Rut</th>
    <th>Password</th>
    <th>Nombres</th>
    <th>Apellidos</th>
    <th>Perfiles</th>
	<th colspan="2">Operaciones</th>
  </tr>
  <% for(Personas p:lista){ %>
  <tr align="center">
    <td><% out.println(p.getRut()); %></td>
    <td><% out.println(p.getPassword()); %></td>
    <td><% out.println(p.getNombres()); %></td>
    <td><% out.println(p.getApellidos()); %></td>
    <td><% out.println(p.getPf_nombre()); %></td>
    <td><a href="../../../Servlet_Datos?op=2&rut=<% out.print(p.getRut()); %>"><img src="../../../Images/editar.png" alt="editar"/></a></td>
    <td><a href="../../../Servlet_Datos?op=3&rut=<% out.print(p.getRut()); %>"><img src="../../../Images/eliminar.gif" alt="eliminar"/></a></td>
  </tr>
  <% } %>
</table>

		</fieldset>
    </body>
</html>
