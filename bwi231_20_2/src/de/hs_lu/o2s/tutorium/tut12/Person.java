package de.hs_lu.o2s.tutorium.tut12;

public class Person {
	
	private int alter;
	private boolean isMaennlich;
	private double gehalt;
	
	
	public Person() {
		super();
	}
	public Person(int alter, boolean isMaennlich, double gehalt) {
		super();
		this.alter = alter;
		this.isMaennlich = isMaennlich;
		this.gehalt = gehalt;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isMaennlich() {
		return isMaennlich;
	}
	public void setMaennlich(boolean isMaennlich) {
		this.isMaennlich = isMaennlich;
	}
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	
	public String toString() {
		if (this.isMaennlich() == true){
		return this.getClass().getSimpleName() + " ist Männlich, " + this.getAlter() 
			+ " Jahre alt und verdient " + this.getGehalt() + " Euro im Monat.";
		}else return this.getClass().getSimpleName() + " ist Weiblich, " + this.getAlter() 
		+ " Jahre alt und verdient " + this.getGehalt() + " Euro im Monat.";
	
	}

}
