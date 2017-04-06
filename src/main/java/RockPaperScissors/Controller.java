package RockPaperScissors;

import java.util.Scanner;

import RockPaperScissors.entity.Player;
import RockPaperScissors.enums.MATERIAL;

public class Controller {
	
	
	public static void manageGame(int round){
		
		Player playerA = new Player();
		playerA.setMaterial(MATERIAL.PAPER);
		
		Player playerB = new Player();
		
		while(round > 0){
			
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter p for Paper, s for Scissors, r for Rock: ");
			String choiceOfPlayerB = s.nextLine();
			
			RulesImpl.decideWhichWin(playerA.getMaterial(), MATERIAL.fromCode(choiceOfPlayerB));
			
		}
		
	}
	

}
