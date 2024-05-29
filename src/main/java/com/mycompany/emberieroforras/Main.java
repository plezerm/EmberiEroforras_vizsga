/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emberieroforras;

/**
 *
 * @author pleze
 */
public class Main {

    public static void main(String[] args) {
        // Modell létrehozása (üres adatokkal inicializálva)
        Ember model = new Ember("", 0, null);

        // Nézetek létrehozása
        EmberGUI view1 = new EmberGUI(null); // A controller-t később állítjuk be
        EmberKonzol view2 = new EmberKonzol(null);

        // Controller létrehozása és összekapcsolása a modell és a nézetekkel
        EmberController controller = new EmberController(model, view1, view2);
        view1.setController(controller); // Controller beállítása a GUI nézetben
        view2.setController(controller);

        // Mindkét nézet láthatóvá tétele
        view1.setVisible(true); 

        // Alkalmazás indítása (konzol nézettel)
        view2.inditas(); 
    }
}