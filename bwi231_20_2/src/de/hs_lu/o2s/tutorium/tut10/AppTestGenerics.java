package de.hs_lu.o2s.tutorium.tut10;

import java.util.HashMap;

public class AppTestGenerics {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		Obst o1 = new Obst("17.12", 2.99, "Aepfel");
		Gemuese g1 = new Gemuese("11.12", 1.44, "Bohnen");
		h1.put(o1.getName(), o1);
		h1.put(g1.getName(), g1);
		

	}

}
