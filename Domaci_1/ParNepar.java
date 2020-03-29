package domaci2;

/*Napisati program koji racuna sumu parnih brojeva i proizvod neparnih 
		brojeva od 0 do n - za resavanje ovog zadatka koristiti samo jednu 
		petlju (ne jednu vrstu petlje, vec samo jednu petlju)*/

import java.util.Scanner;

public class ParNepar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite pozitivan broj ");

		int broj = sc.nextInt();

		if (broj > 0) {

			int suma = 0;
			int suma1 = 1;
			for (int i = 0; i <= broj; i++) {

				if (i % 2 == 0) {

					suma += i;
				} else if (i % 2 > 0 && i > 0) {
					suma1 *= i;

				}

			}
			System.out.println("Suma parnih brojeva od 0 do " + broj + " iznosi " + suma + "\n");
			System.out.println("Proizvod neparnih brojeva od 0 do " + broj + " iznosi " + suma1);
		}
			

		else {

			System.out.println("Broj treba da bude veci od nule. Pokrenite program ponovo i unesite pozitivan broj.");
		}
	}

}
