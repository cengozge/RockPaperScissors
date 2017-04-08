package RockPaperScissors;

import java.util.Scanner;

import RockPaperScissors.entity.Player;
import RockPaperScissors.enums.MATERIAL;

public class Controller {

	public static void manageGame(int round) {

		int tie = 0;
		Player playerA = new Player();
		playerA.setMaterial(MATERIAL.PAPER);

		Player playerB = new Player();

		Scanner s = new Scanner(System.in);
		while (round > 0) {
			System.out.println("Please enter p for Paper, s for Scissors, r for Rock: ");
			String choiceOfPlayerB = s.nextLine();
			MATERIAL materialOfB = MATERIAL.fromCode(choiceOfPlayerB);
			playerB.setMaterial(materialOfB);

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
		s.close();
		System.out.println("Player A wins: " + playerA.getScore() + " rounds");
		System.out.println("Player B wins: " + playerB.getScore() + " rounds");
		System.out.println("Tie: " + tie);
	}
}
