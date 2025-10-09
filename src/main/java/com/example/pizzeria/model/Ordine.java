package com.example.pizzeria.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private String stato; // "in corso", "pronto", "servito"
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<Prodotto> elementi = new ArrayList<>();
    private double costoCoperto;

    public Ordine(int numeroOrdine, Tavolo tavolo, int numeroCoperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.numeroCoperti = numeroCoperti;
        this.costoCoperto = costoCoperto;
        this.stato = "in corso";
        this.oraAcquisizione = LocalDateTime.now();
    }

    public void aggiungiElemento(Prodotto prodotto) {
        elementi.add(prodotto);
    }

    public double calcolaTotale() {
        double totaleElementi = elementi.stream()
                .mapToDouble(Prodotto::getPrezzo)
                .sum();
        return totaleElementi + (numeroCoperti * costoCoperto);
    }

    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }

    @Override
    public String toString() {
        return "Ordine #" + numeroOrdine + " - Tavolo " + tavolo.getNumero() + "\n" +
                "Coperti: " + numeroCoperti + "\n" +
                "Stato: " + stato + "\n" +
                "Ora: " + oraAcquisizione + "\n" +
                "Totale: €" + String.format("%.2f", calcolaTotale());
    }
}
