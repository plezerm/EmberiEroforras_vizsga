package com.mycompany.emberieroforras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmberGUI extends javax.swing.JFrame implements ActionListener {

    private JTextField nevField, evField, foglalkozasField;
    private JLabel bemutatkozasLabel;
    private EmberController controller;

    public EmberGUI(EmberController controller) {
        this.controller = controller;
        initComponents();
        setTitle("Ember Bemutatkozás");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2)); 

        add(new JLabel("Név:"));
        nevField = new JTextField();
        add(nevField);

        add(new JLabel("Születési év:"));
        evField = new JTextField();
        add(evField);

        add(new JLabel("Foglalkozás:"));
        foglalkozasField = new JTextField();
        add(foglalkozasField);

        JButton bemutatkozasButton = new JButton("Bemutatkozás");
        bemutatkozasButton.addActionListener(this);
        add(bemutatkozasButton);

        bemutatkozasLabel = new JLabel();
        add(bemutatkozasLabel);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nev = nevField.getText();
        int ev;
        try {
            ev = Integer.parseInt(evField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Hibás év formátum!", "Hiba", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String foglalkozas = foglalkozasField.getText();
        controller.bemutatkozas(nev, ev, foglalkozas); 
    }

    public void setBemutatkozas(String bemutatkozas) {
        bemutatkozasLabel.setText(bemutatkozas);
    }

    public void setController(EmberController controller) {
        this.controller = controller;
    }

    // initComponents metódus a NetBeans által generált kóddal
    private void initComponents() {
        // ... (A NetBeans GUI Builder által generált kód itt lesz)
    }
}
