
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        setLu(p_lu);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setNota1(0);
        setNota2(0);
    }

    public void setLu(int p_lu)
    {
        this.lu = p_lu;
    }

    public int getLu()
    {
        return this.lu;
    }

    public void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setNota1(double p_nota1)
    {
        this.nota1 = p_nota1;
    }

    public double getNota1()
    {
        return this.nota1;
    }

    public void setNota2(double p_nota2)
    {
        this.nota2 = p_nota2;
    }

    public double getNota2()
    {
        return this.nota2;
    }

    public double promedio()
    {
        return (getNota1() + getNota2()) / 2;
    }

    private boolean aprueba()
    {
        if (promedio() >= 7.0 && getNota1() >= 6.0 && getNota2() >= 6.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private String leyendaAprueba()
    {
        if (aprueba() == true) {
            return "APROBADO";
        }
        else
        {
            return "DESAPROBADO";
        }
    }

    public String nomYApe()
    {
        return getNombre() + " " + getApellido();
    }

    public String apeYNom()
    {
        return getApellido() + " " + getNombre();
    }

    public void mostrar()
    {
        System.out.println("Nombre Y Apellido: " + nomYApe());
        System.out.println("LU: " + getLu() + "     " + "Notas: " + getNota1() + " - " + getNota2());
        System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
    }
}