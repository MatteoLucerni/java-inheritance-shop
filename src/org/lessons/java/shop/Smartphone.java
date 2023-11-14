package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String imeiCode;
	private int memory;

	public Smartphone(String nome, String descrizione, float prezzo, int iva, String imeiCode, int memory) {
		super(nome, descrizione, prezzo, iva);
		setImeiCode(imeiCode);
		setMemory(memory);
	}

	public String getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public float discountedPrice() {
		if(this.memory < 32) return (float) (super.prezzoConIva() - (super.prezzoConIva() * 0.05));
		return super.discountedPrice();
	}
	
	public String toString() {
		return super.toString() + "\n"
				+ "Codice IMEI: " + this.imeiCode + "\n"
				+ "memoria: " + this.memory + "gb";
	}

}
