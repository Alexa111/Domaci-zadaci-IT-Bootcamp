package deca;

/*Dete ima ime, prezime, broj godina i broj klikera. 
  Napraviti mogucnost da se kreira vise objekata klase Dete. 
  Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
  Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj 
  decjih godina(ako imamo troje dece, broj prosecnih godina za njih troje; 
  ako imamo dvoje racunamo prosecne godine za to dvoje) .*/

public class DeteMain {

	public static void main(String[] args) {

		Dete d = new Dete("Pera", "Peric", 9, 1);

		Dete d1 = new Dete("Mika", "Mikic", 6, 15);

		Dete d2 = new Dete("Laza", "Lazic", 11, 8);

		d.dodajKlikere(5);

		d1.oduzmiKlikere(2);

		d1.ispisiBrKlikera();
		d2.ispisiBrKlikera();
		d.ispisiBrKlikera();

		System.out.println("Prosek godina je: " + Dete.prosekGodina());

	}

}
