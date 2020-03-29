package domaci2;

/* U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da li ce lift 
bezbedno krenuti u zavisnostii od tezine koju treba da ponese. Podrazumevane 3 opcije: 
Lift je preopterecen; 
Na granici je; 
Lift je pokrenut  
(zahtevi zadatka namerno nisu dalje razradjivani jer 
1) ostavljam vasoj masti na volju 
2) zelim da budem upucena u vas tok razmisljanja). 
*/


import java.util.Scanner;

public class Lift {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Sprat 1----- Putnice 1, unesite vasu tezinu: ");

		int putnik_1 = sc.nextInt();// Kapacitet lifta je 680 kg ili 8 osoba prosecne mase od 85 kg

		int kapacitet = putnik_1 - 680;

		if (putnik_1 >= 0 && putnik_1 <= 650) { // Uzmimo u obzir da na spratu 1 ulazi jedna osoba 

			System.out.println("Trenutna masa u liftu je " + putnik_1 + " kg i ne ugrozava bezbednost." + "\n");
		}

		else if (putnik_1 > 650 && putnik_1 <= 680) {

			System.out.println("Masa u liftu je kriticna! Vozite se na sopstvenu odgovornost." + "\n");

		}

		else if (putnik_1 > 680) {

			System.out.println(
					"Trenutna masa u liftu nije bezbedna! Lift stoji. Prekoracili ste masu za " + kapacitet + " kg");
			return;
		}

		else {

			System.out.println("Pogresan unos, broj treba da bude veci od nule.Pokrenite racunanje ispocetka.");
			return;
		}

		System.out.println("Sprat 2----- Putnice 2, unesite vasu tezinu: ");//Uzmimo u obzir da na spratu 2 ulazi jedna osoba 

		int putnik_2 = sc.nextInt();

		int masa_2 = putnik_1 + putnik_2;
		int kapacitet_2 = masa_2 - 680;

		if (masa_2 >= 0 && masa_2 <= 650) {

			System.out.println("Trenutna masa u liftu je " + masa_2 + " kg  i ne ugrozava bezbednost." + "\n");
		}

		else if (masa_2 > 650 && masa_2 <= 680) {

			System.out.println("Masa u liftu je kriticna! Vozite se na sopstvenu odgovornost." + "\n");

		}

		else if (masa_2 > 680) {

			System.out.println(

					"Trenutna masa u liftu nije bezbedna! Lift stoji. Prekoracili ste masu za " + kapacitet_2 + " kg");
			return;
		}

		else {

			System.out.println("Pogresan unos, broj treba da bude veci od nule.Pokrenite racunanje ispocetka.");
			return;
		}

		System.out.println("Sprat 3----- Putnice 3,4 i 5 unesite vase tezine: ");//Uzmimo u obzir da na spratu 3 ulaze tri osobe

		int putnik_3 = sc.nextInt();
		int putnik_4 = sc.nextInt();
		int putnik_5 = sc.nextInt();
		
		

		int masa_3 = putnik_1 + putnik_2 + putnik_3 + putnik_4 + putnik_5;
		int kapacitet_3 = masa_3 - 680;

		if (putnik_3 > 0 && putnik_4 > 0 && putnik_5 > 0 && masa_3 >= 0 && masa_3 <= 650) {

			System.out.println("Trenutna masa u liftu je " + masa_3 + " kg  i ne ugrozava bezbednost." + "\n");
		}

		else if (putnik_3 > 0 && putnik_4 > 0 && putnik_5 > 0 && masa_3 > 650 && masa_3 <= 680) {

			System.out.println("Masa u liftu je kriticna! Vozite se na sopstvenu odgovornost." + "\n");

		}

		else if (putnik_3 > 0 && putnik_4 > 0 && putnik_5 > 0 && masa_3 > 680) {

			System.out.println(
					"Trenutna masa u liftu nije bezbedna! Lift stoji. Prekoracili ste masu za " + kapacitet_3 + " kg");
			return;
		}

		else {

			System.out.println("Pogresan unos, broj treba da bude veci od nule.Pokrenite racunanje ispocetka.");
			return;
		}

		System.out.println("Sprat 4----- Putnice 6, 7 i 8 unesite vase tezine: ");//Uzmimo u obzir da na spratu 4 ulaze tri osobe

		int putnik_6 = sc.nextInt();
		int putnik_7 = sc.nextInt();
		int putnik_8 = sc.nextInt();
		

		int masa_4 = putnik_1 + putnik_2 + putnik_3 + putnik_4 + putnik_5 + putnik_6 + putnik_7 + putnik_8;

		int kapacitet_4 = masa_4 - 680;

		if (putnik_6 > 0 && putnik_7 > 0 && putnik_8 > 0 && masa_4 >= 0 && masa_4 <= 650) {

			System.out.println("Trenutna masa u liftu je " + masa_4 + " kg  i ne ugrozava bezbednost." + "\n"
					+ "lift nastavlja ka izabranom spratu.");
		}

		else if (putnik_6 > 0 && putnik_7 > 0 && putnik_8 > 0 && masa_4 > 650 && masa_4 <= 680) {

			System.out.println("Masa u liftu je kriticna! Vozite se na sopstvenu odgovornost." + "\n");

		}

		else if (putnik_6 > 0 && putnik_7 > 0 && putnik_8 > 0 && masa_4 > 680) {

			System.out.println(
					"Trenutna masa u liftu nije bezbedna! Lift stoji. Prekoracili ste masu za " + kapacitet_4 + " kg");

			return;
		}

		else {

			System.out.println("Pogresan unos, broj treba da bude veci od nule.Pokrenite racunanje ispocetka.");

			return;
		}
		
	}

}
