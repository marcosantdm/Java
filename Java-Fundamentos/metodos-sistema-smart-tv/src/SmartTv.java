public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuído para " + volume);
    }

    public void mudarCanal(int canal) {
        if (ligada && canal >= 1 && canal <= 100) {
            this.canal = canal;
            System.out.println("Canal alterado para " + canal);
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("TV ligada!");
        } else {
            System.out.println("TV já está ligada!");
        }
    }
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada!");
        } else {
            System.out.println("TV já está desligada!");
        }
    }

}