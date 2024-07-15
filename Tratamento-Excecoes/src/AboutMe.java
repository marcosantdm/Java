import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Por favor, insira um número inteiro ou um número decimal.");
            return;
        }
    }
}
