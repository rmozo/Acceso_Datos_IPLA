<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Proveedores"%>
<%@page import="Controlador.control_proveedores"%>
<!DOCTYPE html>
<!--[if IE 8]> 				 <html class="no-js lt-ie9" lang="en" > <![endif]-->
<!--[if gt IE 8]><!--> 
<html class="no-js" lang="es" > <!--<![endif]-->

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Categorías</title>
  <link rel="stylesheet" href="../../../css/foundation.css">
  <script src="../../../js/vendor/custom.modernizr.js"></script>
  
   <!-- Abrir pagina en DIV -->
    <script type="text/javascript">
        function ajaxFunction() {
            var xmlHttp;
            try {

            xmlHttp=new XMLHttpRequest();
            return xmlHttp;
          } catch (e) {

            try {
              xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
              return xmlHttp;
            } catch (e) {

                  try {
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                return xmlHttp;
              } catch (e) {
                alert("Tu navegador no soporta AJAX!");
                return false;
              }}}
        }
       function Enviar(_pagina,capa) {
            var ajax;
            ajax = ajaxFunction();
            ajax.open("POST", _pagina, true);
            ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

            ajax.onreadystatechange = function() {
                        if (ajax.readyState==1){
                                document.getElementById(capa).innerHTML = " Aguarde por favor...";
                                     }
                        if (ajax.readyState == 4) {

                        document.getElementById(capa).innerHTML=ajax.responseText; 
                             }}

                ajax.send(null);
        } 
    </script>
</head>
    <body>
        <% 
            control_proveedores prov=new control_proveedores();
            ArrayList<Proveedores> lista=new ArrayList<Proveedores>();
            lista=prov.listar_proveedores("");
        %>
        <div class="row">
            <div class="large-5 columns">
                <h3>Gestión de Proveedores</h3>
            </div>
            <div class="large-4 columns">
                <form action="../../../Servlet_Proveedor?id=5&buscar=" method="post">
                    <table>
                       <tr>
                           <td> 
                               <input type="text" name="buscar" placeholder="Dato a buscar..."/>
                           </td>
                           <td>
                               <input type="submit" Value="Buscar" class="button tiny"/>
                           </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="large-3 columns">
                <a href="javascript:Enviar('Proveedor_util.jsp','contenedor')">
                    <img src="../../../Images/add.png" alt="Agregar"/>
                </a>
            </div>
            <hr/>
            
            <div class="panel">
                <table width="60%" align="center">
                    <tr>
                        <th>Código</th>
                        <th>Nombre</th>
                        <th colspan="3">Operaciones</th> 
                    </tr>
                    <% for(Proveedores c:lista){%>        
                    <tr align="center">
                        <td><% out.println(c.getProv_codigo());%></td>
                        <td><% out.println(c.getProv_nombre());%></td>
                        <td><a href="../../../Servlet_Proveedores?id=2&prov_codigo=<%out.print(c.getProv_codigo());%>"></a><img src="../../../Images/detalle.png" width="30" height="30" alt="Detalle"/>
                        </td>
                        <td><a href="javascript:Enviar('Proveedores_edit.jsp?prov_codigo=<%out.print(c.getProv_codigo());%>','contenedor')"><img src="../../../Images/editar.png" width="30" height="30" alt="Editar"/>
                            </a></td>
                            <td><a href="../../../Servlet_Proveedores?id=4&prov_codigo=<%out.print(c.getProv_codigo());%>"><img src="../../../Images/delete.png" width="30" height="30" alt="Eliminar"/>
                                </a></td>
                    </tr>
                    <% }%>
                </table>
            </div>
        </div>
    </body>
</html>


