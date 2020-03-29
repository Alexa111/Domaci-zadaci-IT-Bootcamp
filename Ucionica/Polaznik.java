package ucionica;

public class Polaznik {

	private String ime;

	private String prezime;

	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase();
	}

}
