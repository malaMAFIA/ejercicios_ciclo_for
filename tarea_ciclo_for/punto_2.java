import java.util.Scanner;

public class punto_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 10;
        int suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los 10 números es: " + suma);
        scanner.close();
    }
}