package TP06;
import java.util.Scanner;

public class UsandolaAPIconMathTP06 {
    public static void main(String[] args) {
        //Trigonometricas
        double numero;
        System.out.println("Ingrese un numero decimal (con coma)");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextDouble();
        System.out.println("El seno del numero es: " + Math.sin(numero));
        System.out.println("El coseno del numero es: " + Math.cos(numero));
        System.out.println("La tangente del numero es: " + Math.tan(numero));
        System.out.println("El numero con atan es: " + Math.atan(numero));
        System.out.println("El numero con atan2 es: " + Math.atan2(numero,numero));

        //Exponenciales e inversa
        System.out.println("La funcion exponencial del numero es: " + Math.exp(numero));
        System.out.println("El numero con logaritmo es: " + Math.log(numero));



        //Constantes
        System.out.println("Numero E: " + Math.E);
        System.out.println("Numero Pi: " + Math.PI);

    }
}
