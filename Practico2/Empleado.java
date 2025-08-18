import java.util.*;

/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anioIngreso)
    {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anioIngreso);
    }

    private void setCuil(long p_cuil)
    {
        this.cuil = p_cuil;
    }

    public long getCuil()
    {
        return cuil;
    }

    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    private void setSueldoBasico(double p_importe)
    {
        this.sueldoBasico = p_importe;
    }

    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }

    private void setAnioIngreso(int p_anioIngreso)
    {
        this.anioIngreso = p_anioIngreso;
    }

    public int getAnioIngreso()
    {
        return this.anioIngreso;
    }

    public int antiguedad()
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);

        return anioHoy - getAnioIngreso();
    }

    private double descuento()
    {
        // Necesito hacer un descuento del 2% a getSueldoBasico y restar $1500 tambien
        double descuento = (getSueldoBasico() * 0.02) + 1500;
        return getSueldoBasico() - descuento; 
    }

    private double adicional()
    {
        if(antiguedad() < 2)
        {
            return getSueldoBasico() * 0.02;
        }
        else if(antiguedad() >= 2 && antiguedad() < 10)
        {
            return getSueldoBasico() * 0.04;
        }
        else
        {
            return getSueldoBasico() * 0.06;
        }
    }

    public double sueldoNeto()
    {
        return getSueldoBasico() + adicional();
    }

    public String nomYApe()
    {
        return getNombre() + " " + getApellido();
    }

    public String apeYNom()
    {
        return getApellido() + ", " + getNombre();
    }

    public void mostrar()
    {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + " " + "Antiguedad: " + antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $ " + sueldoNeto());
    }

    public String mostrarLinea()
    {
        return getCuil() + "  " + apeYNom() + "  ................  " + " $ " + sueldoNeto();
    }
}