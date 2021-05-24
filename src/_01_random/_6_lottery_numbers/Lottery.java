package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random ran = new Random();
		String Numbers = "";
		for (int count = 0; count < 5; count++)
			
		{
			int randomChoice = ran.nextInt(100 - 10 + 1) + 1;

			 Numbers += randomChoice +" ";
			
		}
		JOptionPane.showMessageDialog(null, Numbers);
	}
}