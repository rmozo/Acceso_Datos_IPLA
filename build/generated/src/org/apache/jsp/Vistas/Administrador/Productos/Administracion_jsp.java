package org.apache.jsp.Vistas.Administrador.Productos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Administracion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8]> \t\t\t\t <html class=\"no-js lt-ie9\" lang=\"en\" > <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> \n");
      out.write("<html class=\"no-js\" lang=\"es\" > <!--<![endif]-->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("  <title>Gestión de Productos</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../../css/foundation.css\">\n");
      out.write("  <script src=\"../../../js/vendor/custom.modernizr.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Abrir pagina en DIV -->\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- Menu -->\n");
      out.write("\t\t\t<div class=\"large-4 columns\">\n");
      out.write("                            <img src=\"../../../Images/carrito.png\" width=\"128\" height=\"128\" alt=\"icono\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("            <div class=\"large-8 columns\">\n");
      out.write("            \t<div class=\"large-12 columns\">\n");
      out.write("\t              \n");
      out.write("\n");
      out.write("        <nav class=\"top-bar\">\n");
      out.write("          <ul class=\"title-area\">\n");
      out.write("            <!-- Title Area -->\n");
      out.write("            <li class=\"name\">\n");
      out.write("              <h1><a href=\"/\">Ventas Ipla</a></h1>\n");
      out.write("            </li>\n");
      out.write("            <!-- Remove the class \"menu-icon\" to get rid of menu icon. Take out \"Menu\" to just have icon alone -->\n");
      out.write("            <li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <section class=\"top-bar-section\">\n");
      out.write("            <ul class=\"left\">\n");
      out.write("              <li class=\"divider\"></li>\n");
      out.write("              <li class=\"has-dropdown\"><a href=\"/grid.php\">Item 1</a>\n");
      out.write("\n");
      out.write("                <ul class=\"dropdown\">\n");
      out.write("                  <li><label>Level One</label></li>\n");
      out.write("                  <li><a href=\"#\">Sub-item 1</a></li>\n");
      out.write("                  <li><a href=\"#\">Sub-item 2</a></li>\n");
      out.write("                  <li class=\"divider\"></li>\n");
      out.write("                  <li><a href=\"#\">Sub-item 3</a></li>\n");
      out.write("                  <li class=\"has-dropdown\"><a href=\"#\">Sub-item 4</a>\n");
      out.write("\n");
      out.write("                    <ul class=\"dropdown\">\n");
      out.write("                      <li><label>Level Two</label></li>\n");
      out.write("                      <li class=\"has-dropdown\"><a href=\"#\">Sub-item 1</a>\n");
      out.write("\n");
      out.write("                        <ul class=\"dropdown\">\n");
      out.write("                          <li><label>Level Three</label></li>\n");
      out.write("                          <li class=\"has-dropdown\"><a href=\"#\">Sub-item 1</a>\n");
      out.write("\n");
      out.write("                            <ul class=\"dropdown\">\n");
      out.write("                              <li><label>Level Four</label></li>\n");
      out.write("                              <li><a href=\"http://zurb.com\">Sub-item 1</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                          </li>\n");
      out.write("                          <li><a href=\"#\">Sub-item 2</a></li>\n");
      out.write("                          <li><a href=\"#\">Sub-item 3</a></li>\n");
      out.write("                          <li class=\"divider\"></li>\n");
      out.write("                          <li><a href=\"#\">Sub-item 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li><a href=\"#\">Sub-item 2</a></li>\n");
      out.write("                      <li><a href=\"#\">Sub-item 3</a></li>\n");
      out.write("                      <li><a href=\"#\">Sub-item 4</a>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\">Sub-item 5</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"divider\"></li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Right Nav Section -->\n");
      out.write("            <ul class=\"right\">\n");
      out.write("              <li class=\"divider hide-for-small\"></li>\n");
      out.write("              <li><a href=\"#\">Item 2</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </section>\n");
      out.write("        </nav>\n");
      out.write("\t            </div>\n");
      out.write("\t            <div class=\"large-12 columns\">\n");
      out.write("\t\t\t\t\t<ul class=\"button-group right\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"class=\"button tiny\">Botoncitos</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"class=\"button tiny\">Botoncitos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\t\t            \t\n");
      out.write("\t            </div>    \n");
      out.write("            </div> \n");
      out.write("            <hr/>   \n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Contenido -->\n");
      out.write("\t\t\t<div class=\"large-3 columns\">\n");
      out.write("\t\t\t\t<!-- Menu desplegable-->\n");
      out.write("\t\t\t\t<div class=\"float-left\">\n");
      out.write("\t\t\t\t\t<div class=\"docs section-container accordion\"\n");
      out.write("\t\t\t\t\tdata-section=\"accordion\" data-option=\"one_up:false\">\n");
      out.write("\t\t\t\t\t<section class=\"section active\">\n");
      out.write("\t\t\t\t\t\t<p class=\"title\"><a href=\"#\">Productos</a></p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"side-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:Enviar('Categorias.jsp','contenedor')\">Categorías</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"javascript:Enviar('Marcas.jsp','contenedor')\">Marcas</a></li>\n");
      out.write("                                                                        <li><a href=\"javascript:Enviar('Tipo.jsp','contenedor')\">Tipo</a></li>\n");
      out.write("                                                                        <li><a href=\"javascript:Enviar('Proveedores.jsp','contenedor')\">Proveedores</a></li>\n");
      out.write("                                                                        <li><a href=\"javascript:Enviar('Productos.jsp','contenedor')\">Productos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t<section class=\"section\">\n");
      out.write("\t\t\t\t\t\t<p class=\"title\"><a href=\"#\">Utilidades</a></p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"side-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Cerrar Sesión</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Cambiar Password</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</section>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <div class=\"large-9 columns\" id=\"contenedor\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<!-- Pie de Página -->\n");
      out.write("\t\t\t<dl class=\"sub-nav right\">\n");
      out.write("\t\t\t  <dt>Opciones:</dt>\n");
      out.write("\t\t\t  <dd class=\"active\"><a href=\"#\">Index</a></dd>\n");
      out.write("\t\t\t  <dd><a href=\"#\">Nuevo</a></dd>\n");
      out.write("\t\t\t  <dd><a href=\"#\">OP1</a></dd>\n");
      out.write("\t\t\t  <dd><a href=\"#\">OP2</a></dd>\n");
      out.write("\t\t\t</dl>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- Script -->\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("      document.write('<script src=' +\n");
      out.write("      ('__proto__' in {} ? '../../../js/vendor/zepto' : '../../../js/vendor/jquery') +\n");
      out.write("      '.js><\\/script>')\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  <script src=\"../../../js/foundation.min.js\"></script>\n");
      out.write("   \n");
      out.write("  <script>\n");
      out.write("      $(document).foundation();\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
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
