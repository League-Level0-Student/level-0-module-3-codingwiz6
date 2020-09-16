package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	String h=JOptionPane.showInputDialog("Are you happy?");
	if(h.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you were doing! ;)");
	}
	if(h.equals("no")) {
		String a=JOptionPane.showInputDialog("Do you want to be happy?");
		
		if(a.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something than");
			
		}
		if(a.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you were doing! ;)");
		}
	}
}

}
