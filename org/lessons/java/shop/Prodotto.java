package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private final int codice;
    private final String nome;
    private final String descrizione;
    private final double prezzo;
    private final double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Il prezzo non può essere negativo.");
        }
        if (iva < 0) {
            throw new IllegalArgumentException("L'IVA non può essere negativa.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere vuoto o nullo.");
        }

        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }



    public double getIva() {
        return iva;
    }



    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    private int generateRandomCode() {
        return new Random().nextInt(1000) + 1;
    }
}
