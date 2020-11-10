package de.hs_lu.o2s.tutorium.tut7;

public class Segelboot extends Boot {
	
	private int anzSegel;
	private int baujahr;
	
	public Segelboot(int kajueten, int passagiere){
		super(kajueten);
		this.setPassagiere(passagiere);
	}
	
	
	public int getAnzSegel() {
		return anzSegel;
	}
	public void setAnzSegel(int anzSegel) {
		this.anzSegel = anzSegel;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	

}
