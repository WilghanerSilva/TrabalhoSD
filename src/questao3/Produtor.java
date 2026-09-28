package questao3;

import questao3.Deposito;

public class Produtor extends Thread {

    private Deposito deposito;
    private int intervalo;

    public Produtor(Deposito deposito, int intervalo) {
        this.deposito  = deposito;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            deposito.colocar();
            try {
                Thread.sleep(intervalo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Produtor terminou de produzir.");
    }
}