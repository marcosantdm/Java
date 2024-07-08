public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A televisão está " + smartTv.ligada);
        System.out.println("O número do canal atual é " + smartTv.canal);
        System.out.println("O volume atual é " + smartTv.ligada);

        smartTv.ligar();

        smartTv.mudarCanal(12);
    }
}
