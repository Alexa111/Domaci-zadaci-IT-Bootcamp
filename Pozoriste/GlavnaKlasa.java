package pozoriste;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		
		
		Teatar t = new Teatar ("Kpgt");
		
		Teatar t1 = new Teatar ("Terazije");
		
		Teatar t2 = new Teatar ("BDP");
		
		Zaposleni z = new Zaposleni("Misa Misic", t1);
		
		Glumac g = new Glumac ("Nenad Jezdic","Boda Tyson",t2);
		
		Reditelj r = new Reditelj ("Djoka Djokic","Djole", t);
		
		Predstava pr = new Predstava("Blabla", t2);
		
		pr.dodajZ(g);
		pr.dodajZ(z);
		
		System.out.println(pr.saberi());
		
		
		
		//System.out.println(r);
		
		//System.out.println(z);

	}

}
