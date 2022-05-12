package com.mycompany.g03_ejercicio_03_01;

/**
 *
 * @author USER
 */
public class Principal {

    public static void main(String[] args) {

        var v1 = new Ventana1("Border Layout");
        var v2 = new Ventana2("GridLayout");
        var v3 = new Ventana3("FlowLayout");
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);

    }
}
