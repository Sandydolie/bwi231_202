package de.hs_lu.o2s.tutorium.tut6;

public class Disko extends Haus implements Bar, Comparable<Object> {

	private double eintrittspreis = 12.50; //Der Preis ist, falls nicht anders angegeben 12.50
	private int tanzflaeche;
	private int altersbeschraenkung = 18; //Mindestalter ist, falls nicht anders im Konstruktor angegebn 18
	private String[] getraenkeA;


	public Disko() {
		
	}
	
	public Disko(double eintrittspreis1) {
		this.eintrittspreis = this.eintrittspreiskorrekt(eintrittspreis1);
	}
	
	public Disko(double eintrittspreis, int tanzflaeche) {
		this(eintrittspreis);
		this.tanzflaeche = tanzflaeche;
	}
	
	public Disko(double eintrittspreis, int tanzflaeche, int altersbeschraenkung) {
		this(eintrittspreis,tanzflaeche);
		this.altersbeschraenkung = altersbeschraenkung;
		this.alterbeschraenkungkorrekt(this.altersbeschraenkung);
	}

	public Disko(String strasse) {
		super(strasse);
	}

	public Disko(String strasse, int etagen) {
		super(strasse, etagen);
	}

	public Disko(String strasse, int etagen, int einwohner) {
		super(strasse, etagen, einwohner);
	}
	
	public String toString() {
		String s = super.toString();
		s += " Die Disko ist für Personen ab einem Alter von " + this.getAltersbeschraenkung() + " Jahren zugelassen. "
				+ "Der Eintrittspreis beträgt " + this.getEintrittspreis() + " und besitzt eine Tanzfläche von "
				+ this.getTanzflaeche() + " qm².";
		return s;
	}

	public double getEintrittspreis() {
		return eintrittspreis;
	}

	public void setEintrittspreis(double eintrittspreis1) {
		this.eintrittspreis = this.eintrittspreiskorrekt(eintrittspreis1);
	}

	public int getTanzflaeche() {
		return tanzflaeche;
	}

	public void setTanzflaeche(int tanzflaeche) {
		this.tanzflaeche = tanzflaeche;
	}

	public int getAltersbeschraenkung() {
		return altersbeschraenkung;
	}

	public void setAltersbeschraenkung(int altersbeschraenkung) {
		this.altersbeschraenkung = altersbeschraenkung;
	}
	
	
	private void alterbeschraenkungkorrekt(int alterbeschraenkung) {
		if (alterbeschraenkung < 18) {
			this.altersbeschraenkung = 18;
		}
	}
	
	private double eintrittspreiskorrekt(double eintrittspreis) {
		if (eintrittspreis == 0) {
			return 12.50;
		}
		else return eintrittspreis;
	}

	@Override
	public double generateSteuererklärung() {
		double steuer = 0.19;
		double gewerbesteuer = 0.15;
		return (this.getUmsatz() * steuer) + (this.getUmsatz() * gewerbesteuer);
	}

	@Override
	public void addGetraenke(String[] getraenk) {
		String[] neuesA = new String[this.getraenkeA.length + getraenk.length];
		System.arraycopy(this.getraenkeA, 0, neuesA, 0, this.getraenkeA.length);
		System.arraycopy(getraenk, 0, neuesA, this.getraenkeA.length, getraenk.length);
		
	}

	@Override
	public double kostenSanierung(int Preis) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void berechneUmsatz(double preis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
//		Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
		//Eintrittspreise vergleichen!
		if (o instanceof Disko) {
			if(this.getEintrittspreis() > ((Disko) o).getEintrittspreis()) {
//			Alternativ:
//			Disko d = (Disko) o;
//			if(this.getEintrittspreis() > d.getEintrittspreis())
				System.out.println("Die aktuelle Disko ist teurer als die verglichene Disko!");
				return -1;
//				return (int) this.getEintrittspreis() - ((Disko) o).getEintrittspreis();
			}else if(this.getEintrittspreis() < ((Disko) o).getEintrittspreis()) {
				System.out.println("Die aktuelle Disko ist billiger als die verglichene Disko!");
				return 1;
			}else if(this.getEintrittspreis() == ((Disko) o).getEintrittspreis()) {
				System.out.println("Beide Diskos sind gleich teuer");
				return 0;
			}else return 0;
		}else {
			System.out.println("Das übergebene Objekt kann nicht verglichen werden");
			return 0;
		}
		
	}



	

	



}
