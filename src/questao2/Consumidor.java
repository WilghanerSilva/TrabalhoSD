package questao2;

public class Consumidor extends Thread {

    private Deposito deposito;
    private int intervalo;

    public Consumidor(Deposito deposito, int intervalo) {
        this.deposito  = deposito;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            deposito.retirar();
            try {
                Thread.sleep(intervalo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumidor terminou de consumir.");
    }
}