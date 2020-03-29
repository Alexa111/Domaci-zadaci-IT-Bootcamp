package pozoriste;

public class Zaposleni {
	
	private String imePrezime;
	
	private Teatar t;

	

	public Zaposleni(String imePrezime,Teatar t) {
		super();
		this.imePrezime = imePrezime;
		this.t = t;
	}
	
	public String getImePrezime() {
		return imePrezime;
	}
	
	

	public Teatar getT() {
		return t;
	}

	@Override
	public String toString() {
		return imePrezime +" ["+ t.getNaziv()+"]";
	}
	
	

}
