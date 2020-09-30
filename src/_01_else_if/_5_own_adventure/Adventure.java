package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog(
				"You are at swim practice.Your coach says to do a 50 all-out sprint.DO you listen to your coach or not?");

		if (f.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"You did the 50 all-out sprint.And your coachs says you are the fastest swimmer");

		}
		if (f.equals("no")) {
			String r = JOptionPane.showInputDialog(
					"You didn't listen to the coach so you got in trouble for not listening.You get benched.Do you call your mom to take you home or stay");
if(r.equalsIgnoreCase("Stay")) {
	JOptionPane.showMessageDialog(null, "You stay and get to swim and suprisingly have a good time");
}
			if (r.equalsIgnoreCase("call Mom")) {
				JOptionPane.showMessageDialog(null, "Mom says you have to stay at swim practice and swim");
			}
		}

	}
}