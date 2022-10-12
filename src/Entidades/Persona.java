
package Entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

//Clase abstracta persona(PADRE)
public abstract class Persona {
    private String cedula,nombre,apellido,sexo,grupo_sanguineo;
    private GregorianCalendar fechanacimiento;
    
    public Persona() {
        cedula="";
        nombre="";
        apellido="";
        fechanacimiento=new GregorianCalendar();
    }

    public Persona(String cedula, String nombre, String apellido, GregorianCalendar fechanacimiento, String sexo, String grupo_sanguineo) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
        setFechanacimiento(fechanacimiento);
        setSexo(sexo);
        setGrupo_sanguineo(grupo_sanguineo);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if(validadorDeCedula(cedula)){
            this.cedula = cedula; 
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(GregorianCalendar fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    
   
    public int edad(){
        GregorianCalendar gc=new GregorianCalendar();
        int diaA = gc.get(Calendar.DAY_OF_MONTH);
        int mesA = gc.get(Calendar.MONTH)+1;
        int annoA = gc.get(Calendar.YEAR);
        if(diaA<fechanacimiento.get(Calendar.DAY_OF_MONTH)){
            mesA--;
        }
        if(mesA<fechanacimiento.get(Calendar.MONTH)+1){
            annoA--;
        }
        return (annoA-fechanacimiento.get(Calendar.YEAR));
    }
   public boolean validadorDeCedula(String cedula) {
boolean cedulaCorrecta = false;
 
try {
 
if (cedula.length() == 10) // ConstantesApp.LongitudCedula
{
int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
 int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
 int verificador = Integer.parseInt(cedula.substring(9,10));
 int suma = 0;
 int digito = 0;
for (int i = 0; i < (cedula.length() - 1); i++) {
 digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
 suma += ((digito % 10) + (digito / 10));
}
 
if ((suma % 10 == 0) && (suma % 10 == verificador)) {
 cedulaCorrecta = true;
}
else if ((10 - (suma % 10)) == verificador) {
 cedulaCorrecta = true;
} else {
 cedulaCorrecta = false;
}
} else {
cedulaCorrecta = false;
}
} else {
cedulaCorrecta = false;
}
} catch (NumberFormatException nfe) {
cedulaCorrecta = false;
} catch (Exception err) {
System.out.println("Una excepcion ocurrio en el proceso de validadcion");
cedulaCorrecta = false;
}
 
if (!cedulaCorrecta) {
System.out.println("La Cédula ingresada es Incorrecta");
}
return cedulaCorrecta;
}

    @Override
    public String toString() {
        return "\ncedula: " +getCedula() +
               "\nnombre: " +getNombre() +
               "\napellido: " +getApellido() +
               "\nfecha de nacimiento: " +getFechanacimiento().get(Calendar.DAY_OF_MONTH)+"/"+getFechanacimiento().get(Calendar.MONTH)+"/"+getFechanacimiento().get(Calendar.YEAR)+
               "\nSexo: "+ getSexo()+
               "\ntipo de sangre: "+getGrupo_sanguineo();
    }
    
    
    
}
