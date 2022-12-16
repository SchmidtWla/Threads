package aufgabe2;

public class App {
    
    public static void main(String[] args) {
        Konto konto = new Konto(100);
        Thread person1 = new Thread(konto);
        Thread person2 = new Thread(konto);
        person1.start();
        person2.start();
    } 
}
