package de.hs_lu.o2s.tutorium.tut2;

public class AppHaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Haus h1 = new Haus();
		Haus h2 = new Haus("Ernst-Boehe-Strasse 4");
		Haus h3 = new Haus("Hausstrasse", 3);
		Haus h4 = new Haus("Heinigstrasse", 6, 20);
		Haus h5 = h1;
		
		h1.setStrasse("Ludwigstrasse");
		h5.setEinwohner(30);
		
		System.out.println(h1.toString());
		h1.druckMich();
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println(h4.toString());
		
		
		System.out.println(h5.toString());
	}

}
