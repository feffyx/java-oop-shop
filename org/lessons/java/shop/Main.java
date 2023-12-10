package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        try {

            Prodotto prodottoValido = new Prodotto("Laptop", "Powerful laptop", 800.0, 22.0);




            System.out.println("Dettagli Prodotto Valido:");
            displayProductDetails(prodottoValido);


        } catch (IllegalArgumentException e) {
            System.out.println("Errore durante la creazione del prodotto: " + e.getMessage());
        }
    }


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
