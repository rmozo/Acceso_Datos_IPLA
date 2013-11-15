<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Gestión de Usuarios</h3><hr/>
        <form action="../../../Servlet_Datos?op=4" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Rut.</td>
                        <td><input type="text" name="v1" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Password.</td>
                        <td><input type="password" name="v2" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Confimar.</td>
                        <td><input type="password" name="v3" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Nombres.</td>
                        <td><input type="text" name="v4" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Apellidos.</td>
                        <td><input type="text" name="v5" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Perfil.</td>
                        <td>
                            <select name="v6">
                                for
                                <option value=""></option>
                                <option></option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td align="center" colspan="2">
                            <input type="submit" value="Crear Cuenta" /> 
                        </td>
                        
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
