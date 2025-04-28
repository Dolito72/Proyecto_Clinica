package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Horario;
import logica.Turno;
import logica.Usuario;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-04-27T16:57:46")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Horario> horario;
    public static volatile ListAttribute<Odontologo, Turno> turnos;
    public static volatile SingularAttribute<Odontologo, Usuario> unUsario;
    public static volatile SingularAttribute<Odontologo, String> especialidad;

}