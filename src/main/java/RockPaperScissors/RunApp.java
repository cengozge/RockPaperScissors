package RockPaperScissors;

import java.util.Scanner;

public class RunApp {
	
	public static void main(String[] args) {
		
		int round = new RunApp().getRoundFromUser();
		Controller.manageGame(round);
		
	}
	
	public int getRoundFromUser(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter how many rounds you want to play: ");
		return s.nextInt();
	}
}
