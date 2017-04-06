package RockPaperScissors;

import RockPaperScissors.enums.MATERIAL;

public class RulesImpl {

	public MATERIAL decideWhichWin(MATERIAL material1, MATERIAL material2) {
		if (material1.equals(material2)) {
			return MATERIAL.TIE;
		}

		if (material1.equals(MATERIAL.SCISSORS) && material2.equals(MATERIAL.PAPER))
			return material1;
		if (material1.equals(MATERIAL.SCISSORS) && material2.equals(MATERIAL.ROCK))
			return material2;

		if (material1.equals(MATERIAL.PAPER) && material2.equals(MATERIAL.SCISSORS))
			return material2;
		if (material1.equals(MATERIAL.PAPER) && material2.equals(MATERIAL.ROCK))
			return material1;

		if (material1.equals(MATERIAL.ROCK) && material2.equals(MATERIAL.SCISSORS))
			return material1;
		if (material1.equals(MATERIAL.ROCK) && material2.equals(MATERIAL.PAPER))
			return material2;
		
		return MATERIAL.TIE;

	}

}
