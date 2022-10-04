package TP08;
import java.util.Scanner;

public class CalcularelpesoTP08 {
    public static void main(String[] args) {
        int cm;
        String hombre, mujer, genero;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su altura en centimetros (Si es 1,80 en metros entonces ingrese 180 en centimetros): ");
        cm = leer.nextInt();
        System.out.println("Ahora ingrese su género (hombre o mujer): ");
        leer.nextLine();
        genero = leer.nextLine();
        if (genero.equals("hombre")){
            System.out.println("Su peso ideal es: " + (cm - 110) + "kg");
        }
        else if (genero.equals("mujer")) {
            System.out.println("Su peso ideal es: " + (cm - 120) + "kg");
        }
        else {
            System.out.println("Ingresó incorrectamente su genero o centimetros");
            }
        }
    }
