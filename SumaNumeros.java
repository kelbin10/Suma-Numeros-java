
import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese números para sumar. Ingrese un número negativo para finalizar.");

        // Bucle while que sigue pidiendo números hasta que el usuario ingrese un número negativo
        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sale del bucle si el usuario ingresa un número negativo
            }

            suma += numero; // Suma el número ingresado a la variable 'suma'
        }

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
