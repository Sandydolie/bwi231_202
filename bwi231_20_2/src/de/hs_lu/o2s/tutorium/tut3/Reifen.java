package de.hs_lu.o2s.tutorium.tut3;

public class Reifen {
	
	private int reifenbreite,felgengroesse;
	private String reifentyp;
	
	
	public Reifen() {
		super();
	}


	public Reifen(int reifenbreite, int felgengroesse, String reifentyp) {
		super();
		this.reifenbreite = reifenbreite;
		this.felgengroesse = felgengroesse;
		this.reifentyp = reifentyp;
	}


	public int getReifenbreite() {
		return reifenbreite;
	}


	public void setReifenbreite(int reifenbreite) {
		this.reifenbreite = reifenbreite;
	}


	public int getFelgengroesse() {
		return felgengroesse;
	}


	public void setFelgengroesse(int felgengroesse) {
		this.felgengroesse = felgengroesse;
	}


	public String getReifentyp() {
		return reifentyp;
	}


	public void setReifentyp(String reifentyp) {
		this.reifentyp = reifentyp;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "passend für die Felgengroesse " 
				+ this.getFelgengroesse() + "mit der Breite " + this.getReifenbreite()
				+ " mm und dem Reifentyp " + this.getReifentyp();
				
	}
	
	
	

}
