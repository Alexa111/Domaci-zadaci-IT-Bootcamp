package prevoznik;

/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
Svi podaci mogu da se dohvate, ali ne i postave.

Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja
mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme,
gde je potrebno vratiti indikator uspesnosti.

Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca.
Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
Autobus ispisati u sledecem obliku:
Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )*/

public class GlavnaKlasa {

	public static void main(String[] args) {

		Covek c = new Covek("Pera", "Peric");

		Covek c1 = new Covek("Djole", "Djokic");

		Covek c2 = new Covek("Mile", "Milic");

		Putnik p = new Putnik(c.getIme(), c.getPrezime(), 50);

		p.dodajNovac(600);

		Putnik p1 = new Putnik(c1.getIme(), c1.getPrezime(), 350);

		p1.oduzmiNovac(50);

		Vozac v = new Vozac(c2.getIme(), c2.getPrezime(), "Sofer");

		Autobus a = new Autobus("20", 200);

		a.dodajPutnika(p);
		a.dodajPutnika(p1);

		a.grupisi();
		a.dodajVozaca(v);
		// a.izbaciVozaca(v);
		a.vozi();
		a.ispis();

	}

}
