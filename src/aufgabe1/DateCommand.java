package aufgabe1;

import java.time.ZonedDateTime;

public class DateCommand implements Runnable {

    @Override
    public void run() {
        while(true) {
            System.out.println(ZonedDateTime.now());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
