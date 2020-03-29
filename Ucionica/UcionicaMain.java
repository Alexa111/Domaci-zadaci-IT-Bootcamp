package ucionica;


/*
Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
Polaznik se ispisuje u obliku: IME_PREZIME.

Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja.
Marka moze samo da se dohvati. Lista polaznika koji koriste laptop moze da se prosiri i da se smanji.
Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}*/



public class UcionicaMain {

	public static void main(String[] args) {

		LapTop lp = new LapTop("Acer");

		LapTop lp1 = new LapTop("Asus");

		Polaznik p = new Polaznik("Alexa", "Maric");

		Polaznik p1 = new Polaznik("Mile", "Miletic");

		Polaznik p2 = new Polaznik("Pera", "Peric");

		lp.dodajPolaznika(p);
		lp.dodajPolaznika(p1);

		lp1.dodajPolaznika(p1);
		lp1.dodajPolaznika(p2);
		lp1.dodajPolaznika(p);

		lp1.ukloniPolaznika(p);

		lp1.grupisi();
		lp1.ispis();

		lp.grupisi();
		lp.ispis();

	}

}
