package domaci5;

import java.util.Scanner;

public class RastuciNiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int duzina = 0;

		System.out.println("Unesite duzinu niza: ");
		duzina = sc.nextInt();

		if (duzina != 0) {

			int i = 0;

			int[] niz = new int[duzina];

			System.out.println("Unesite clanove niza: ");
			for (i = 0; i < duzina; i++) {
				niz[i] = sc.nextInt();

			}

			for (i = 0; i < duzina - 1; i++) {

				if (niz[i] > niz[i + 1]) {

					System.out.println("Niz nije rastuci");

				} else {

					System.out.println("Niz je rastuci");
				}

			}

		}

		else {

			System.out.println("Broj treba biti veci od nule");
		}

	}

}
