
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable{
  /*  private int id_odontologo;*/
    private String especialidad;
    @OneToMany (mappedBy="odonto")
    private List<Turno> turnos;
    @OneToOne
    private Usuario unUsario;
    @OneToOne
    private Horario horario;
    
    public Odontologo(){
        
    }

    public Odontologo(String especialidad, List<Turno> turnos, Usuario unUsario, Horario horario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.unUsario = unUsario;
        this.horario = horario;
    }

    

  /*  public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;*/

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Usuario getUnUsario() {
        return unUsario;
    }

    public void setUnUsario(Usuario unUsario) {
        this.unUsario = unUsario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
    
}
