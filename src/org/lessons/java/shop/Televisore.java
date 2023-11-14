package org.lessons.java.shop;

public class Televisore extends Prodotto {
	
	private int dimensione;
	private boolean isSmart;

	public Televisore(String nome, String descrizione, float prezzo, int iva, int dimensione, boolean isSmart) {
		super(nome, descrizione, prezzo, iva);
		setDimensione(dimensione);
		setSmart(isSmart);
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	public float discountedPrice() {
		if(!this.isSmart) return (float) (super.prezzoConIva() - (super.prezzoConIva() * 0.1));
		return super.discountedPrice();
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "Dimensione: " + this.dimensione + " pollici\n"
				+ "E' smart?: " + (this.isSmart ? "Si" : "No");
	}
	
}
