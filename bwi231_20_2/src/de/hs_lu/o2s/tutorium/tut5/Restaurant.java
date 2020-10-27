package de.hs_lu.o2s.tutorium.tut5;

public class Restaurant extends Haus {
	
	private double sitzflaeche;
	private int maxKunden;
	private final String inhaber;
	private String[] getraenke;
	


	public Restaurant(String inhaber) {
		// TODO Auto-generated constructor stub
		this.inhaber = inhaber;
	}

	public Restaurant(String strasse, String inhaber) {
		super(strasse);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, String inhaber) {
		super(strasse, etagen);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String strasse, int etagen, int einwohner, String inhaber) {
		super(strasse, etagen, einwohner);
		this.inhaber = inhaber;
		// TODO Auto-generated constructor stub
	}
	
	public Restaurant(double sitzflaeche, int maxKunden, String inhaber) {
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
		this.inhaber = inhaber;
	}

	public double getSitzflaeche() {
		return sitzflaeche;
	}

	public void setSitzflaeche(double sitzflaeche) {
		this.sitzflaeche = sitzflaeche;
	}

	public int getMaxKunden() {
		return maxKunden;
	}

	public void setMaxKunden(int maxKunden) {
		this.maxKunden = maxKunden;
	}
	
	public String toString() {
		String s = super.toString();
		s += "Hat eine Sitzfläche von " + this.getSitzflaeche() + " und kann maximal " + this.getMaxKunden()
		+ " Kunden bewirten.";
		return s;
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
		double preis = quadratmeterPreis * getGrundstuecksFlaeche() * 3.0;
		return preis;
	}


	public String getInhaber() {
		return inhaber;
	}

	@Override
	public double kostenSanierung(int Preis) {
		return this.getGrundstuecksFlaeche() * Preis * 2.0;
	}

	@Override
	public double berechneUmsatz(double Preis) {
		return this.getEinwohner() * Preis;
	}
	
	public void addGetraenk(String getraenk) {
		String[] a = new String[this.getraenke.length +1];
		System.arraycopy(a, 0, this.getraenke, 1, a.length);
		this.getraenke = a;
		this.getraenke[0] = getraenk;
	}

	

}
