package de.hs_lu.o2s.tutorium.tut6;

public abstract class Haus {
	
	

	private String strasse;
	private int etagen;
	private int einwohner;
	private double grundstuecksFlaeche;
	private String[] getr‰nkeA;
	protected double umsatz;
	
	public Haus() {
		
	}
	
	public String[] getGetr‰nkeA() {
		return getr‰nkeA;
	}

	public void setGetr‰nkeA(String[] getr‰nkeA) {
		this.getr‰nkeA = getr‰nkeA;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}

	public Haus(String strasse) {
		this.strasse = strasse;
		//Optional
//		this.setStrasse(strasse);
	}
	
	public Haus(String strasse, int etagen) {
		this(strasse);
		this.etagen = etagen;
	}
	
	public Haus(String strasse, int etagen, int einwohner) {
		this(strasse, etagen);
		this.einwohner = einwohner;
	}
	
	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getEtagen() {
		return this.etagen;
	}

	public void setEtagen(int etagen) {
		this.etagen = etagen;
	}

	public int getEinwohner() {
		return einwohner;
	}

	public void setEinwohner(int einwohner) {
		this.einwohner = einwohner;
	}
	
	public void druckDich() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		
		String s;
		s = this.getClass().getSimpleName() + " mit Einwohnern: " + this.getEinwohner()
			+ " und Etagen: " + this.getEtagen() + " liegt in der Straﬂe " + this.strasse + "\n";
		return s;
	}

	public double getGrundstuecksFlaeche() {
		return grundstuecksFlaeche;
	}

	public void setGrundstuecksFlaeche(double grundstuecksFlaeche) {
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
		return this.getGrundstuecksFlaeche() * quadratmeterPreis;
	}
	
	public abstract double kostenSanierung(int Preis);
	
	public abstract void berechneUmsatz(double preis);

}
