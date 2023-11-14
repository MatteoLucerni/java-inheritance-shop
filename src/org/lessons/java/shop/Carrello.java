package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Prodotto[] products = new Prodotto[20];
        
        int itemsCounter = 0;
        
        System.out.println("Hai la tessera fedeltà? (si / no)");
        String hasCard = in.nextLine();

        while (true) {
            System.out.println("Vuoi aggiungere un elemento? (si / no)");
            String addAnother = in.nextLine();

            if (addAnother.equals("si")) {
                System.out.println("Che prodotto vuoi aggiungere? Ogni numero corrisponde ad un prodotto: 1 = smartphone / 2 = televisore / 3 = cuffie");
                int productType = in.nextInt();
                in.nextLine();
                
                System.out.println("Inserisci il nome: ");
                String nome = in.nextLine();
                
                System.out.println("Inserisci la descrizione: ");
                String desc = in.nextLine();
                
                System.out.println("Inserisci il prezzo: ");
                float prezzo = in.nextFloat();
                
                System.out.println("Inserisci l'iva: ");
                int iva = in.nextInt();
                in.nextLine();
               

                switch (productType) {
                    case 1: {
                    	System.out.println("Inserisci il codice IMEI: ");
                        String imeiCode = in.nextLine();
                        
                        System.out.println("Inserisci la memoria: ");
                        int memory = in.nextInt();
                        in.nextLine();
                        
                        Smartphone p = new Smartphone(nome, desc, prezzo, iva, imeiCode, memory);
                        
                        products[itemsCounter] = p;
                        itemsCounter++;
                        break;
                    }
                    case 2: {
                    	System.out.println("Inserisci la dimensione in pollici: ");
                        int dimensione = in.nextInt();
                        in.nextLine();
                        
                        System.out.println("E' smart? (si / no) ");
                        String userIsSmart = in.nextLine();
                        
                        boolean isSmart = userIsSmart.equals("si") ? true : false;
                        
                        Televisore p = new Televisore(nome, desc, prezzo, iva, dimensione, isSmart);
                        products[itemsCounter] = p;
                        itemsCounter++;
                        break;
                    }
                    case 3: {
                    	System.out.println("Inserisci il colore: ");
                        String colore = in.nextLine();
                        
                        System.out.println("E' wireless? (si / no) ");
                        String userIsWireless = in.nextLine();
                        
                        boolean isWireless = userIsWireless.equals("si") ? true : false;
                        
                        Cuffie p = new Cuffie(nome, desc, prezzo, iva, colore, isWireless);
                        products[itemsCounter] = p;
                        itemsCounter++;
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Unexpected value: " + productType);
                }
            } else {
            	float totalPrice = 0;
            	for (int i=0; i<products.length; i++) {
                    if (products[i] != null) {
                    	if(hasCard.equals("si")) {
                    		totalPrice += products[i].discountedPrice();
                    	} else {
                    		totalPrice += products[i].prezzoConIva();
                    	}
                    	System.out.println("-----------------------------------");
                        System.out.println(products[i].toString());
                        System.out.println("-----------------------------------");
                    }
                }
            	System.out.println("Prezzo totale: " + totalPrice + "€");
            	break;
            }
        }
        
    }
}
