package de.hs_lu.o2s.tutorium.tut8;



public class Supermarkt {
	
	private int kundenanzahl = 0;
	private double verkaufsflaeche;
	private String name;
	private String oefunungzeiten;
	private Kunde[] kundenA;
	
	
	public int getKundenanzahl() {
		return kundenanzahl;
	}
	public void setKundenanzahl(int kundenanzahl) {
		this.kundenanzahl = kundenanzahl;
	}
	public double getVerkaufsflaeche() {
		return verkaufsflaeche;
	}
	public void setVerkaufsflaeche(double verkaufsflaeche) {
		this.verkaufsflaeche = verkaufsflaeche;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOefunungzeiten() {
		return oefunungzeiten;
	}
	public void setOefunungzeiten(String oefunungzeiten) {
		this.oefunungzeiten = oefunungzeiten;
	}
	public Supermarkt(int kundenanzahl, double verkaufsflaeche, String name, String oefunungzeiten, int i) {
		super();
		this.kundenanzahl = kundenanzahl;
		this.verkaufsflaeche = verkaufsflaeche;
		this.name = name;
		this.oefunungzeiten = oefunungzeiten;
		kundenA = new Kunde[i];
	}
	
	public Supermarkt() {
		this.kundenA = new Kunde[0];
	}
	
	public int berechneUmsatz() {
		int umsatz = 0;
		for(int i = 0; i < kundenA.length; i++) {
			umsatz += kundenA[i].getGenerierterUmsatz();
		}
		return umsatz;
	}
	
	
	
		
	

}
