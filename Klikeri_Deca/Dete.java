package deca;


public class Dete {

	private String ime;
	private String prezime;
	private double godine;

	public static int deca;
	public static double godineZajedno;

	public int klikeri = 0;

	public Dete(String ime, String prezime, double godine, int klikeri) {

		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.klikeri = klikeri;

		deca++;
		godineZajedno += godine;

	}

	public double getGodine() {

		return godine;
	}

	public String getIme() {

		return ime;
	}

	public String getPrezime() {

		return prezime;
	}

	public void dodajKlikere(int kli) {

		for (int i = 0; i < kli; i++) {

			klikeri++;
		}

	}

	public void oduzmiKlikere(int kli) {

		for (int i = 0; i < kli; i++)

			klikeri--;
	}

	public void ispisiBrKlikera() {

		System.out.println("Dete " + ime + " ima " + klikeri + " klikera ");
	}

	public static Double prosekGodina() {

		Double prosek = Double.valueOf(godineZajedno / Double.valueOf(deca));

		return prosek;

	}

}
