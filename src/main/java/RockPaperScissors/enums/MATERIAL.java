package RockPaperScissors.enums;

public enum MATERIAL {

	ROCK("r"), PAPER("p"), SCISSORS("s");

	private String code;

	MATERIAL(String code) {
		this.code = code;
	}

	public boolean isBeats(MATERIAL material) {
		switch (this) {
		case ROCK:
			return SCISSORS.equals(material);
		case SCISSORS:
			return PAPER.equals(material);
		case PAPER:
			return ROCK.equals(material);
		}
		return false;
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
