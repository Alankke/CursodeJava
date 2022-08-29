package trabajospracticos;
import java.util.Scanner;

public class RaizScannerTP08 {
    public static void main(String[] args) {
        int nroIngresado;
        double resul;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        nroIngresado = leer.nextInt();
        resul = Math.sqrt(nroIngresado);
        System.out.println("La raiz del numero ingresado es :" + resul);
    }
}
