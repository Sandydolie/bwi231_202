package de.hs_lu.o2s.tutorium.tut3;

public class Auto {
	
	private String marke;
	private String type;
	private int baujahr;
	private Reifen reifen;
	private int neuwagenwert;
	
	
	
	
	public Auto() {
	}
	
	
	public Auto(String marke, String type, int baujahr, Reifen reifen, int neuwagenwert) {
		super();
		this.marke = marke;
		this.type = type;
		this.baujahr = baujahr;
		this.reifen = reifen;
		this.neuwagenwert = neuwagenwert;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "gebaut im Jahr " + this.getBaujahr()
		+ "hat einen neuwagenwert von " + this.getNeuwagenwert() + " € und ist ein "
		+ this.getType() + " von der Marke " + this.getMarke() + " und fährt auf den "
		+ this.reifen.toString();
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public Reifen getReifen() {
		return reifen;
	}
	public void setReifen(Reifen reifen) {
		this.reifen = reifen;
	}
	public int getNeuwagenwert() {
		return neuwagenwert;
	}
	public void setNeuwagenwert(int neuwagenwert) {
		this.neuwagenwert = neuwagenwert;
	}

}
