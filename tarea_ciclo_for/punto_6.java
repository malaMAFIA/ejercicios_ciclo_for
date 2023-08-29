
import java.util.Scanner;

public class  punto_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumeros = 10;
        int[] numeros = new int[totalNumeros];
        
        System.out.println("Ingrese " + totalNumeros + " números:");

        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números ingresados en el orden especificado:");

        for (int i = 0; i < totalNumeros / 2; i++) {
            System.out.println(numeros[i] + "-" + numeros[totalNumeros - 1 - i]);
        }

        if (totalNumeros % 2 != 0) {
            System.out.println(numeros[totalNumeros / 2]);
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
