package org.apache.jsp.Vistas.Administrador.Productos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Categorias;
import Controlador.control_categorias;

public final class Categorias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8]> \t\t\t\t <html class=\"no-js lt-ie9\" lang=\"en\" > <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> \n");
      out.write("<html class=\"no-js\" lang=\"es\" > <!--<![endif]-->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("  <title>Categorías</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../../css/foundation.css\">\n");
      out.write("  <script src=\"../../../js/vendor/custom.modernizr.js\"></script>\n");
      out.write("  \n");
      out.write("   <!-- Abrir pagina en DIV -->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function ajaxFunction() {\n");
      out.write("            var xmlHttp;\n");
      out.write("            try {\n");
      out.write("\n");
      out.write("            xmlHttp=new XMLHttpRequest();\n");
      out.write("            return xmlHttp;\n");
      out.write("          } catch (e) {\n");
      out.write("\n");
      out.write("            try {\n");
      out.write("              xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("              return xmlHttp;\n");
      out.write("            } catch (e) {\n");
      out.write("\n");
      out.write("                  try {\n");
      out.write("                xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                return xmlHttp;\n");
      out.write("              } catch (e) {\n");
      out.write("                alert(\"Tu navegador no soporta AJAX!\");\n");
      out.write("                return false;\n");
      out.write("              }}}\n");
      out.write("        }\n");
      out.write("       function Enviar(_pagina,capa) {\n");
      out.write("            var ajax;\n");
      out.write("            ajax = ajaxFunction();\n");
      out.write("            ajax.open(\"POST\", _pagina, true);\n");
      out.write("            ajax.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("\n");
      out.write("            ajax.onreadystatechange = function() {\n");
      out.write("                        if (ajax.readyState==1){\n");
      out.write("                                document.getElementById(capa).innerHTML = \" Aguarde por favor...\";\n");
      out.write("                                     }\n");
      out.write("                        if (ajax.readyState == 4) {\n");
      out.write("\n");
      out.write("                        document.getElementById(capa).innerHTML=ajax.responseText; \n");
      out.write("                             }}\n");
      out.write("\n");
      out.write("                ajax.send(null);\n");
      out.write("        } \n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String buscar=request.getParameter("buscar");
            if (buscar==null)
                buscar="";
            control_categorias cat=new control_categorias();
            ArrayList<Categorias> lista=new ArrayList<Categorias>();
            lista=cat.listar_categorias(buscar);
        
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"large-5 columns\">\n");
      out.write("                <h3>Gestión de Categorías</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"large-5 columns\">\n");
      out.write("                <form action=\"Categorias.jsp\" method=\"get\">\n");
      out.write("                    <table>\n");
      out.write("                       <tr>\n");
      out.write("                           <td> \n");
      out.write("                               <input type=\"text\" name=\"buscar\" placeholder=\"Dato a buscar...\"/>\n");
      out.write("                           </td>\n");
      out.write("                           <td>\n");
      out.write("                               <input type=\"submit\" Value=\"Buscar\" class=\"button tiny\"/>\n");
      out.write("                           </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"large-2 columns\">\n");
      out.write("                <a href=\"javascript:Enviar('Categorias_util.jsp','contenedor')\">\n");
      out.write("                    <img src=\"../../../Images/add.png\" alt=\"Agregar\"/>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <hr/>\n");
      out.write("            \n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <table width=\"60%\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Código</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th colspan=\"3\">Operaciones</th> \n");
      out.write("                    </tr>\n");
      out.write("                    ");
 for(Categorias c:lista){
      out.write("        \n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
 out.println(c.getCat_codigo());
      out.write("</td>\n");
      out.write("                        <td>");
 out.println(c.getCat_nombre());
      out.write("</td>\n");
      out.write("                        <td><a href=\"../../../Servlet_Categorias?id=2&cat_codigo=");
out.print(c.getCat_codigo());
      out.write("\"></a><img src=\"../../../Images/detail.png\" alt=\"Detalle\"/>\n");
      out.write("                        </td>\n");
      out.write("                        <td><a href=\"../../../Servlet_Categorias?id=3&cat_codigo=");
out.print(c.getCat_codigo());
      out.write("\"><img src=\"../../../Images/edit.png\" alt=\"Editar\"/>\n");
      out.write("                            </a></td>\n");
      out.write("                            <td><a href=\"../../../Servlet_Categorias?id=4&cat_codigo=");
out.print(c.getCat_codigo());
      out.write("\"><img src=\"../../../Images/delete.jpg\" alt=\"Eliminar\"/>\n");
      out.write("                                </a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
