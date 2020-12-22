package de.hs_lu.o2s.tutorium.tut12;

public class Mitarbeiter extends Person {
	
	private double gehalt;
	private String lizenzen;
	private boolean clizenz;

	public Mitarbeiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mitarbeiter(int alter, boolean isMaennlich, double gehalt) {
		super(alter, isMaennlich, gehalt);
		// TODO Auto-generated constructor stub
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getLizenzen() {
		return lizenzen;
	}

	public void setLizenzen(String lizenzen) {
		this.lizenzen = lizenzen;
	}

	public boolean isClizenz() {
		return clizenz;
	}

	public void setClizenz(boolean clizenz) {
		this.clizenz = clizenz;
	}
	
	
	
	

}
