public class App extends Thread
{
    public static void main(String[] args) throws Exception 
    {
        persona p1 = new persona("franco");
        persona p2 = new persona("giorgio");
        persona p3 = new persona("marco");
        persona p4 = new persona("andrea");
        persona p5 = new persona("sabrina");
        persona p6 = new persona("sofia");
        persona p7 = new persona("marta");
        persona p8 = new persona("claudia");
        classifica c = new classifica();

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        c.stampaRisultati();
    }
}
