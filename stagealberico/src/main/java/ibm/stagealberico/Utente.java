package ibm.stagealberico;


public class Utente {
	private String nomeUtente;
	private String password;
	

	public Utente(String nomeUtente, String password) {
		super();
		this.nomeUtente = nomeUtente;
		this.password = password;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
}
