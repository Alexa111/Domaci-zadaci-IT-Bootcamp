package pozoriste;

import java.util.ArrayList;



public class Predstava {
	
	private ArrayList <Zaposleni> zap; 
	
	private String nazivPredstave;
	
	Teatar t;



	public Predstava(String nazivPredstave, Teatar t) {
		super();
		this.nazivPredstave = nazivPredstave;
		this.t = t;
		this.zap = new ArrayList<Zaposleni>();
	
	}
	
	public void dodajZ(Zaposleni z) {
		
		zap.add(z);
	
		}
	
	public void oduzmiZ(Zaposleni z) {
		
		zap.remove(z);
	}
	
	public int  saberi() {
		
		return zap.size();
	}

	
	public void ispis() {
		
		System.out.println(zap);
	}
	
	
	

}
