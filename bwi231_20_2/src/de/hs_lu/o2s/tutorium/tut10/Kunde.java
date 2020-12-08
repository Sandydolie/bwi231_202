package de.hs_lu.o2s.tutorium.tut10;

public class Kunde {
	
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private double generierterUmsatz = 0;
	
	public Kunde(String vorname, String nachname, String geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public double getGenerierterUmsatz() {
		return generierterUmsatz;
	}

	public void setGenerierterUmsatz(double generierterUmsatz) {
		this.generierterUmsatz = generierterUmsatz;
	}
	
	public void kaufeProdukt(Object o) {
		if(o instanceof Gemuese) {
			Gemuese g = (Gemuese) o;
			this.generierterUmsatz += g.getPreis();
		}
		if(o instanceof Obst) {
			Obst o1 = (Obst) o;
			this.generierterUmsatz += o1.getPreis();
		}
		else System.out.println("Dieses Produkt kann nicht gekauft werden");
		
	}
}
