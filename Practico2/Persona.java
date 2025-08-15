import java.util.*;

/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private int nroDNI;            ///
    private String nombre;         ///
    private String apellido;       ///
    private int anioNacimiento;    ///

    /**
     */
    Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }

    /**
     */
    private void setDNI(int p_dni)
    {
        this.nroDNI = p_dni;
    }

    /**
     */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    /**
     */
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }

    /**
     */
    private void setAnioNacimiento(int p_anio)
    {
        this.anioNacimiento = p_anio;
    }

    public int getDNI()
    {
        return this.nroDNI;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public int getAnioNacimiento()
    {
        return this.anioNacimiento;
    }

    public int edad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);      // Obtengo el año actual

        int edad = anioHoy - getAnioNacimiento();       // resta los años para obtener la edad del usuario
        return edad;
    }

    public String nomYApe()
    {
        return getNombre() + " " + getApellido();       // Concatena los datos, con doble encapsulamiento
    }

    public String apeYNom()
    {
        return getApellido() + " " + getNombre();       // Concatena los datos, con doble encapsulamiento
    }

    public void mostrar()
    {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "    " + "Edad: " + edad());
    }
}