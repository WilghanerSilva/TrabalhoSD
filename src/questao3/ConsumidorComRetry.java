package questao3;

public class ConsumidorComRetry extends Thread {

    private questao3.Deposito deposito;
    private int intervalo;

    public ConsumidorComRetry(questao3.Deposito deposito, int intervalo) {
        this.deposito  = deposito;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        int consumidos = 0;
        while (consumidos < 20) {
            boolean sucesso = deposito.retirar();
            if (sucesso) {
                consumidos++;
                try {
                    Thread.sleep(intervalo);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Depósito vazio. Aguardando 200ms...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("Consumidor terminou de consumir.");
    }
}