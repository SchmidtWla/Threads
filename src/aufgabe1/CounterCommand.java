package aufgabe1;

public class CounterCommand extends Thread {
    int counter = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println(counter++);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
