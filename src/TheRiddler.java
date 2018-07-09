import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("A coin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score +=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, it is a coin!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		answer = JOptionPane.showInputDialog(
				"Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		// 2. Make a pop up to show the score.
		if (answer.equals("Meat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score +=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, he weighs meat.");
		}

		answer = JOptionPane.showInputDialog(
				"What occurs once in every minute, twice in every moment, yet never in a thousand years?");
		if (answer.equals("The letter m")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score +=1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is the letter m");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
