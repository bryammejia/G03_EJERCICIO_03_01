package com.mycompany.g03_ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Ventana1 extends JFrame {

    public JPanel panel;

    public Ventana1(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(250, 160));
        this.setLocation(new Point(10, 10));
        iniciarComponentes();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void colocarPaneles() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        this.panel.setLayout(new BorderLayout());
    }

    public void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();

    }

    public void colocarBotones() {
        JButton boton1 = new JButton();
        boton1.setText("Button 1");
        panel.add(boton1, BorderLayout.NORTH);
        boton1.setEnabled(true);

        JButton boton2 = new JButton();
        boton2.setText("2");
        panel.add(boton2, BorderLayout.CENTER);
        boton2.setEnabled(true);

        JButton boton3 = new JButton();
        boton3.setText("Button 5");
        panel.add(boton3, BorderLayout.EAST);
        boton2.setEnabled(true);

        JButton boton4 = new JButton();
        boton4.setText("Button 3");
        panel.add(boton4, BorderLayout.WEST);
        boton2.setEnabled(true);

        JButton boton5 = new JButton();
        boton5.setText("Long-Named Button 4");
        boton5.setEnabled(true);
        panel.add(boton5, BorderLayout.SOUTH);

    }

}
