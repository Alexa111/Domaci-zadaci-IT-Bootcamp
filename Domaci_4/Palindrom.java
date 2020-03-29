package domaci6;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza: ");

		int duzina = sc.nextInt();

		if (duzina <= 0) {

			System.out.println("Duzina mora biti veca od nule.");

			return;
		}

		int niz[] = new int[duzina];
		int nizUnazad[] = new int[niz.length];

		for (int i = 0; i < duzina; i++) {

			System.out.println("Unesite clana niza...");

			int broj = sc.nextInt();

			niz[i] = broj;

			nizUnazad[(duzina - 1) - i] = niz[i];
		}

		if (Arrays.equals(niz, nizUnazad)) {

			System.out.println("Palindrom");
		}

		else {

			System.out.println("Nije palindrom");
		}

	}

}
