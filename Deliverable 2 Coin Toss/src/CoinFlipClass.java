import java.util.Scanner;
import java.util.Random;

public class CoinFlipClass {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		int flipResult = 0;
		int correctCount = 0;
		float correctPercent;
		
		System.out.println("Guess which will have more: heads or tails?"); 
		String headsOrTailsGuess = scnr.nextLine();
		headsOrTailsGuess = (headsOrTailsGuess.toLowerCase());
		
		System.out.println("How many times shall we flip a coin?");
		int numberOfFlips = scnr.nextInt();
		
		for (int i = 0 ; i < numberOfFlips ; i++) {
			flipResult = rand.nextInt(2);
			
			if (flipResult == 1){
				if (headsOrTailsGuess.matches("heads")) {
				correctCount++;
			}
				System.out.println("heads");
			}
			
			else {
				if (headsOrTailsGuess.matches("tails")) {
				correctCount++;
			}
				System.out.println("tails");
			}
		}
		correctPercent = (float) correctCount / numberOfFlips*100f;
		
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " times.");
		System.out.println("That's " + String.format("%.0f", correctPercent) + ("%"));
		// TODO Auto-generated method stub

	}

}
