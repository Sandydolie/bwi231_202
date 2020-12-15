package de.hs_lu.o2s.tutorium.tut11;

public class AppTestBruecke {

	public static void main(String[] args) {
		Bruecke b1 = new Bruecke();
		Klappbruecke k1 = new Klappbruecke();
		Haengebruecke h1 = new Haengebruecke();
		Klappbruecke k2 = k1;
		k1.setLaenge(100.5);
		b1.setLaenge(30.25);
		h1.setLaenge(101.5);
		k2.setMaxTragkraft(750);
		
//		System.out.println(((Bruecke) h1).compareTo(k1));
//		//1.5
//		System.out.println(k1.compareTo(k2));
//		//0, weshalb? Aufgabe 8
//		System.out.println(k2.compareTo(new Klappbruecke()));
//		//100.5
		

	}

}
