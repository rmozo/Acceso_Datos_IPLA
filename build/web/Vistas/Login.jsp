<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso</title>
        <link rel="stylesheet" href="../css/foundation.css">
  	<script src="../js/vendor/custom.modernizr.js"></script>
    </head>
    <body>
        <div class="panel"><h2>Ingreso de Datos</h2></div>
        <hr/>
        <form action="Servlet_Datos?op=1" method="POST">
          <table width="60%" align="center">
            <tr>
                <td colspan="2"><h2>Identificate</h2></td>
            </tr>
            <tr>
              <td>
                  <label><h3>Rut</h3></label>
                  <input type="text" name="v1" required>
              </td>
            </tr>
            <tr>
                <td><label><h3>Password</h3></label>
                 <input type="password" name="v2" required>
              </td>
            </tr>
            <tr align="center">
              <td colspan="2">
                <input type="submit" value="Iniciar Sesión" class="button expand">
              </td>
            </tr>
          </table>
        </form>
    </body>
</html>
