package ucionica;

import java.util.ArrayList;

public class LapTop {

	private String marka;

	public LapTop(String marka) {

		this.marka = marka;
	}

	public String getMarka() {

		return marka;
	}

	private ArrayList<Polaznik> polaznici = new ArrayList<Polaznik>();

	public void dodajPolaznika(Polaznik p) {

		polaznici.add(p);

	}

	public void ukloniPolaznika(Polaznik po) {

		polaznici.remove(po);
	}

	public void grupisi() {

		for (int i = 0; i < polaznici.size(); i++) {

			polaznici.get(i).getIme();
			polaznici.get(i).getPrezime();

		}
	}

	public void ispis() {

		System.out.println(marka.toUpperCase() + polaznici);

	}
}
