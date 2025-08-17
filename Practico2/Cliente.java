
/**
 *  En la clase Cliente, el método 
 *  agregaSaldo(p_importe)  agrega  p_importe  al 
 *  saldo actual (lo actualiza) y devuelve el nuevo 
 *  saldo. El método nuevoSaldo(p_importe) 
 *  reemplaza  el  saldo  actual  por  p_importe  y 
 *  devuelve el nuevo saldo. La salida impresa del 
 *  método  mostrar()  debe  ser  la  siguiente:  (los 
 *  valores en negrita dependen del estado del 
 *  objeto) 
 *
 *  - Cliente - 
 *  Nombre y Apellido: Juan Perez (24444333) 
 *  Saldo: $200.00
 */
public class Cliente
{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    Cliente(int p_dni, String p_apellido, String p_nombre, double p_saldo)
    {
        setNroDNI(p_dni);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSaldo(p_saldo);
    }

    /* 
     * setNroDNI updates the DNI number
     * 
     * @param p_dni the new DNI number
     */
    public void setNroDNI(int p_dni)
    {
        this.nroDNI = p_dni;
    }

    public int getNroDNI()
    {
        return this.nroDNI;
    }

    /* 
     * setApellido updates the last name
     * 
     * @param p_apellido the new last name
     */
    public void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    /* 
     * setNombre updates the first name
     * 
     * @param p_nombre the new first name
     */
    public void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    /* 
     * setSaldo updates the balance
     * 
     * @param p_saldo the new balance
     */
    public void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    /* 
     * this function replaces the current balance with p_importe
     * 
     * @param p_importe the new balance
     * @return the updated balance
     */
    public double nuevoSaldo(double p_importe)
    {
        setSaldo(p_importe);
        return getSaldo();
    }

    /* 
     * this function adds p_importe to the current balance
     * 
     * @param p_importe the amount to add
     * @return the updated balance
     */
    public double agregaSaldo(double p_importe)
    {
        setSaldo(getSaldo() + p_importe);
        return getSaldo();
    }

    public String apeYnom()
    {
        return getApellido() + " " + getNombre();
    }

    public String nomYape()
    {
        return getNombre() + " " + getApellido();
    }

    public void mostrar()
    {
        System.out.println("- Cliente -");
        System.out.println("Nombre y Apellido: " + apeYnom() + "(" + getNroDNI() + ")");
        System.out.println("Saldo: $" + String.format("%.2f", getSaldo()));
    }
}