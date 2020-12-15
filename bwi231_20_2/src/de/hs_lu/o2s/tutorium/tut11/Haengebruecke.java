package de.hs_lu.o2s.tutorium.tut11;

public class Haengebruecke extends Bruecke{
	
	private double maxBelastung;
	
	public Haengebruecke() {
		
	}

	public Haengebruecke(double laenge, int baujahr, int letzteRenovierung) {
		super(laenge, baujahr, letzteRenovierung);
	}
	
	public String toString() {
		String s = super.toString();
		s += "Die maximale Belastung beträgt " + this.maxBelastung +  " Tonnen.";
		return s;
	}
	

}
