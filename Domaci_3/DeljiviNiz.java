package domaci5;

import java.util.Scanner;

public class DeljiviNiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int duzina = 0;
		System.out.println("Unesite broj elemenata u nizu: ");

		duzina = sc.nextInt();
		int delilac = 0;
		int i = 0;

		int[] elementi = new int[duzina];

		System.out.println("Unesite clanove niza, ukupno " + duzina + " elemenata");

		for (i = 0; i < duzina; i++) {

			elementi[i] = sc.nextInt();

		}

		System.out.println("Unesite broj sa kojim zelite da delite :");

		delilac = sc.nextInt();

		if (delilac != 0) {

			for (i = 0; i < duzina; i++) {

				if (elementi[i] % delilac == 0) {

					System.out.println("Clan niza deljiv sa brojem " + delilac + " je " + elementi[i]);

				}

				else if (elementi[i] % delilac != 0) {

					System.out.println("broj " + elementi[i] + " nije deljiv sa " + delilac);
					return;
				}
			}
		} else {

			System.out.println("delilac ne moze da bude nula...");

		}

	}

}
