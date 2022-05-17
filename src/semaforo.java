public class semaforo 
{
    int valore;
    public semaforo(int valore)
    {
        this.valore = valore;
    }

    synchronized public void P()
    {
        while (valore==0) 
        {
            try
            {
                wait();
            }
            catch(InterruptedException e){}    
        }
        valore--;
    }

    synchronized public void V()
    {
        valore++;
        notify();
    }
}

