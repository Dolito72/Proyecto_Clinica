
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
import logica.Usuario;


@WebServlet(name = "SVEditUsuarios", urlPatterns = {"/SVEditUsuarios"})
public class SVEditUsuarios extends HttpServlet {
     Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.traerUsuario(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuEditar", usu);
       
        response.sendRedirect("editarUsuario.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String nombreusu = request.getParameter("nombreusu");
          String contrasenia = request.getParameter("contrasenia");
          String rol = request.getParameter("rol");
          Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
          usu.setNombreUsuario(nombreusu);
          usu.setContrasenia(contrasenia);
          usu.setRol(rol);
          
          control.editarUsuario(usu);
          
          response.sendRedirect("SVUsuarios");
          
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
