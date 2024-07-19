package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informado o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de iteração ForEach");

        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];

            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + ", possui o Salário Pretendido de " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " foi Selecionado!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com proposta!");
        } else {
            System.out.println("Aguardar mais informações dos demais candidatos!");
        }
    }
}
