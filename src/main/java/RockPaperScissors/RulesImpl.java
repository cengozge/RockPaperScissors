package RockPaperScissors;

import RockPaperScissors.enums.MATERIAL;

public class RulesImpl {

	public static MATERIAL decideWhichWin(MATERIAL material1, MATERIAL material2) {
		if (material1.equals(material2)) {
			return MATERIAL.TIE;
		}

		return material2.equals(MATERIAL.SCISSORS) ? material2 : material1 ;

	}
	
	public static void printOut(String msg, int scoreOfPlayerA, int scoreOfPlayerB){
		System.out.println("PlayerA score: " + scoreOfPlayerA + " PlayerB score: " + scoreOfPlayerB);
	}

}
