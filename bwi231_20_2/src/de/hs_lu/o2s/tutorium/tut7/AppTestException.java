package de.hs_lu.o2s.tutorium.tut7;

public class AppTestException {
	
	public static void main(String[] args){
		Object o = new Object();
		Kreuzfahrtschiff k1 = new Kreuzfahrtschiff();
		try {
			k1.setPassagiere(200);
		} catch (ZuVielePersonenException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		k1.setAnzPool(2);
		try {
			k1.compareTo(o);
		} catch (ClassCastException e) {
			System.out.println("Es wird kein Kreuzfahrtschiff übergeben. Fehler!");
			System.out.println(e.getMessage());
		} catch (Exception d1) {
			
		}
		Boot b1 = new Boot();
		try {
			b1.setPassagiere(10);
		}catch (ZuVielePersonenException e) {
			System.out.println(e.getMessage());
		}
		try {
			k1.compareTo(b1);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(k1.compareTo(b1));
		
	}
	


}
