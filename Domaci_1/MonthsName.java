package domaci2;

/*Zadatak: Napisati program koji na osnovu unete godine i meseca ispisuje
koliko taj mesec ima dana - za
resavanje ovog zadatka koristiti switch*/

import java.util.Scanner;

public class MonthsName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite naziv meseca sa pocetnim velikim slovom: ");

		String mesec = sc.nextLine();

		switch (mesec) {

		case "Januar":
		case "Jun":
		case "Jul":

			System.out.println("3 meseca u godini pocinju sa slovom 'J'");

			break;

		case "Februar":
		case "Septembar":
		case "Oktobar":
		case "Novembar":
		case "Decembar":

			if (mesec.startsWith("F")) {
				System.out.println("1 mesec u godini pocinje sa slovom 'F' ");
			} else if (mesec.startsWith("S")) {
				System.out.println("1 mesec u godini pocinje sa slovom 'S' ");
			} else if (mesec.startsWith("O")) {
				System.out.println("1 mesec u godini pocinje sa slovom 'O' ");
			} else if (mesec.startsWith("N")) {
				System.out.println("1 mesec u godini pocinje sa slovom 'N' ");
			} else if (mesec.startsWith("D")) {
				System.out.println("1 mesec u godini pocinje sa slovom 'D' ");
			}

			break;

		case "Mart":
		case "Maj":
		case "April":
		case "Avgust":

			if (mesec.startsWith("M")) {
				System.out.println("2 meseca u godini pocinju sa slovom 'M' ");
			} else if (mesec.startsWith("A")) {
				System.out.println("2 meseca u godini pocinju sa slovom 'A' ");
			}
			break;

		default:

			System.out.println("Ne postoji mesec ciji naziv pocinje sa slovom " + mesec);

		}
	}

}
