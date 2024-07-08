public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (nota >=5 && nota <= 7) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}
