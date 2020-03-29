package domaci6;

import java.util.Scanner;

public class ProizvodNiza {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza:");

		int duzina = sc.nextInt();

		if (duzina <= 0) {

			System.out.println("Duzina mora biti veca od nule.");

			return;
		}

		int[] niz = new int[duzina];

		int clan = 0;

		int broj = 0;

		System.out.println("Unesite clanove niza: ");

		for (int i = 0; i < duzina; i++) {

			clan = sc.nextInt();

			niz[i] = clan;
		}

		for (int i = 0; i < duzina; i++) {

			if (niz[i] > i) {

				broj = niz[i] * i;

				System.out.println("Proizvod clana " + niz[i] + " i indeksa " + i + " je " + broj);

			} else {
				System.out.println("Clan " + niz[i] + " je manji ili jednak indeksu " + i);
			}
		}

	}
}
