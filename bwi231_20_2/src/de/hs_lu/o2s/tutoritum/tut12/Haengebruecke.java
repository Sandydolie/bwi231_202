package de.hs_lu.o2s.tutoritum.tut12;

public class Haengebruecke extends Bruecke{
	
	private double maxBelastung;
	
	public Haengebruecke() {
		
	}

	public Haengebruecke(double laenge, int baujahr, int letzteRenovierung) {
		super(laenge, baujahr, letzteRenovierung);
	}
	
	public String toString() {
		String s = super.toString();
		s += "Die maximale Belastung beträgt " + this.maxBelastung +  " Tonnen.";
		return s;
	}

	@Override
	public boolean maxLast(double gewicht) {
		if(gewicht > this.maxBelastung) return true;
		else return false;
	}

	
	public int compareTo(Bruecke o) {
		if(super.compareTo(o) == 0) {
			if (this.maxBelastung > ((Haengebruecke) o).maxBelastung) return 1;
			else if (this.maxBelastung == ((Haengebruecke) o).maxBelastung) return 0;
			else if (this.maxBelastung < ((Haengebruecke) o).maxBelastung) return -1;
			else return 0;
		}else return super.compareTo(o);
	}
	

}
