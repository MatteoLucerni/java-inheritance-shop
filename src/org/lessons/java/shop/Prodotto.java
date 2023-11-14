package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	public Prodotto(String nome,String descrizione,float prezzo,int iva) {
		setCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return this.codice;
	}
	
	private void setCodice() {
		Random rnd = new Random();
		this.codice = rnd.nextInt(99,99999);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public float getiva() {
		return this.iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public float prezzoConIva() {
		float mora = this.prezzo * this.iva / 100;
		
		return this.prezzo + mora;
	}
	
	public String nomeEsteso() {
		return this.codice + "-" + this.nome;
	}
	
	public String codiceToOttoCifre() {
		String numberToString = Integer.toString(this.codice);
		while(numberToString.length() < 8) {
			numberToString = '0' + numberToString;
		}
		return numberToString;
	}
	
	public String toString() {
		return "Prodotto" + "\n"
				+ "Codice: " + this.codice + "\n"
				+ "Nome: " + this.nome + "\n"
				+ "Desc: " + this.descrizione + "\n"
				+ "Prezzo: " + this.prezzo + "€\n"
				+ "Prezzo con iva: " + this.prezzoConIva() + "€\n"
				+ "Iva: " + this.iva + "%\n"
				+ "Nome esteso: " + this.nomeEsteso();
	}
	
}
