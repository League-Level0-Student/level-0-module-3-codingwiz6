
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int f=1;f<11;f++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess=JOptionPane.showInputDialog("Guess a number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int num= Integer.parseInt(guess);
			// 5. if the guess is correct
		if(num==random) {
				// 6. Win
			JOptionPane.showMessageDialog(null, "Yay! You guessed the number! :) You got "+f);
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			System.exit(0);
		}
			// 7. if the guess is high
			if(num<random) {
				JOptionPane.showMessageDialog(null, "Too low");
			}
				// 8. Tell them it's too high
		
		
			// 9. if the guess is low
			if(num>random) {
				JOptionPane.showMessageDialog(null, "Too high");
			}
				// 10. Tell them it's too low
		}
		
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "Sorry you used up all your guesses ;-;");
	}

}


