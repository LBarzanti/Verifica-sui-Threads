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

    public void stampaRisultati()
    {
        for (int index = 0; index < parziale.size(); index++) 
        {
            System.out.println(parziale.get(index).nome + " ha finito la gara in:" + parziale.get(index).tempo + "millisecondi");
        }
    }

   
}
