package ibm.stagealberico;

import ibm.stagealberico.GenereMusicale;

public class Artista {
	private String nome;
	private String cognome;
	private String titoloCanzone;
	private String capitano;
	private GenereMusicale genere;
	Score sc1 = new Score();
	
	public int getScore() {
		return sc1.getScore();
	}
	
	
	public Artista(String nome, String cognome, String titoloCanzone, String capitano, GenereMusicale genere) {
		this.nome = nome;
		this.cognome = cognome;
		this.titoloCanzone = titoloCanzone;
		this.capitano = capitano;
		this.genere = genere;
		sc1 = new Score();
	}
	public GenereMusicale getGenere() {
		return genere;
	}
	public void setGenere(GenereMusicale genere) {
		this.genere = genere;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTitoloCanzone() {
		return titoloCanzone;
	}
	public void setTitoloCanzone(String titoloCanzone) {
		this.titoloCanzone = titoloCanzone;
	}
	public String getCapitano() {
		return capitano;
	}
	public void setCapitano(String capitano) {
		this.capitano = capitano;
	}
	
	

}
