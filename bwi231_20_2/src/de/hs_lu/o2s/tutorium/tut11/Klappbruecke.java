package de.hs_lu.o2s.tutorium.tut11;

public class Klappbruecke extends Bruecke{
	
	
	private double maxTragkraft;
	private boolean geoeffnet;
	
	public Klappbruecke() {
		
	}
	
	public Klappbruecke(double laenge, int baujahr, int letzteRenovierung) {
		super(laenge, baujahr, letzteRenovierung);
	}
	

	private String stringGeoeffnet(){
		if(this.geoeffnet) {
			return "Die Br�cke ist nicht befahrbar.";
		}else return "Die Br�cke ist befahrbar.";
	}



	public double getMaxTragkraft() {
		return maxTragkraft;
	}



	public void setMaxTragkraft(double maxTragkraft) {
		this.maxTragkraft = maxTragkraft;
	}



	public boolean getGeoeffnet() {
		return geoeffnet;
	}



	public void setGeoeffnet(boolean geoeffnet) {
		this.geoeffnet = geoeffnet;
	}
	
	public String toString() {
		String s = super.toString();
		s += this.stringGeoeffnet() + "\n";
		s += "Die maximale Tragkraft betr�gt " +  this.getMaxTragkraft() + " Tonnen.";
		return s;
	}
}
