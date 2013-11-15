
package Servlet;

import Controlador.control_personas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Datos extends HttpServlet {

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
            //crear objeto a control personas
            control_personas per=new control_personas();
            
        int op=Integer.parseInt(
                request.getParameter("op"));    
        if(op==1){
        //Variables para recibir datos desde el cliente
            String v1=request.getParameter("v1");
            String v2=request.getParameter("v2");
            per.setRut(v1);
            per.setPassword(v2);
            per.verificar();
            switch (per.getPf_nombre()) {
                case "":
                    response.sendRedirect("Vistas/Login.jsp?error=Usuario o Password Incorrecto");
                    break;
                case "Administrador":
                    response.sendRedirect("Vistas/Administrador/Cuentas/Administrador.jsp");
                    break;
                case "Humano":
                    response.sendRedirect("Vistas/Usuarios/Usuarios.jsp");
                    break;
                default:
                    response.sendRedirect("Vistas/Errores/Error.jsp");
                    break;
            }
        }//fin op=1
        else if(op==2){
            per.setRut(request.getParameter("rut"));
            per.buscar_personas();
            out.println(per.getNombres());
        }
        else if(op==3){
            per.setRut(request.getParameter("rut"));
            per.eliminar_personas();
            out.println("<font size=16 color=red>Dato Eliminado</font>");
        }else if(op==4){//Agregar
            per.setRut(request.getParameter("v1"));
            per.setPassword(request.getParameter("v2"));
            per.setNombres(request.getParameter("v4"));
            per.setApellidos(request.getParameter("v5"));
            per.setPf_codigo(2);
            per.insertar_personas();
        }
        else{out.println("En Construcción");}
        } catch (Exception ex) {
            Logger.getLogger(Servlet_Datos.class.getName()).log(Level.SEVERE, null, ex);
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
