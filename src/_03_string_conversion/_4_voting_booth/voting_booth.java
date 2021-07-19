package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
public static void main(String[] args) {
	

	String ageInYears = JOptionPane.showInputDialog("How old are you in years?");
	
	int ageAsInt = Integer.parseInt(ageInYears);
	
	if (ageAsInt >= 18) {
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
	} 
	if (ageAsInt < 18) {
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}
}
}