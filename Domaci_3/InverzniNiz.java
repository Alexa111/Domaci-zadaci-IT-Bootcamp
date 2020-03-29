package domaci5;

import java.util.Scanner;

public class InverzniNiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int duzina = 0;

		System.out.println("Unesite duzinu niza: ");

		duzina = sc.nextInt();
		
		if(duzina == 0) {
			
			System.out.println("Duzina mora da bude veca od nule...");
			return;
		}

		int[] clanovi = new int[duzina];
		int[] unazad = new int[duzina];

		int i = 0;

		System.out.println("Unesite clanove niza, " + " ukupno " + duzina + " clana");

		for (i = 0; i < duzina; i++) {

			int broj1 = sc.nextInt();
			clanovi[i] = broj1;
			unazad[(duzina - 1) - i] = broj1;

		}
		
		
		System.out.println("Obrnuti redosled brojeva je: ");
		for (i = 0; i < duzina; i++) {

			System.out.println(unazad[i]);
		
		}
	

	}

}
