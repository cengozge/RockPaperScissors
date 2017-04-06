package RockPaperScissors.enums;

public enum MATERIAL {
	
	ROCK(1, "r"), 
	PAPER(2, "p"), 
	SCISSORS(3, "s"),
	TIE(4, "");

	private int id;
	private String code;

	MATERIAL(int id, String code){
		this.id = id;
		this.code = code;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static MATERIAL fromCode(String code) {
	    for (MATERIAL m : MATERIAL.values()) {
	      if (m.code.equalsIgnoreCase(code)) {
	        return m;
	      }
	    }
	    return null;
	  }
	
}
