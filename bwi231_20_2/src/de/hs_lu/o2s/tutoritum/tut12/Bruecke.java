package de.hs_lu.o2s.tutoritum.tut12;

public abstract class Bruecke implements Comparable<Bruecke> {
	
	
	
	public int compareTo(Bruecke o) {
		if(this.laenge > o.laenge) return 1;
		else if(this.laenge == o.laenge) return 0;
		else if(this.laenge < o.laenge) return -1;
		else return 0;
		
	}

	private double laenge;
	private int baujahr;
	private int letzteRenovierung;
	
	
	public Bruecke() {
		
	}
	
	public Bruecke(double laenge, int baujahr, int letzteRenovierung) {
		this.laenge = laenge;
		this.baujahr = baujahr;
		this.letzteRenovierung = letzteRenovierung;
	}
	
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public int getLetzteRenovierung() {
		return letzteRenovierung;
	}
	public void setLetzteRenovierung(int letzteRenovierung) {
		this.letzteRenovierung = letzteRenovierung;
	}
	
	public int naechsteRenovierung() {
		return this.letzteRenovierung + 20;
	}
	
	public abstract boolean maxLast(double gewicht);
	
	public String toString() {
		String s = this.getClass().getSimpleName() + " ist im Jahr " + this.getBaujahr() 
				+	" mit einer Länge von " + this.getLaenge() + " Metern gebaut worden. \n"
				+ "Zuletzt Renoviert wurde die Brücke am " + this.getLetzteRenovierung() 
				+ " und muss im Jahr " + this.naechsteRenovierung() + " erneut renoviert werden.";
		return s;
		
	}
	
	

}
