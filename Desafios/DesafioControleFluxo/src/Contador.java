import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        try {
            contar(n1, n2);
        } catch (IllegalArgumentException err) {
            System.out.println("O primeiro número não pode ser maior que o segundo.");
        }
    }

    public static void contar(int n1, int n2) {
        if (n1 > n2) {
            throw new IllegalArgumentException("O primeiro número não pode ser maior que o segundo.");
        }

        int contador = n1;
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= n2);
    }
}
