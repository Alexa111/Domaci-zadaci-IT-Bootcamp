package sport;

public class SportskoDrustvo {

	private String naziv;

	private String grad;

	private int godina;



	public SportskoDrustvo(String naziv, String grad, int godina) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.godina = godina;

	}

	public String getNaziv() {
		return naziv;
	}

	public String setNaziv(String naziv) {

		this.naziv = naziv;

		return naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodina() {
		return godina;
	}

	@Override
	public String toString() {
		return "SportskoDrustvo| naziv: " + naziv + ", grad: " + grad + ", godina:" + godina;
	}

}
