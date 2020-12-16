package de.hs_lu.o2s.v10.bestellung;

public class Lieferung extends BusinessDocument {

	static int currentNumberLieferung = 1;
	static final String prefixLieferung = "L-";
	
	public Lieferung(Bestellung bestellung) {
		super();
		
		// �bertrage s�mtliche Positionen aus der Bestellung in 
		// die Lieferung
		for (Position pos : bestellung.getPos()) {
			try {
				this.addPosition(pos);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.setKunde(bestellung.getKunde());
		
		this.setNr(currentNumberLieferung++);
	}
	
	@Override
	public BusinessDocument triggerNextStep() throws Exception {
		// erzeuge eine Rechnung f�r den n�chsten Schritt
				
		if(this.isReady()) {
			Rechnung rechnung = new Rechnung(this);
			return rechnung;
		}
		else {
			throw new Exception(this.getClass().getSimpleName() + " ist noch nicht fertig. N�chster Schritt noch nicht m�glich.");
		}
	}
	
	public void druckeLieferschein() {
		System.out.println();
		System.out.println("---------------- DRUCK LIEFERSCHEIN --------------------");
		System.out.println(this);
		System.out.println("Lieferanschrift: " + this.getKunde().getLieferAdresse());
		System.out.println("---------------- ENDE DRUCK LIEFERSCHEIN ---------------");
	}
	
	public void setReady(boolean ready) {
		super.setReady(ready);
		this.druckeLieferschein();
	}
	
	public String getPrefix() {
		return prefixLieferung;
	}

}
