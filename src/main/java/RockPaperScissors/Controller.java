package RockPaperScissors;

import java.util.Scanner;

import RockPaperScissors.entity.Player;
import RockPaperScissors.enums.INPUT;
import RockPaperScissors.enums.MATERIAL;

public class Controller {

	private static int round = 0;
	private static int tie = 0;
	
	public static void manageGame() {
		
		getInputFromUser(INPUT.ROUND);
		
		if(round <= 0){
			throw new RuntimeException("Round input must be a positive number. ");
		}
		
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.setMaterial(MATERIAL.PAPER);
		
		while (round > 0) {
			
			String choiceOfPlayerB = getInputFromUser(INPUT.MATERIAL_TYPE);
			playerB.setMaterial(MATERIAL.fromCode(choiceOfPlayerB));
			playOneRound(playerA, playerB);
			
		}
		
		printResult(playerA, playerB);
	}
	
	public static void printResult(Player playerA, Player playerB){
		System.out.println("Player A wins: " + playerA.getScore() + " rounds");
		System.out.println("Player B wins: " + playerB.getScore() + " rounds");
		System.out.println("Tie: " + tie);
	}
	
	public static void playOneRound(Player playerA, Player playerB) {
		
		String winner = null;
		if (playerA.getMaterial().isBeats(playerB.getMaterial())) {
			playerA.win();
			winner = "Player A";
		} else if (playerB.getMaterial().isBeats(playerA.getMaterial())) {
			playerB.win();
			winner = "Player B";
		} else {
			winner = "Noone";
			tie++;
		}

		System.out.println(winner + " wins! " + playerA.getScore() + " " + playerB.getScore());
		round--;
	}
	
	public static String getInputFromUser(INPUT input){
		Scanner s = new Scanner(System.in);
		if(input.equals(INPUT.ROUND)){
			System.out.println("Please enter how many rounds you want to play: ");
			setRound(s.nextInt());
		} else if(input.equals(INPUT.MATERIAL_TYPE)){
			System.out.println("Please enter p for Paper, s for Scissors, r for Rock: ");
			String choiceOfPlayerB = s.nextLine();
			if(getRound() == 1){
				s.close();
			}
			return choiceOfPlayerB;
		}
		return "";
	}

	public static int getRound() {
		return round;
	}

	public static void setRound(int round) {
		Controller.round = round;
	}
	
	
	
}
