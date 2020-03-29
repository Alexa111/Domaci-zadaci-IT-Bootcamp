package domaci3;

/* Napisati program koji unosi i sabira brojeve dokle god nije unesen 
		negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
        primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11 */

import java.util.Scanner;

public class Sabiranje {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int broj = 0;
		int rezultat = 0;

		System.out.println("Unesite broj: ");

		do {

			broj = sc.nextInt();
			rezultat += broj;

		}

		while (broj >= 0);
		{
		}

		System.out.println("Rezultat je : " + (rezultat - broj));
		

	}

}
