package domaci3;

/*Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
	 Primer: ulaz     m=3, n=7;
	 Izlaz (vidljivo u konzoli)*/

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dimenzije stranice b");

		int br1 = sc.nextInt();

		if (br1 <= 0) {

			System.out.println("Dimenzija treba da bude pozitivan broj.");

			return;
		}

		System.out.println("Unesute dimenzije stranice a");

		int br2 = sc.nextInt();

		if (br2 <= 0) {

			System.out.println("Dimenzija treba da bude pozitivan broj.");

			return;
		}

		for (int i = 0; i < br1; i++) {
			for (int z = 0; z < br2 - 1; z++) {

				System.out.print(" * ");
			}

			System.out.println(" * ");

		}

	}

}
