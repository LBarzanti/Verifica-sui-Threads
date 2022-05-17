public class persona extends Thread
{
   String nome;
   semaforo s = new semaforo(2);
   long tempo;
   classifica c = new classifica();

    public persona(String nome)
    {
        this.nome=nome;
    }
    @Override
    public void run() 
    {
        System.out.println(nome + " inizia a cambiarsi");
        this.usaSpogliatoio();
        System.out.println(nome + " ha finito di cambiarsi");
        System.out.println(nome + " inizia a gareggiare");
        this.gareggia();
        System.out.println(nome + " ha finito di gareggiare");
        System.out.println(nome + " torna a cambiarsi");
        this.usaSpogliatoio();
        System.out.println(nome + " finisce di ricambiarsi");
        c.aggiungiRisultato(this);
    }
    
    public void usaSpogliatoio()
    {
        s.P();
        try{this.wait();}
        catch(InterruptedException e){}
        s.V();
    }

    public long gareggia()
    {
        long inizio = System.nanoTime();
        for (int index = 0; index < 15; index++) 
        {
            try{Thread.sleep((long) (Math.random()*1000));}
            catch(InterruptedException e){}
        }
        long fine = System.nanoTime();
        tempo=(fine-inizio)/1000000;
        return tempo;
    }
}
