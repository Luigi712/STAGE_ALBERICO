package ibm.stagealberico;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        
        //registrazione
        System.out.println("Inserisci il nome utente: ");
        String nome= sc.nextLine();
        System.out.println("Inserisci la password");
        String pass = sc.nextLine();
        Utente u1 = BusinessLogic.registraUtente(nome,pass);
        
        
        //Instanzio gli artisti 
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
        
        //Stampo l'elenco degli artisti
        System.out.println("Elenco Artisti: ");
        elenco.printIndex();
        
        
        Squadra squadraUtente = new Squadra("nome prova");
        
        
        boolean running = true;
        while(running) {
        	try {
        		
        		System.out.println("La tua squadra è la seguente: ");
    	        squadraUtente.stampaSquadra();
        		
	        	System.out.println("digita 1 per aggiungere artisti alla tua squadra - 2 per eliminarli - 3 per uscire");
	        	int scelta = sc.nextInt();
		        if(scelta==1) {
		        	
		        	
		        	aggiungiArtisti(squadraUtente,sc, elenco);
		        	}
		        	
		        	
		        
		        
		        else if(scelta == 2) {
		        	System.out.println("Scrivi il codice dell'artista da rimuovere: ");
		        	int membroRimosso = sc.nextInt();
		        	squadraUtente.rimuoviArtista(membroRimosso);
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
    sc.close();
    
    }
    
    public static void aggiungiArtisti(Squadra squadraUtente, Scanner sc, Squadra elenco) {

    	if(squadraUtente.returnSize()==6) {
    		System.out.println("Non puoi aggiungere altri artisti, la tua squadra è al completo");
    	}
    	else {
    		System.out.println("Inserisci il numero dell'artista da aggiungere");
    		int membro = sc.nextInt();
    		
    		if(squadraUtente.checkArtista(elenco.returnElement(membro))) {
    			System.out.println("Hai già inserito questo artista nella tua squadra");
    		}
    		else {
    		
    		squadraUtente.aggiungiArtista(elenco.returnElement(membro));
    		
    		}
    			
    	}
    }
}
