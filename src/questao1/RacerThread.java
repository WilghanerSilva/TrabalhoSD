package questao1;

public class RacerThread extends Thread {

    private int id;

    public RacerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            System.out.println("Racer " + id + " - imprimindo");
        }
    }
}