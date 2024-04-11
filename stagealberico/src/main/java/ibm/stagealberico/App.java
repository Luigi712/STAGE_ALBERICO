package ibm.stagealberico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App 
{
	public static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args )
    {
    	List<Utente> utenti = new ArrayList<>();
    	List<Squadra> squadre = new ArrayList<>();
    	boolean runningcond = true;
    	Squadra elenco = new Squadra("elenco artisti");
        Artista a1= new Artista("Adriano","Celentano","l'emozione non ha voce","Gianni Morandi",GenereMusicale.POP);
        Artista a2= new Artista("Angelina","Mango","la noia","Gianni Morandi",GenereMusicale.POP);
        Artista a3= new Artista("Francesco","Gabbani","l'emozione non ha voce","Gianni Morandi",GenereMusicale.POP);
        Artista a4= new Artista("Marco","Mengoni","la noia","Gianni Morandi",GenereMusicale.POP);
        Artista a5= new Artista("Diodato","cognome","l'emozione non ha voce","Gianni Morandi",GenereMusicale.POP);
        Artista a6= new Artista("Annalisa","cognome","la noia","Gianni Morandi",GenereMusicale.POP);
        elenco.aggiungiArtista(a1);
        elenco.aggiungiArtista(a2);
        elenco.aggiungiArtista(a3);
        elenco.aggiungiArtista(a4);
        elenco.aggiungiArtista(a5);
        elenco.aggiungiArtista(a6);
    	while(runningcond) {
	        
	        //registrazione
	        System.out.println((int) (Math.random()*100));
	        System.out.println("Inserisci il nome utente: ");
	        String nome= sc.nextLine();
	        System.out.println("Inserisci la password");
	        String pass = sc.nextLine();
	        utenti.add(BusinessLogic.registraUtente(nome, pass));
	        //Utente u1 = BusinessLogic.registraUtente(nome,pass);
	        

	        //Instanzio gli artisti 
	        
	        
	        //Stampo l'elenco degli artisti
	        System.out.println("Elenco Artisti: ");
	        elenco.printIndex();
	        
	        System.out.println("Seleziona il nome della tua squadra: ");
	        
	        Squadra squadraUtente = new Squadra(sc.nextLine());
	        BusinessLogic.modListaUtente(squadraUtente, elenco);
	        System.out.println("Digita 1 per uscire, 2 per inserire un altro utente");
	        int cond2= sc.nextInt();
	        if(cond2==1) {
	        	runningcond=false;
	        }
	        sc.nextLine();
	        squadre.add(squadraUtente);
	            
    }
    	sc.close();
    	System.out.println();
    	System.out.println();
    	System.out.println("RISULTATI FINALI");
    	for(int i=0;i<utenti.size();i++) {
    		
    		System.out.println("Giocatore: " + utenti.get(i).getNomeUtente());
    		System.out.println("Nome Squadra Giocatore: " + squadre.get(i).getNomeSquadra());
    		squadre.get(i).stampaSquadraClassifica();
    		int vot=squadre.get(i).calcolaVotazioneFinale();
    		System.out.println("VOTAZIONE COMPLESSIVA: " + vot);
    			
    		}
    	}
    
}


