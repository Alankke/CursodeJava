package TP10;
import java.util.Scanner;
public class AdivinandoelNumeroTP10 {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 100 +1);
        Scanner leer = new Scanner(System.in);
        int elegido = -1;
        int intentos = 0;
        do {
            System.out.println("Ingrese un numero entre 1 y 100");
            elegido = leer.nextInt();
            if(elegido>aleatorio){
                System.out.println("El numero a adivinar es menor");
                intentos = intentos + 1;
            } else if (elegido<aleatorio) {
                System.out.println("El numero a adivinar es mayor");
                intentos = intentos + 1;
            }else {
                System.out.println("¡Correcto!");
                intentos = intentos + 1;
                System.out.println("Cantidad de intentos utilizados: " + intentos);
            }
        }while(elegido != aleatorio);
    }
}


