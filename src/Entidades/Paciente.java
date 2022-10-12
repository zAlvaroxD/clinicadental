
package Entidades;

import java.util.GregorianCalendar;


//Clase paciente(HIJA PERSONA)
//Relacion generalizacion
public class Paciente extends Persona{
    private HistoriaClinica histClinica;

    public Paciente() {
        super("", "", "", null, "", "");
        this.histClinica =new HistoriaClinica();
    }

    public Paciente(String cedula, String nombre, String apellido, GregorianCalendar fechanacimiento, String sexo, String grupo_sanguineo) {
        super(cedula, nombre, apellido, fechanacimiento, sexo, grupo_sanguineo);
        this.histClinica =new HistoriaClinica();
    }
    
    

    public HistoriaClinica getHistClinica() {
        return histClinica;
    }

    public void setHistClinica(HistoriaClinica histClinica) {
        this.histClinica = histClinica;
    }

        

   
    @Override
    public String toString() {
        return "Paciente: " + super.toString()+
               "historia: " +getHistClinica().toString()+ 
               "\nsexo: " +getSexo() +
               "\ngrupo sanguineo: " +getGrupo_sanguineo();
               
    }
    
    
}
