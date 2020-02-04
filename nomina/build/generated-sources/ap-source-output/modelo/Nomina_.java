package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Persona;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-03T15:50:42")
@StaticMetamodel(Nomina.class)
public class Nomina_ { 

    public static volatile SingularAttribute<Nomina, Float> valorHoraTrabajo;
    public static volatile SingularAttribute<Nomina, Integer> horas_trabajadas;
    public static volatile SingularAttribute<Nomina, Integer> idNomina;
    public static volatile SingularAttribute<Nomina, Float> sueldoTotal;
    public static volatile SingularAttribute<Nomina, Float> valorMulta;
    public static volatile SingularAttribute<Nomina, Persona> idPersona;

}