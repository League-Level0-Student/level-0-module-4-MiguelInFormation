package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		
		String change1= JOptionPane.showInputDialog("How many nickols doo u hav?");
		int bd=Integer.parseInt(change1);
		double total=0.0;
		total+=bd*.05;
		
		String change2= JOptionPane.showInputDialog("How many dymes doo u hav?");
		int bg=Integer.parseInt(change2);
		total+=bd*.10;
		
		String change3= JOptionPane.showInputDialog("How many qworters doo u hav?");
		int bh=Integer.parseInt(change3);
		
		total+=bd*.25;
		
		JOptionPane.showMessageDialog(null, total);
		
		
		
		

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

