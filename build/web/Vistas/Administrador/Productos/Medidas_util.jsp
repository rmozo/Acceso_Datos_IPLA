<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><meta charset="utf-8">
     <meta name="viewport" content="width=device-width">
  <title>Medidas</title>
     <link rel="stylesheet" href="../../../css/foundation.css">
    <script src="../../../js/vendor/custom.modernizr.js"></script>
    </head>
    <body>
        <div class="row">
        <h3>Nueva Medida</h3><hr/>
        <form method="post" action="../../../Servlet_Medidas?id=1">
            <table width="40%" align="center">
                <tr>
                    <td><input type="text" name="v1" placeholder="Nombre Medida"/></td>
                </tr>
                <tr>
                    <td><input class="button expand" type="submit" value="Grabar"/></td>
                </tr>
            </table>
        </form>
        </div>
    </body>
</html>