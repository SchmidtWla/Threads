package aufgabe2;

public class Konto implements Runnable{

    int betrag;

    public Konto(int betrag) {
        this.betrag = betrag;
    }

    @Override
     synchronized public void run() {
        
        for (int i = 0; i < 10; i++) {
            if(betrag >= 10) {
                betrag -= 10;
            }
            System.out.println(betrag);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
