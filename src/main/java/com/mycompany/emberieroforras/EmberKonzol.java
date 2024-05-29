package com.mycompany.emberieroforras;

import java.util.Scanner;

public class EmberKonzol {
    private EmberController controller;

    public EmberKonzol(EmberController controller) {
        this.controller = controller;
    }

    public void inditas() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmberi Erőforrás Menedzsment - Konzol Nézet");
            System.out.println("1. Új ember felvétele");
            System.out.println("2. Kilépés");
            System.out.print("Válassz menüpontot: ");

            int valasztas = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (valasztas) {
                case 1:
                    System.out.print("Név: ");
                    String nev = scanner.nextLine();
                    System.out.print("Születési év: ");
                    int ev = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Foglalkozás: ");
                    String foglalkozas = scanner.nextLine();
                    controller.bemutatkozas(nev, ev, foglalkozas);
                    break;
                case 2:
                    System.out.println("Kilépés...");
                    System.exit(0);
                default:
                    System.out.println("Érvénytelen választás!");
            }
        }
    }

    public void kiirBemutatkozas(String bemutatkozas) {
        System.out.println(bemutatkozas);
    }

    public void setController(EmberController controller) {
        this.controller = controller;
    }
}
