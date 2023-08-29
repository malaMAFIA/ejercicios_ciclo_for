import java.util.Scanner;

public class punto_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 20;
        int pares = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }

            if (numero < 0) {
                negativos++;
            }

            if (numero == 0) {
                ceros++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
