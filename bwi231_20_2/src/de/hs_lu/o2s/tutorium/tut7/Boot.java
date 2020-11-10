package de.hs_lu.o2s.tutorium.tut7;

public class Boot implements Comparable{
	
	private int kajueten;
	private double laenge;
	private int passagiere;
	private String liegtInHafen;
	
	public Boot() {
		
	}
	
	public Boot(int kajueten) {
		this.kajueten = kajueten;
	}
	
	public Boot(int kajueten, double laenge) {
		this(kajueten);
		this.laenge = laenge;
	}
	
	public Boot(int kajueten, double laenge, int passagiere) {
		this(kajueten, laenge);
		this.passagiere = passagiere;
	}
	
	public void legtAn(String hafen) {
		System.out.println("Das Boot legt in Hafen " + hafen + " an.");
		this.liegtInHafen = hafen;
	}

	public int getKajueten() {
		return kajueten;
	}

	public void setKajueten(int kajueten) {
		this.kajueten = kajueten;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public int getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(int passagiere){
		this.passagiere = passagiere;
	}

	public String getLiegtInHafen() {
		return liegtInHafen;
	}
	
	public String toString() {
		String s = this.getClass().getSimpleName() + " ist " + this.getLaenge() + " Meter lang, hat "
				+ this.getKajueten() + " Kajueten. Momentan sind " + this.getPassagiere() + " Passagiere an Bord "
				+ "und es liegt in dem Hafen " + this.getLiegtInHafen();
		return s;
	}

	@Override
	public int compareTo(Object o) {
		return this.passagiere - ((Boot) o).passagiere;
		
	}

}
