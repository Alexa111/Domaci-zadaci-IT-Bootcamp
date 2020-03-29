package sport;

public class Clanovi {

	private int p;

	private Clan cl[];

	public Clanovi() {

		cl = new Clan[20];
	}

	public void dodajSportistu(Clan c) {

		cl[p] = c;

		p++;

	}

	public void ispisiSportistu() {

		for (int i = 0; i < p; i++) {

			String ime = cl[i].getIme();
			String prezime = cl[i].getPrezime();
			int godiste = cl[i].getGodiste();

			System.out.println(ime.toUpperCase() + "_" + prezime.toUpperCase() + ":" + " godinaRodjenja " + godiste);

		}
	}

}
