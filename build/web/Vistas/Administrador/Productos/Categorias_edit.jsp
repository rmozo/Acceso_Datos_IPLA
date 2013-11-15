<%@page import="Modelo.Categorias"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.control_categorias"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><meta charset="utf-8">
     <meta name="viewport" content="width=device-width">
  <title>Categorías</title>
     <link rel="stylesheet" href="../../../css/foundation.css">
    <script src="../../../js/vendor/custom.modernizr.js"></script>
    </head>
    <body>
        <% control_categorias cat=new control_categorias();
            int v1=Integer.parseInt(request.getParameter("cat_codigo"));
           String v2=request.getParameter("cat_nombre");
        %>
        <div class="row">
        <h3>Editar Categoría</h3><hr/>
        <form method="post" action="../../../Servlet_Categorias?id=3&cat_codigo=<%out.print(cat.getCat_codigo());%>&cat_nombre=">
            <table width="40%" align="center">
                <tr>
                    <td><input type="text" name="v1" Placeholder="<%out.print(v2);%>"/></td>
                </tr>
                <tr>
                    <td><input class="button expand" type="submit" value="Grabar"/></td>
                </tr>
            </table>
        </form>
        </div>
    </body>
</html>

