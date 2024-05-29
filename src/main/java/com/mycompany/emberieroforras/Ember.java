package com.mycompany.emberieroforras;

public class Ember {
    private String nev;
    private int szuletesiEv;
    private String foglalkozas; // Opcionális

    public Ember(String nev, int szuletesiEv, String foglalkozas) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
        this.foglalkozas = foglalkozas;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        int jelenlegiEv = java.time.Year.now().getValue();
        return jelenlegiEv - szuletesiEv;
    }

    public String bemutatkozas() {
        return "Szia, a nevem " + nev + " és " + getKor() + " éves vagyok. " +
               (foglalkozas != null && !foglalkozas.isEmpty() ? "A foglalkozásom: " + foglalkozas : "");
    }
}