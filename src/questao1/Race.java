package questao1;

import java.util.ArrayList;
import java.util.List;

public class Race {

    public static void main(String[] args) throws InterruptedException {

        List<RacerThread> impares = new ArrayList<>();
        List<RacerThread> pares   = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            RacerThread racer = new RacerThread(i);
            if (i % 2 != 0) {
                impares.add(racer);
            } else {
                pares.add(racer);
            }
        }

        System.out.println("Iniciando racers ímpares...");
        for (RacerThread r : impares) {
            r.start();
        }

        for (RacerThread r : impares) {
            r.join();
        }

        System.out.println("Ímpares terminaram. Iniciando racers pares...");
        for (RacerThread r : pares) {
            r.start();
        }

        for (RacerThread r : pares) {
            r.join();
        }

        System.out.println("Todos os racers terminaram.");
    }
}