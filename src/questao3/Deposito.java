package questao3;

import questao3.ConsumidorComRetry;
import questao3.Deposito;
import questao3.Produtor;

public class Deposito {

    private int items = 0;

    public int getNumItens() {
        return items;
    }

    public boolean retirar() {
        items = getNumItens() - 1;
        System.out.println("Consumidor retirou uma caixa. Total: " + items);
        return true;
    }

    public boolean colocar() {
        items = getNumItens() + 1;
        System.out.println("Produtor colocou uma caixa. Total: " + items);
        return true;
    }
    
    public static void main(String[] args) {
        Deposito dep = new Deposito();
        Produtor p   = new Produtor(dep, 50);

        ConsumidorComRetry c1 = new  ConsumidorComRetry(dep, 150);
        ConsumidorComRetry c2 = new ConsumidorComRetry(dep, 100);
        ConsumidorComRetry c3 = new ConsumidorComRetry(dep, 150);
        ConsumidorComRetry c4 = new ConsumidorComRetry(dep, 100);
        ConsumidorComRetry c5 = new ConsumidorComRetry(dep, 150);

        p.start();
        c1.start(); c2.start(); c3.start();
        c4.start(); c5.start();

        System.out.println("Execução do main da classe Deposito terminada.");
    }
}