public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);
        String concatenacao = "?";

        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // incrementação e decrementação
        int num = 5;

        for (int i = 0 ; i <= 5 ; i++) {
            num = num + 2;

            System.out.println(num);
        }

        System.out.println(++ num);
        System.out.println(num ++);
        System.out.println(num --);
        System.out.println(-- num);
    }
}
