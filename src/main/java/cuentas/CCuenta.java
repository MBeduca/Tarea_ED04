package cuentas;


public class CCuenta {
    

    public String nombre;
    public String cuenta;
    public double saldo;
    public double tipoInterés;

    /**
     * Contructor de la clase sin parametros
     * 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase
     * 
     * @param nom nombre de la persona
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el estado de la cuenta
     * 
     * @return double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa saldo en la cuenta
     * 
     * @param cantidad double
     * @throws Exception Mensaje si cantidad menor a 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira saldo de la cuenta
     * 
     * @param cantidad double
     * @throws Exception  Mensaje si cantidad  menor o igual 0 o si estado menor a 0
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

   /**
     * Devuelve el nombre
     * 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre
     * 
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el numero de cuenta
     * 
     * @return String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Actualiza el numero de cuenta
     * 
     * @param cuenta String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo
     * 
     * @return Double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza el saldo
     * 
     * @param saldo Double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interes
     * 
     * @return Double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Actualiza el tipo de interes
     * 
     * @param tipoInterés Double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
