package prevoznik;

import java.util.ArrayList;

public class Autobus {

	Putnik p = new Putnik();

	private String naziv;

	private double cenaKarte;

	private boolean vozacDodat;

	private ArrayList<Putnik> putnici = new ArrayList<Putnik>();

	private Vozac v;

	String ime;
	String prezime;

	public Autobus(String naziv, double cenaKarte) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;

	}

	public String getNaziv() {
		return naziv;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public void dodajPutnika(Putnik p) {

		putnici.add(p);

	}

	public void ukloniPutnika(Putnik p) {

		putnici.remove(p);
	}

	public void grupisi() {

		for (int i = 0; i < putnici.size(); i++) {

			putnici.get(i).getIme();
			putnici.get(i).getPrezime();
			putnici.get(i).getNovac();

		}

	}

	public void dodajVozaca(Vozac v) {

		ime = v.getIme();
		prezime = v.getPrezime();

		System.out.println("Vozac " + v.getIme() + " je u autobusu");

		vozacDodat = true;

	}

	public void izbaciVozaca(Vozac v) {

		System.out.println("Vozac je izasao iz autobusa");
		vozacDodat = false;
	}

	public void vozi() {

		if (vozacDodat == true) {
			for (int i = 0; i < putnici.size(); i++) {

				double naplata = putnici.get(i).getNovac();

				if (naplata >= cenaKarte) {
					putnici.get(i).oduzmiNovac(cenaKarte);

				}
				if (naplata < cenaKarte) {
					putnici.remove(i);
				}

			
			}

		}

		else
			System.out.println("Vozac nije u autobusu. Autobus stoji");
	}

	
	
	public void ispis() {
		
		if(vozacDodat == true) {
		System.out.println(naziv + " " + ime + putnici);

	}
	}
}
