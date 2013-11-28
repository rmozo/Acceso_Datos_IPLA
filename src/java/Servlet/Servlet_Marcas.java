/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.control_marcas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 */
public class Servlet_Marcas extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //Instancia a control_marcas
            control_marcas marca=new control_marcas();
            int id=Integer.parseInt(request.getParameter("id"));
            if(id==1){
                String v1=request.getParameter("v1");
                marca.setMar_nombre(v1);
                marca.agregar();
                response.sendRedirect("Vistas/Administrador/Productos/Administracion.jsp");
          //      out.println("<meta http-equiv='refresh' content='2;url=Vistas/Administrador/Productos/Administracion.jsp'/>");
          //      out.println("<div class='panel' align='center'><h2>Datos Almacenados</h2></div>");
            }
            else if(id==3){//buscar
                int cod=Integer.parseInt(request.getParameter("cat_codigo"));
                out.print(marca.buscar_marcas(cod));
                out.print("<form method=post action=Servlet_Marcas?id=5>");
                    out.print("<table>");
                        out.print("<tr>");
                            out.print("<td>Codigo</td>");
                            out.print("<td><input type=text name=v1 value="+cod+" readonly/></td>");
                        out.print("</tr>");
                        out.print("<tr>");
                            out.print("<td>Nombre</td>");
                            out.print("<td><input type=text name=v2 value='"+marca.buscar_marcas(cod)+"'></td>");
                        out.print("</tr>");
                        out.print("<tr>");
                            out.print("<td><input type=submit value=Editar></td>");
                        out.print("</tr>");
                    out.print("</table>");
                out.print("</form>");
            }
            else if(id==4){
                int v1=Integer.parseInt(request.getParameter("mar_codigo"));
                marca.setMar_codigo(v1);
                marca.eliminar();
                out.println("<meta http-equiv='refresh' content='2;url=Vistas/Administrador/Productos/Administracion.jsp'/>");
                out.println("<div class='panel' align='center'><h2>Datos Eliminados</h2></div>");
            }
            else if(id==5){//Editar
                String v1=request.getParameter("v1");
                String v2=request.getParameter("v2");
                marca.editar_marcas(v1,v2);
                out.println("<meta http-equiv='refresh' content='2;url=Vistas/Administrador/Productos/Administracion.jsp'/>");
                out.println("<div class='panel' align='center'><h2>Datos Modificados</h2></div>");
            }
        } catch (Exception ex) {
            Logger.getLogger(Servlet_Marcas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
