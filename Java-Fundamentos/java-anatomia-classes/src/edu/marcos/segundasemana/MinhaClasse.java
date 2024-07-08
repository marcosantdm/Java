package edu.marcos.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Marcos";
        String ultimoNome = "Claudino";

        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return "O nome completo é: " + primeiroNome.concat(" ").concat(ultimoNome);
    }
}
