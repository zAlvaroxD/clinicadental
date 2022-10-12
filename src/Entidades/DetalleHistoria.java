package Entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DetalleHistoria {
    GregorianCalendar fecha;
    String observacion;
    Medico med;
    
    public DetalleHistoria() {
        this.fecha=new GregorianCalendar();
        this.med=new Medico();
        this.observacion="";
    }

    public DetalleHistoria(GregorianCalendar fecha, String observacion, Medico med) {
        this.fecha = fecha;
        this.observacion = observacion;
        this.med = med;
    }

    
     public GregorianCalendar getFecha() {
        return fecha;
    }
    

    public String getFechaString() {
        return fecha.get(Calendar.DAY_OF_MONTH)+"/"+fecha.get(Calendar.MONTH)+1+"/"+fecha.get(Calendar.YEAR);
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Medico getListMed() {
        return med;
    }

    public void setListMed(Medico med) {
        this.med = med;
    }

    @Override
    public String toString() {
        return "\nDetalleHistoria" + 
               "\nfecha:" + fecha.get(Calendar.DAY_OF_MONTH+1)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR) + 
               "\nobservacion=" + observacion + 
               "\nlistMed" + med.toString();
    }
    
    
    
}
