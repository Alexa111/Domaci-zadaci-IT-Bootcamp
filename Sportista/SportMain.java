package sport;

/*Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:
IME_PREZIME: godinaRodjenja
Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. Sva
polja mogu da se dohvate, a naziv kluba moze i da se postavi.
Napisati metodu koja ce ispisati ceo objekat klase klub.
Napisati glavni program, gde cete testirati kako ove klase funkcionisu.*/

public class SportMain {

	public static void main(String[] args) {

		SportskoDrustvo sd = new SportskoDrustvo("Partizan", "Beograd", 1944);

		Clan cla = new Clan("Vlade", "Divac", 1970);
		Clan cla1 = new Clan("Pera", "Peric", 1988);
		Clan cla2 = new Clan("Savo", "Milosevic", 1975);

		Clanovi c = new Clanovi();

		c.dodajSportistu(cla);
		c.dodajSportistu(cla1);
		c.dodajSportistu(cla2);

		System.out.println(sd);

		c.ispisiSportistu();

		sd.setNaziv("Zvezda");

		System.out.println(sd);

		Clan cl1 = new Clan("Dragan", "Stojkovic", 1968);
		Clan cl2 = new Clan("Dragan", "Dzajic", 1940);

		Clanovi c1 = new Clanovi();

		c1.dodajSportistu(cl1);
		c1.dodajSportistu(cl2);
		c1.dodajSportistu(cla);
		c1.ispisiSportistu();
	}

}
