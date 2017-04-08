package RockPaperScissors;

import java.util.Scanner;

import RockPaperScissors.entity.Player;
import RockPaperScissors.enums.MATERIAL;

public class Controller {

	private static int round = 0;
	private static int tie = 0;

	private static Player playerA = new Player();
	private static Player playerB = new Player();

	public static void manageGame() {

		getRoundFromUser();

		if (round <= 0) {
			throw new RuntimeException("Round input must be a positive number. ");
		}

		while (round > 0) {
			createPlayers();
			playOneRound(playerA, playerB);
		}

		printResult(playerA, playerB);
	}

	public static void getRoundFromUser() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter how many rounds you want to play: ");
		setRound(s.nextInt());
	}

	public static String getMaterialFromUser() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter p for Paper, s for Scissors, r for Rock: ");
		String choiceOfPlayerB = s.nextLine();
		if(round == 1){
			s.close();
		}
		return choiceOfPlayerB;
	}

	public static void createPlayers() {
		
		playerA.setMaterial(MATERIAL.PAPER);

		String choiceOfPlayerB = getMaterialFromUser();
		playerB.setMaterial(MATERIAL.fromCode(choiceOfPlayerB));
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

	public static void printResult(Player playerA, Player playerB) {
		System.out.println("Player A wins: " + playerA.getScore() + " rounds");
		System.out.println("Player B wins: " + playerB.getScore() + " rounds");
		System.out.println("Tie: " + tie);
	}

	public static int getRound() {
		return round;
	}

	public static void setRound(int round) {
		Controller.round = round;
	}

}
