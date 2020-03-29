package pozoriste;

public class Teatar {
	
	private String naziv;
	
	private static int id;
	
	int num;

	public Teatar(String naziv) {
		
		this.naziv = naziv;
	
		id++;
		
		num = id;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public  int getId() {
		return num;
	}

	@Override
	public String toString() {
		return  naziv +"[id:"+ num +"]";
	}
	
	

}
