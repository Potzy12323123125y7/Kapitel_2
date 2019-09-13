/*
 Ett enkelt Hello World i java
 Skapat 2019-09-13
 Programmerare Magnus Silverdal
*/
import javax.swing.*;
import java.util.Scanner;

public class Exempel { 
	public static void main(String[] args) {
		// varibeldeklaration
		String namn;
		String adrs;
		String tlfn;
		String allt;
				// tilldelning
		String namn = "Alexander Jonsson Näslund";
		String adrs = "Vastra norrfors 160";
		String tlfn = "0708162004";
		String allt = namn + "\n" 
		
		// dialogruta
		msg = JOptionPane.showInputDialog(null,"Skriv ett meddelande");
		JOptionPane.showMessageDialog(null, msg);
		
		// I terminalen
		System.out.println("Skriv ett meddelande");
		Scanner tgb = new Scanner(System.in);
		msg = tgb.nextLine();
		System.out.println(msg);	
	}
}