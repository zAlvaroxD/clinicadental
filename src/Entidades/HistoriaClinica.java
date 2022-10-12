    
package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HistoriaClinica {
    
    private GregorianCalendar fecha_apertura;
    private ArrayList<DetalleHistoria> listHistoria;
    
    public HistoriaClinica() {
        
        this.fecha_apertura=new GregorianCalendar();
        this.listHistoria=new ArrayList<>();
        
    }

    public HistoriaClinica(GregorianCalendar fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
        this.listHistoria=new ArrayList<>();
    }

    public ArrayList<DetalleHistoria> getDetalleHistoria() {
        return listHistoria;
    }

  /*  public void setDetalleHistoria(ArrayList<DetalleHistoria> detalleHistoria) {
        this.listHistoria = detalleHistoria;
    }*/
    
    public void setDetalleHistoria(DetalleHistoria detalle){
        listHistoria.add(detalle);
    }
        
    public GregorianCalendar getFecha_apertura() {
        return fecha_apertura;
    }
    public String getFechaString() {
        return fecha_apertura.get(Calendar.DAY_OF_MONTH)+"/"+fecha_apertura.get(Calendar.MONTH)+1+"/"+fecha_apertura.get(Calendar.YEAR);
    }

    public void setFecha_apertura(GregorianCalendar fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }
    
    @Override
    public String toString() {
        return "\nHistoriaClinica:" + 
               "\nfecha_apertura:" + fecha_apertura.get(Calendar.DAY_OF_MONTH+1)+"/"+fecha_apertura.get(Calendar.MONTH)+"/"+fecha_apertura.get(Calendar.YEAR) + 
               "\nlistHistoria:" + listHistoria.toString();
    }
   
}
