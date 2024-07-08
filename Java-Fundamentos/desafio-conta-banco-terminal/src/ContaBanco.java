import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco XYZ!");
        System.out.print("Entre com seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Entre com seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Numero da conta: ");
        int numeroConta = sc.nextInt();
        double saldo = 3000;

        System.out.println("Conta Criada! Os seus dados são: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
