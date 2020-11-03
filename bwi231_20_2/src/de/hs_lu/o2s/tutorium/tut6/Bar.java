package de.hs_lu.o2s.tutorium.tut6;

public interface Bar {
	
	public double generateSteuererklärung();
	//Steuer ist unterschiedlich bei Disko und Restaurant (in unserer Vorstellung)
	//Disko arbeitet mit 19% Steuer, während Restaurant mit 7% arbeitet.
	//Am Ende wird noch eine Gewerbesteuer abgezogen, die bei beiden Klassen gleich ist (15%)
	
	public void addGetraenke(String[] getraenk);
	//Bei dem Restaurant sollen die neu hinzugefügten Getränke als letztes im Array auftauchen
	//Bei der Disko als erstes.
	
	
	
	

}
