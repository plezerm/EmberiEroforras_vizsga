package com.mycompany.emberieroforras;

public class EmberController {
    private Ember model;
    private EmberGUI view1;
    private EmberKonzol view2;

    public EmberController(Ember model, EmberGUI view1, EmberKonzol view2) {
        this.model = model;
        this.view1 = view1;
        this.view2 = view2;
    }

    public void bemutatkozas(String nev, int ev, String foglalkozas) {
        model = new Ember(nev, ev, foglalkozas);
        String bemutatkozas = model.bemutatkozas();
        view1.setBemutatkozas(bemutatkozas);
        view2.kiirBemutatkozas(bemutatkozas);
    }
}