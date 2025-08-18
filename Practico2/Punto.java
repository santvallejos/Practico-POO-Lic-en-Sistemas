
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    private double x;
    private double y;

    Punto()
    {
        setX(0);
        setY(0);
    }

    Punto(double p_x, double p_y)
    {
        setX(p_x);
        setY(p_y);
    }

    private void setX(double p_x)
    {
        this.x = p_x;
    }

    public double getX()
    {
        return this.x;
    }

    private void setY(double p_y)
    {
        this.y = p_y;
    }

    public double getY()
    {
        return this.y;
    }

    public void desplazar(double p_dx, double p_dy)
    {
        setX(getX() + p_dx);
        setY(getY() + p_dy);
    }

    public String coordenadas()
    {
        return "(" + getX() + ", " + getY() + ")";
    }

    public void mostrar()
    {
        System.out.println("Punto. " + "X: " + getX() + ", Y: " + getY());
    }
}
