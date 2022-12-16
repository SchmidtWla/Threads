package aufgabe1;

import org.w3c.dom.css.Counter;

public class App {

    public static void main (String[] args) throws InterruptedException {
        DateCommand command = new DateCommand();
        CounterCommand command2 = new CounterCommand();

        Thread t = new Thread(command);
        t.start();
        command2.start();
        while(true) {

            System.out.println("Main Thread");
            Thread.sleep(200);
        }
    }
}
