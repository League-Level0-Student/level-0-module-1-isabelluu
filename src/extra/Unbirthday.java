package extra;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog(null, "What is your birthday?");
		if (birthday.equals("7/09")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Merry unbirthday!");
		}
	}

}
