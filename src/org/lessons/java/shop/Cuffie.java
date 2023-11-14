package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean isWireless;

	public Cuffie(String nome, String descrizione, float prezzo, int iva, String colore, boolean isWireless) {
		super(nome, descrizione, prezzo, iva);
		setColore(colore);
		setWireless(isWireless);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	public float discountedPrice() {
		if(!this.isWireless) return (float) (super.prezzoConIva() - (super.prezzoConIva() * 0.07));
		return super.discountedPrice();
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "Colore: " + this.colore + "\n"
				+ "E' wireless?: " + (this.isWireless ? "Si" : "No");
	}

}
