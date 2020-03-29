package domaci3;

/*Napisati program koji ce prebrojati koliko je brojeva od 
		 9 do 250 (ukljucujuci i njih) deljivih brojem 3.*/

public class Brojac {

	public static void main(String[] args) {

		int broj = 0;

		for (int i = 9; i <= 250; i++) {

			if (i % 3 == 0) {

				broj++;

			}

		}

		System.out.println("Ukupno " + broj + " broj je deljiv sa 3");
	}

}
