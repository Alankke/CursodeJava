package TP10;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Ian", 8000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Alan", 5000);

        System.out.println("Estado de la cuenta 1 es: " + Cuenta1);
        System.out.println("Estado de la cuenta 2 es: " + Cuenta2);
        System.out.println("Transferiremos 1000 desde la cuenta 2 a la 1");
        Cuenta2.transferencia(Cuenta1, 1000);
        System.out.println("Transfeririendo..:");

        System.out.println("Estado actualizado de cuenta 1: " + Cuenta1);
        System.out.println("Estado actualizado de cuenta 2: " + Cuenta2);
    }
}
