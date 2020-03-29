package domaci3;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcija = 0;
		double korpa = 0;
		double naplata = 0;
		double cena = 0;

		do {

			System.out.println("Ukoliko zelite da dodate proizvod i kreirate racun unesite 1" + "\n"

					+ "Ukoliko zelite da platite racun sa izabranim artiklima unesite 2" + "\n"

					+ "Ukoliko zelite da izadjete iz programa i obrisete vase porudzbne unesite 0");

			opcija = sc.nextInt();

			switch (opcija) {

			case 1:

				System.out.println("Unesite cenu artikla: ");

				cena = sc.nextDouble();

				if (cena > 0) {

					korpa += cena;

					System.out.println("Trenutni iznos na racunu je " + korpa);
				} else {

					System.out.println("Iznos treba da bude veci od nule..");
				}
				break;

			case 2:

				System.out.println("Trenutno zaduzenje je " + korpa + " Molimo vas da uplatite.");

				naplata = sc.nextDouble();

				if (naplata < korpa || naplata < 0) {

					System.out.println("Iznos od " + naplata + " nije dovoljan. Pocnite sa kupovinom ispocetka.");

					korpa = 0;
				}

				else if (naplata > korpa) {

					System.out.println("Vas kusur je " + (naplata - korpa) + " Hvala na kupovini!");

					korpa = 0;
				}

				else if (naplata == korpa) {

					System.out.println("Uspesno ste platili racun. Hvala na kupovini!");

					korpa = 0;
					break;
				}

			case 0:

				System.out.println("Hvala na poseti....");

				break;

			default: {

				System.out.println("Unos je od 1 - 3");
			}

			}
		}

		while (opcija != 0);
		{

			System.out.println("Good bye...");

		}

	}

}
