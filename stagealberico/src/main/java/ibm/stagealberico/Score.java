package ibm.stagealberico;

public class Score {
	private int classifica;
	private int gradimentoPubblico;
	private int voti;
	private int tot;
	
	public Score() {
		classifica = (int) (Math.random()*100);
		gradimentoPubblico = (int) (Math.random()*100);
		voti = (int) (Math.random()*100);
		tot = voti + gradimentoPubblico + classifica;
	}
	
	public int getScore() {
		return tot;
	}

}
