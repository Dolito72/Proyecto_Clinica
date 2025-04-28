
package logica;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario (String nombreUsuario, String contrasenia, String rol){
        Usuario usu = new Usuario ();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
       return controlPersis.getUsuarios();
       
    }
     
     

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
        
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }
    
    public void crearOdontologo(String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento, String especialidad) {
    Odontologo odonto = new Odontologo();
    
    // Datos que vienen de Persona
    odonto.setDni(dni);
    odonto.setNombre(nombre);
    odonto.setApellido(apellido);
    odonto.setTelefono(telefono);
    odonto.setDireccion(direccion);
    odonto.setFecha_nacimiento(fecha_nacimiento);
    
    // Datos propios de Odontologo
    odonto.setEspecialidad("ortodoncia"); // Por ahora vacío, después lo podés actualizar
    odonto.setTurnos(null);      // Sin turnos todavía
    odonto.setUnUsario(null);    // Sin usuario asignado
    odonto.setHorario(null);     // Sin horario todavía

    controlPersis.crearOdontologo(odonto);
}
    
    public List<Odontologo> getOdontologos() {
       return controlPersis.getOdontologos();
       
    }

    public void borrarOdontologo(int id) {
        controlPersis.borrarOdontologo(id);
    }

    public Odontologo traerOdontologo(int id) {
        return controlPersis.traerOdontologo(id);
        
    }
    
    public void editarOdontologo(Odontologo odonto) {
           controlPersis.editarOdontologo(odonto);
    }
    
    
    public List<Paciente> getPacientes() {
       return controlPersis.getPacientes();
       
    }

    public void crearPaciente(String dni, String nombre, String apellido, String telefono, String direccion, Date fecha, boolean tieneOS, String sangre) {
        Paciente paciente = new Paciente();
    
    // Datos que vienen de Persona
    paciente.setDni(dni);
    paciente.setNombre(nombre);
    paciente.setApellido(apellido);
    paciente.setTelefono(telefono);
    paciente.setDireccion(direccion);
    paciente.setFecha_nacimiento(fecha);
    
    // Datos propios de Paciente
    paciente. setTiene_os(tieneOS); 
    paciente.setTipo_sangre(sangre);     
    paciente.setTurnos(null);    // Sin usuario asignado
    paciente.setUnResponsable(null);     // Sin responsable todavía

    controlPersis.crearPaciente(paciente);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = controlPersis.getUsuarios();
        for (Usuario usu: listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    ingreso = true;
                }
                else{
                    ingreso = false;
                }
            }
        }
        return ingreso;
    }
        
}
