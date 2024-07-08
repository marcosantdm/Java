public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int salarioMinimo = 2500;

        short numeroCurto = 1;
        long numeroLongo = numeroCurto;
        short numeroCurto2 = (short) numeroLongo;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Constantes devem ser escritas em caixa alta
    }
}
