package RockPaperScissors;

import java.util.Scanner;

import RockPaperScissors.entity.Player;
import RockPaperScissors.enums.MATERIAL;

public class Controller {
	
	
	public static void manageGame(int round){
		
		int tie = 0;
		int score = 0;
		Player playerA = new Player();
		playerA.setMaterial(MATERIAL.PAPER);
		
		Player playerB = new Player();
		
		while(round > 0){
			
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter p for Paper, s for Scissors, r for Rock: ");
			String choiceOfPlayerB = s.nextLine();
			MATERIAL materialOfB = MATERIAL.fromCode(choiceOfPlayerB);
			playerB.setMaterial(materialOfB);
			
			MATERIAL result = RulesImpl.decideWhichWin(playerA.getMaterial(), playerB.getMaterial());
			
			if(result.equals(MATERIAL.TIE)){
				RulesImpl.printOut("Noone wins! ",playerA.getScore(), playerB.getScore());
				tie += 1;
			}else if(playerA.getMaterial().equals(result)){
				score = playerA.getScore(); 
				playerA.setScore(++score);
				RulesImpl.printOut("Player A wins ",playerA.getScore(), playerB.getScore());
			}else{
				score = playerB.getScore(); 
				playerB.setScore(++score);
				RulesImpl.printOut("Player B wins ",playerA.getScore(), playerB.getScore());
			}
			round--;
		}
		System.out.println("Player A wins: " + playerA.getScore() + " rounds");
		System.out.println("Player B wins: " + playerB.getScore() + " rounds");
		System.out.println("Tie: " + tie);
		
	}
	
	

}
