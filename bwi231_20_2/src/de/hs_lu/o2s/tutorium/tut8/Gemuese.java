package de.hs_lu.o2s.tutorium.tut8;

public class Gemuese implements Comparable<Gemuese>{
	
	private String haltbarkeit;
	private double preis;
	private String name;
	
	public String getHaltbarkeit() {
		return haltbarkeit;
	}
	public void setHaltbarkeit(String haltbarkeit) {
		this.haltbarkeit = haltbarkeit;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gemuese(String haltbarkeit, double preis, String name) {
		super();
		this.haltbarkeit = haltbarkeit;
		this.preis = preis;
		this.name = name;
	}
	
	public Gemuese() {
		
	}
	@Override
	public int compareTo(Gemuese g) {
		return this.getName().compareTo(g.getName());
	}
	

}
