import java.util.ArrayList;

public class classifica 
{
    static ArrayList<persona> parziale = new ArrayList<>(); 

    public classifica()
    {

    }

    public void aggiungiRisultato(persona x)
    {
        for(int i=0; i<parziale.size(); i++)
        {
            if (parziale.get(i).tempo>x.tempo) 
            {
                parziale.add(i, x);
            }
        }
    }

    public persona getI(int i)
    {
        return parziale.get(i);
    }

    public int getSize()
    {
        return parziale.size();
    }
}
