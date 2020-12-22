package de.hs_lu.o2s.tutoritum.tut12;

public class Anhaenger {
	
	private String inhalt;
	private double laenge;
	private double breite;
	private double hoehe;
	private int anzReifen;
	
	public Anhaenger() {
		
	}
	
	

	public Anhaenger(String inhalt, double laenge, double breite, double hoehe, int anzReifen) {
		super();
		this.inhalt = inhalt;
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
		this.anzReifen = anzReifen;
	}



	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

	public int getAnzReifen() {
		return anzReifen;
	}

	public void setAnzReifen(int anzReifen) {
		this.anzReifen = anzReifen;
	}
	
	public double getBreite() {
		return breite;
	}



	public void setBreite(double breite) {
		this.breite = breite;
	}



	public String toString() {
		return this.getClass().getSimpleName() + " mit dem Inhalt "
				+ this.getInhalt() + " den Ausmassen " + this.getHoehe() + "m "
				+ this.getBreite() + "m " + this.getLaenge() + "m (HxBxL) und mit "
				+ this.getAnzReifen() + " Reifen.";
	}
	
	

}
