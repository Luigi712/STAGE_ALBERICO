package ibm.stagealberico;

import ibm.stagealberico.Utente;

public class BusinessLogic {

	public static Utente registraUtente(String nome, String cognome) {
		Utente u1 = new Utente(nome,cognome);
		return u1;
	}
	
	
}
