package ibm.stagealberico;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
	private String nomeSquadra;
	private List<Artista> squadra;
	
	public Squadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
		this.squadra = new ArrayList<Artista>();
	}
	
	public void aggiungiArtista(Artista a1) {
		squadra.add(a1);
	}
	
	public void rimuoviArtista(int index){
		squadra.remove(index);
	}
	
	public void stampaSquadra() {
		int index= 1;
		for(Artista a1 : squadra) {
			System.out.println(index++ + " " + a1.getNome() +" " + a1.getCognome());
		}
	}
	
	public void stampaSquadraClassifica() {
		for(Artista a1 : squadra) {
			System.out.println(a1.getNome() +" " + a1.getCognome() + " . Votazione finale: " + a1.getScore());
		}
	}
	
	public int calcolaVotazioneFinale() {
		int vot=0;
		for (Artista a1 : squadra) {
			vot += a1.getScore();
		}
		return vot;
	}
	
	public List<Artista> getArtisti(){
		return squadra;
	}
	
	public Artista returnElement(int index) {
		return squadra.get(index);
	}
	
	public int returnSize() {
		return squadra.size();
	}
	public  void printIndex() {
		int index = 1;
		for (Artista a1 : squadra) {
			System.out.println(index++ + " " + a1.getNome() + " " + a1.getCognome());
		}
	}
	public boolean checkArtista(Artista a1) {
		if(squadra.contains(a1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getNomeSquadra() {
		return nomeSquadra;
	}
	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}
}
