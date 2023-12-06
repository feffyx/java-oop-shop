package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // Create a Prodotto object
        Prodotto prodotto = new Prodotto("Laptop", "Powerful laptop", 800.0, 22.0);

        // Display initial details
        System.out.println("Initial Details:");
        displayProductDetails(prodotto);

        // Update product details
        prodotto.setNome("Desktop");
        prodotto.setPrezzo(1200.0);
        prodotto.setIva(18.0);

        // Display updated details
        System.out.println("\nUpdated Details:");
        displayProductDetails(prodotto);
    }

    // Utility method to display product details
    private static void displayProductDetails(Prodotto prodotto) {
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("Iva: " + prodotto.getIva() + "%");
        System.out.println("Prezzo con Iva: " + prodotto.getPrezzoConIva());
        System.out.println("Nome Esteso: " + prodotto.getNomeEsteso());
        System.out.println("-------------------------------");
    }
}
