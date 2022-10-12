package Entidades;

import java.util.GregorianCalendar;

//Hereda de Persona
public class Medico extends Persona{
    private String especialidad;
    

    public Medico() {
        super("", "", "", null,"","");
        especialidad="";
        
    }

    public Medico(String especialidad, String cedula, String nombre, String apellido, GregorianCalendar fechanacimiento, String sexo, String grupo_sanguineo) {
        super(cedula, nombre, apellido, fechanacimiento, sexo, grupo_sanguineo);
        this.especialidad = especialidad;
        
    }

   
    


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
@Override
    public String toString() {
        return "\n Medico:" + super.toString()+
                "\n Especialidad: "+getEspecialidad(); 
    }
    
    
    
}
