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
import logica.Paciente;

/**
 *
 * @author diego
 */
@WebServlet(name = "SVPacientes", urlPatterns = {"/SVPacientes"})
public class SVPacientes extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes = (List<Paciente>) control.getPacientes();

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaPacientes", listaPacientes);

        response.sendRedirect("verPacientes.jsp");
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
        
        String tieneOSParam = request.getParameter("tieneOS");
        boolean tieneOS = (tieneOSParam != null);
        String sangre = request.getParameter("sangre");

        control.crearPaciente(dni, nombre, apellido, telefono, direccion, fecha, tieneOS, sangre);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
