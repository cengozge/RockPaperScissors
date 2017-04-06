package RockPaperScissors.enums;

public enum MATERIAL {
	
	ROCK(1), 
	PAPER(2), 
	SCISSORS(3),
	TIE(4);

	private int id;

	MATERIAL(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
