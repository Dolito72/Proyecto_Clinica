
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretaria extends Persona{
 /*   int id_secretario;*/
    private String sector;
    @OneToOne
    private Usuario unUsuario;
    
    public Secretaria(){
        
    }

    public Secretaria(String sector, Usuario unUsuario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    

   /* public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
    }*/

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

   
    
}
