package questao1;

public class RacerRunnable implements Runnable {

    private int id;

    public RacerRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Racer " + id + " - imprimindo");
        }
    }
}