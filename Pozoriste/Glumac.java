package pozoriste;

public class Glumac extends Zaposleni {
	
	
	private String uloga;
	
   // private Teatar t;
	
	//private Zaposleni z;

	public Glumac(String imePrezime, String uloga, Teatar t) {
		super(imePrezime, t);
		this.uloga = uloga;
		
	}



	@Override
	public String toString() {
		return  uloga +"_"+super.getImePrezime()+"["+ super.getT().getNaziv()+"]";
	}

	

	
	
	

}
