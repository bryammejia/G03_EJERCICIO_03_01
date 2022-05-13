package com.mycompany.g03_ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Ventana4 extends JFrame {
    
    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    
    public Ventana4(String title) {
        super(title);
        this.setSize(300, 200);
        this.setLocation(700, 10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes() {
        this.iniciarPanel();
        this.iniciarBandera();
        this.colocarbotones();
        //this.iniciarEtiquetas();
    }
    
    public void iniciarPanel() {
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new BorderLayout());
        
    }
    
    public void colocarbotones(){
        
        JButton boton1 = new JButton();
        boton1.setText("Button 1");
        boton1.setEnabled(true);
        jPanel1.add(boton1);


        JButton boton3 = new JButton();
        boton3.setText("Button 3");
        boton3.setEnabled(true);
        jPanel1.add(boton3);

        JButton boton4 = new JButton();
        boton4.setText("Long-Named Button 4");
        boton4.setEnabled(true);
        jPanel1.add(boton4);

        JButton boton5 = new JButton();
        boton5.setText("Button 5");
        boton5.setEnabled(true);
        jPanel1.add(boton5);
        
        
        jPanel1.add(boton1, BorderLayout.NORTH);
        jPanel1.add(jPanelBandera, BorderLayout.CENTER);
        jPanel1.add(boton3, BorderLayout.WEST);
        jPanel1.add(boton4, BorderLayout.SOUTH);
        jPanel1.add(boton5, BorderLayout.EAST);
    }
    
    public void iniciarBandera() {
   
        this.jPanelBandera = new JPanel();
        this.jPanelBandera.setLayout(new GridLayout(49,49));
        
        this.jLabelBanderaList = new ArrayList<>();
        for (var i = 0; i < 49; i++)
            this.jLabelBanderaList.add(new JLabel());
        
        this.jLabelBanderaList.get(0).setBackground(Color.RED);
        this.jLabelBanderaList.get(1).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(2).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(3).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(4).setBackground(Color.RED);
        this.jLabelBanderaList.get(5).setBackground(Color.RED);
        this.jLabelBanderaList.get(6).setBackground(Color.RED);
        this.jLabelBanderaList.get(7).setBackground(Color.RED);
        this.jLabelBanderaList.get(8).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(9).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(10).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(11).setBackground(Color.RED);
        this.jLabelBanderaList.get(12).setBackground(Color.RED);
        this.jLabelBanderaList.get(13).setBackground(Color.RED);
        this.jLabelBanderaList.get(14).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(15).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(16).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(17).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(18).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(19).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(20).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(21).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(22).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(24).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(25).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(26).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(27).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(28).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(29).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(30).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(31).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(32).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(33).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(34).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(35).setBackground(Color.RED);
        this.jLabelBanderaList.get(36).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(37).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(38).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(39).setBackground(Color.RED);
        this.jLabelBanderaList.get(40).setBackground(Color.RED);
        this.jLabelBanderaList.get(41).setBackground(Color.RED);
        this.jLabelBanderaList.get(42).setBackground(Color.RED);
        this.jLabelBanderaList.get(43).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(44).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(45).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(46).setBackground(Color.RED);
        this.jLabelBanderaList.get(47).setBackground(Color.RED);
        this.jLabelBanderaList.get(48).setBackground(Color.RED);
        
        for (var i = 0; i < 49; i++) {
            this.jPanelBandera.add(this.jLabelBanderaList.get(i));
            this.jLabelBanderaList.get(i).setOpaque(true);
        }
    }
    
}
