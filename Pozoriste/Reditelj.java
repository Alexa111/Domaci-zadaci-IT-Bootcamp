package pozoriste;

public class Reditelj extends Zaposleni {
	
	private String nadimak;

	public Reditelj(String imePrezime, String nadimak , Teatar t) {
		super(imePrezime, t);
		this.nadimak = nadimak;
	}

	@Override
	public String toString() {
		return  nadimak +"_"+ super.getImePrezime()+" ["+super.getT().getNaziv()+ "]";
	}
	

	
	
}
