
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;
import logica.Odontologo;


@WebServlet(name = "SVEditOdontologos", urlPatterns = {"/SVEditOdontologos"})
public class SVEditOdontologos extends HttpServlet {
     Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
    }

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Odontologo odonto = control.traerOdontologo(id);
        HttpSession misesion = request.getSession();
        misesion.setAttribute("odontoEditar", odonto);
       
        response.sendRedirect("editarOdontologo.jsp");
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

        Odontologo odonto = (Odontologo) request.getSession().getAttribute("odontoEditar");
        odonto.setDni(dni);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setFecha_nacimiento(fecha);
        odonto.setEspecialidad(especialidad);

        control.editarOdontologo(odonto);

        response.sendRedirect("SVOdontologos");

    }

}
