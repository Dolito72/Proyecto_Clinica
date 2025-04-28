
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Odontologo;


@WebServlet(name = "SVOdontologos", urlPatterns = {"/SVOdontologos"})
public class SVOdontologos extends HttpServlet {
      Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Odontologo> listaOdontologos = new ArrayList<Odontologo>();
        listaOdontologos = (List<Odontologo>) control.getOdontologos();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaOdontologos", listaOdontologos);
       
        
        response.sendRedirect("verOdontologos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    // Datos que vienen del formulario
    String dni = request.getParameter("dni");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String telefono = request.getParameter("telefono");
    String direccion = request.getParameter("direccion");
    String fechaStr = request.getParameter("fecha");
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    Date fecha = null;
          try {
              fecha = formato.parse(fechaStr);
          } catch (ParseException ex) {
              Logger.getLogger(SVOdontologos.class.getName()).log(Level.SEVERE, null, ex);
          }

    String especialidad = request.getParameter("especialidad");

  
    
    control.crearOdontologo(dni, nombre, apellido, telefono, direccion, fecha, especialidad);

    response.sendRedirect("index.jsp");
}
}
