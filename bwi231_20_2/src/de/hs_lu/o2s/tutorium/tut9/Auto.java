package de.hs_lu.o2s.tutorium.tut9;

public class Auto {
	
	private double hubraum;
	/**
	 * Form des Autos - Cabriolet, Kombi, SUV
	 */
	private String art;
	private double preis;
	private String farbe;
	
	
	
	public Auto(double hubraum, String art, double preis, String farbe) {
		super();
		this.hubraum = hubraum;
		this.art = art;
		this.preis = preis;
		this.farbe = farbe;
	}
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public double getHubraum() {
		return hubraum;
	}
	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String toString() {
		String s;
		s = this.getClass().getSimpleName() + " mit der Farbe " + this.getFarbe() +
				" und der Klasse " + this.getArt() + ". Der Hubraum des Autos sind " +
				this.getHubraum() + " l. Der Preis des Wagens beträgt " + this.getPreis() + " €,";
		return s;
	}

}
