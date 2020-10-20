package de.hs_lu.o2s.tutorium.tut4;

public class Restaurant extends Haus {
	
	private double sitzflaeche;
	private int maxKunden;
	
	public Restaurant(String strasse) {
		super(strasse);
	}

	public Restaurant() {
		super();
	}

	public Restaurant(String strasse, int etagen, int einwohner) {
		super(strasse, etagen, einwohner);

	}

	public Restaurant(String strasse, int etagen) {
		super(strasse, etagen);
		
	}

	public Restaurant(double sitzflaeche, int maxKunden) {
		super();
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
	}

	public Restaurant(double sitzflaeche) {
		super();
		this.sitzflaeche = sitzflaeche;
	}
	
	public Restaurant(String strasse, int etagen, int einwohner, double sitzflaeche, int maxKunden) {
		super(strasse, etagen, einwohner);
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
	}
	
	
	
	

}
