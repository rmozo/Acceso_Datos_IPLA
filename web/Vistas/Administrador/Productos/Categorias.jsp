<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Categorias"%>
<%@page import="Controlador.control_categorias"%>
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
            String buscar=request.getParameter("buscar");
            if (buscar==null)
                buscar="";
            control_categorias cat=new control_categorias();
            ArrayList<Categorias> lista=new ArrayList<Categorias>();
            lista=cat.listar_categorias(buscar);
        %>
        <div class="row">
            <div class="large-5 columns">
                <h3>Gestión de Categorías</h3>
            </div>
            <div class="large-5 columns">
                <form action="Categorias.jsp" method="get">
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
                <a href="javascript:Enviar('Categorias_util.jsp','contenedor')">
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
                    <% for(Categorias c:lista){%>        
                    <tr>
                        <td><% out.println(c.getCat_codigo());%></td>
                        <td><% out.println(c.getCat_nombre());%></td>
                        <td><a href="../../../Servlet_Categorias?id=2&cat_codigo=<%out.print(c.getCat_codigo());%>"></a><img src="../../../Images/detail.png" alt="Detalle"/>
                        </td>
                        <td><a href="../../../Servlet_Categorias?id=3&cat_codigo=<%out.print(c.getCat_codigo());%>"><img src="../../../Images/edit.png" alt="Editar"/>
                            </a></td>
                            <td><a href="../../../Servlet_Categorias?id=4&cat_codigo=<%out.print(c.getCat_codigo());%>"><img src="../../../Images/delete.jpg" alt="Eliminar"/>
                                </a></td>
                    </tr>
                    <% }%>
                </table>
            </div>
        </div>
    </body>
</html>
