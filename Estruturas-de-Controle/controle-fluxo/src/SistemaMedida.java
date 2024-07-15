public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "p":
                System.out.println("Pequena");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            case "GG":
                System.out.println("Extra Grande");
                break;
            default:
                System.out.println("Sigla inválida.");
        }
    }
}
