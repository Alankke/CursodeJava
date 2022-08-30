package TP11;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    //Constructor
    public CuentaCorriente (String nombreTit, double saldo){
        this.numeroCuenta = 1;
        this.nombreTitular = nombreTit;
        this.saldo = saldo;
    }


    //Getters y Setters
    public void setIngreso (double saldo){
        this.saldo += saldo;
    }
    public void setReintegro(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo (){
        return saldo;
    }
    public String getdatosCtaCorriente(){
        return this.nombreTitular;
    }
    public void transferencia(CuentaCorriente cuenta, double monto){
        cuenta.saldo += monto;
        this.saldo -= monto;
    }
    @Override
    public String toString(){
        return " saldo: " + saldo + " nombreTitular: " + nombreTitular;
    }
}
