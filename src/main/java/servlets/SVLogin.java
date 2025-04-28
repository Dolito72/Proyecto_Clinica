
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;

@WebServlet(name = "SVLogin", urlPatterns = {"/SVLogin"})
public class SVLogin extends HttpServlet {
    Controladora control = new Controladora();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        
        boolean validacion = false;
        validacion = control.comprobarIngreso(usuario, contrasenia);
        
        if (validacion == true){
            HttpSession misesion = request.getSession(true);
            misesion.setAttribute("usuario", usuario);
            response.sendRedirect("index.jsp");
            
        }
        else{
            response.sendRedirect("loguinError.jsp");
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
