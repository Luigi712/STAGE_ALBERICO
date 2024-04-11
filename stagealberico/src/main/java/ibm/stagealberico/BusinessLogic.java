package ibm.stagealberico;

import java.util.Scanner;

public class BusinessLogic {

	public static Utente registraUtente(String nome, String cognome) {
		Utente u1 = new Utente(nome,cognome);
		return u1;
	}
	
	
	public static void modListaUtente(Squadra squadraUtente, Squadra elenco) {
		boolean running = true;
	    while(running) {
	    	try {
	    		
	    		System.out.println("La tua squadra è la seguente: ");
		        squadraUtente.stampaSquadra();
	    		
	        	System.out.println("digita 1 per aggiungere artisti alla tua squadra - 2 per eliminarli - 3 per uscire");
	        	int scelta = App.sc.nextInt();
		        if(scelta==1) {
		        	
		        	
		        	aggiungiArtisti(squadraUtente, elenco);
		        	}
		        	

		        else if(scelta == 2) {
		        	System.out.println("Scrivi il codice dell'artista da rimuovere: ");
		        	int membroRimosso = App.sc.nextInt();
		        	squadraUtente.rimuoviArtista(membroRimosso - 1);
		        }
		        else if(scelta == 3) {
		 	        	running = false;
		 	        }
		 	    else {
		 	        	System.out.println("L'input inserito non è valido");
		 	        }
	        }catch (IndexOutOfBoundsException e) {
	    		System.out.println("Il codice inserito non è associato a nessun artista");
	    	
	       
	        
	        
	        
	}
	
	}
	    squadraUtente.stampaSquadraClassifica();
		
	
}
	public static void aggiungiArtisti(Squadra squadraUtente, Squadra elenco) {

    	if(squadraUtente.returnSize()==6) {
    		System.out.println("Non puoi aggiungere altri artisti, la tua squadra è al completo");
    	}
    	else {
    		System.out.println("Inserisci il numero dell'artista da aggiungere");
    		int membro = App.sc.nextInt();
    		
    		if(squadraUtente.checkArtista(elenco.returnElement(membro))) {
    			System.out.println("Hai già inserito questo artista nella tua squadra");
    		}
    		else {
    		
    		squadraUtente.aggiungiArtista(elenco.returnElement(membro));
    		
    		}
    			
    	}
    }
}
