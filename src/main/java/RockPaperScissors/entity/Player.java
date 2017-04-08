package RockPaperScissors.entity;

import RockPaperScissors.enums.MATERIAL;

public class Player {

	private MATERIAL material;
	private int score = 0;
	
	public MATERIAL getMaterial() {
		return material;
	}
	
	public void win(){
		score++;
	}
	
	public void setMaterial(MATERIAL material) {
		this.material = material;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
}
