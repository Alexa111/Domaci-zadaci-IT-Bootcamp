package prevoznik;

public class Putnik extends Covek {

	private double novac;

	private Covek c;

	public Putnik(String ime, String prezime, double novac) {

		super(ime, prezime);

		this.novac = novac;
	}

	public Putnik() {

	}

	public double getNovac() {

		return novac;
	}

	public void dodajNovac(double suma) {

		if (suma > 0) {

			novac += suma;
			System.out.println("Uspesno ste dodali novac");
		} else {

			System.out.println("Iznos treba da bude pozitivan");
		}

	}

	public void oduzmiNovac(double suma) {

		if (suma < novac && suma > 0) {

			novac -= suma;

			System.out.println("Uspesno ste oduzeli novac");
		}

		else {

			System.out.println("Putnik " + super.getIme() + " " + super.getPrezime() + " nema toliko novca");
		}
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.getIme()).append(" ");
		sb.append(super.getPrezime());
		sb.append("[");
		sb.append(novac).append("]");

		return sb.toString();

	}

}
