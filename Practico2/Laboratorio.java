
/**
 * 
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * 
    */
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMinima(p_compraMinima);
        setDiaEntrega(p_diaEntrega);
    }

    /**
     * 
    */
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
    }

    /**
     * 
    */
    public void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    /**
     * 
    */
    public void setDomicilio(String p_domicilio)
    {
        this.domicilio = p_domicilio;
    }

    /**
     * 
    */
    public void setTelefono(String p_telefono)
    {
        this.telefono = p_telefono;
    }

    /**
     * 
    */
    public void setCompraMinima(int p_compraMinima)
    {
        this.compraMinima = p_compraMinima;
    }

    /**
     * 
    */
    public void setDiaEntrega(int p_diaEntrega)
    {
        this.diaEntrega = p_diaEntrega;
    }

    /**
     * 
    */
    public String getNombre()
    {
        return this.nombre;
    }

    /**
     * 
    */
    public String getDomicilio()
    {
        return this.domicilio;
    }

    /**
     * 
    */
    public String getTelefono()
    {
        return this.telefono;
    }

    /**
     * 
    */
    public int getCompraMinima()
    {
        return this.compraMinima;
    }

    /**
     * 
    */
    public int getDiaEntrega()
    {
        return this.diaEntrega;
    }

    /**
     * 
    */
    public void nuevaCompraMinima(int p_compraMinima)
    {
        setCompraMinima(p_compraMinima);
    }

    /**
     * 
    */
    public void nuevoDiaEntrega(int p_diaEntrega)
    {
        setDiaEntrega(p_diaEntrega);
    }

    public void mostrar()
    {
        System.out.println("Laboratorio: " + getNombre());
        System.out.println("Domicilio: " + getDomicilio() + "  -  " + "Teléfono: " + getTelefono());
    }
}