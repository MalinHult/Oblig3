package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String fil = filnavn;
		
		try {
			File file = new File(MAPPE + fil);
			PrintWriter skriver = new PrintWriter(file);
			
			skriver.println(samling.toString());
			skriver.close();
			
			return true;
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Filen finnes ikke.");
			return false;
		}
	}
}
