<%@page import="Modelo.Marcas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.control_marcas"%>
<!DOCTYPE html>
<!--[if IE 8]> 				 <html class="no-js lt-ie9" lang="en" > <![endif]-->
<!--[if gt IE 8]><!--> 
<html class="no-js" lang="es" > <!--<![endif]-->

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Marcas</title>
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
            control_marcas mar=new control_marcas();
            ArrayList<Marcas> lista=new ArrayList<Marcas>();
            lista=mar.listar_marcas("");
        %>
        <div class="row">
            <div class="large-5 columns">
                <h3>Gestión de Marcas</h3>
            </div>
            <div class="large-5 columns">
                <form method="get">
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
            <div class="large-2 columns">
                <a href="javascript:Enviar('Marcas_util.jsp','contenedor')">
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
                    <% for(Marcas m:lista){%>        
                    <tr>
                        <td><% out.println(m.getMar_codigo());%></td>
                        <td><% out.println(m.getMar_nombre());%></td>
                        <td><a href="#"></a><img src="../../../Images/detail.png" alt="Detalle"/>
                        </td>
                        <td><a href="javascript:Enviar('Marcas_edit.jsp?mar_codigo=<%out.print(m.getMar_codigo());%>','contenedor')#"><img src="../../../Images/edit.png" alt="Editar"/>
                            </a></td>
                            <td><a href="../../../Servlet_Marcas?id=4&mar_codigo=<%out.print(m.getMar_codigo());%>"><img src="../../../Images/delete.jpg" alt="Eliminar"/>
                                </a></td>
                    </tr>
                    <% }%>
                </table>
            </div>
        </div>
    </body>
</html>

