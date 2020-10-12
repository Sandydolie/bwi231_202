package de.hs_lu.o2s.tutorium.tut2;

import junit.framework.TestCase;

public class TestHaus extends TestCase {
	
	public void testEtagen() {
		Haus postgebaeude = new Haus("Ernst-Boehe-Strasse", 4);
		assertEquals(4, postgebaeude.getEtagen());
		
		String strasse = "ErNst-BoEhe-StraSsE";
		assertEquals(strasse.toLowerCase(), postgebaeude.getStrasse().toLowerCase());	
	}
	
	public void testVerkaufspreis() {
		Haus h1 = new Haus();
		h1.setGrundstuecksFlaeche(500.0);
//		double verkaufspreis = h1.berechneVerkaufspreis(200.00);
//		assertEquals((500.0*200.0), verkaufspreis);
		assertEquals((500.0*200.0), h1.berechneVerkaufspreis(200.0));
	}

}
