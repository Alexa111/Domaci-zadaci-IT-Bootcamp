package domaci6;

import java.util.Scanner;

public class Recenica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite recenicu:");

		String recenica = sc.nextLine();

		String rec[] = recenica.split(" ");

		int x = 0;

		for (int i = 0; i < rec.length; i++) {

			if (rec[i].startsWith("d") || rec[i].startsWith("D")) {

				x++;

			}

		}

		System.out.println("Ukupno ima " + x + " reci koje pocinju sa slovom d ili D");

	}

}
