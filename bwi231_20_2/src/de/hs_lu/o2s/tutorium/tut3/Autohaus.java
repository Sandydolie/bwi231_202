package de.hs_lu.o2s.tutorium.tut3;

import java.util.Arrays;

public class Autohaus {
	
	private Auto[] autolist;
	private Person[] personlist;
	private Haus[] gebaeude;
	
	
	
	public Autohaus() {
		this.autolist = new Auto[0];
		this.personlist = new Person[0];
		this.gebaeude = new Haus[0];
		
	}



	public Autohaus(Auto[] autolist, Person[] personlist, Haus[] gebaeude) {
		super();
		this.autolist = autolist;
		this.personlist = personlist;
		this.gebaeude = gebaeude;
	}



	public Auto[] getAutolist() {
		return autolist;
	}



	public void setAutolist(Auto[] autolist) {
		this.autolist = autolist;
	}



	public Person[] getPersonlist() {
		return personlist;
	}



	public void setPersonlist(Person[] personlist) {
		this.personlist = personlist;
	}



	public Haus[] getGebaeude() {
		return gebaeude;
	}



	public void setGebaeude(Haus[] gebaeude) {
		this.gebaeude = gebaeude;
	}



	@Override
	public String toString() {
//		return "Autohaus [autolist=" + Arrays.toString(autolist) + ", personlist=" + Arrays.toString(personlist)
//				+ ", gebaeude=" + Arrays.toString(gebaeude) + "]";
		
		String s = this.getClass().getSimpleName() + " mit den Autos" + "\n";
//		for(int i = 0; i < this.autolist.length; i++) {
//			Auto a = this.autolist[i];
//			s += a.toString();
//		}
		for(Auto a: autolist) {
			s += a.toString() + "\n";
			
		}
		s += " und den Mitarbeitern" + "\n";
		for(Person p: personlist) {
			s += p.toString() + "\n";
		}
		s += " und den Gebaeuden" + "\n";
		for(Haus h: gebaeude) {
			s += h.toString() + "\n";
			
		}
		
		return s;
	}
	
	
	
	
	
	

}
