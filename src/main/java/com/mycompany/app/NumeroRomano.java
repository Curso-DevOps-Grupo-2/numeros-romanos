package com.mycompany.app;

public class NumeroRomano {

    public static String decToRomano(int numero) {

        int i, miles, centenas, decenas, unidades;
        String numeroRomano = "";

        // obtenemos cada cifra
        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        // unidad de mil
        for (i = 1; i <= miles; i++) {
            numeroRomano = numeroRomano + "M";
        }

        // centena
        if (centenas == 9) {
            numeroRomano = numeroRomano + "CM";
        } else if (centenas >= 5) {
            numeroRomano = numeroRomano + "D";
            for (i = 6; i <= centenas; i++) {
                numeroRomano = numeroRomano + "C";
            }
        } else if (centenas == 4) {
            numeroRomano = numeroRomano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                numeroRomano = numeroRomano + "C";
            }
        }

        // decena
        if (decenas == 9) {
            numeroRomano = numeroRomano + "XC";
        } else if (decenas >= 5) {
            numeroRomano = numeroRomano + "L";
            for (i = 6; i <= decenas; i++) {
                numeroRomano = numeroRomano + "X";
            }
        } else if (decenas == 4) {
            numeroRomano = numeroRomano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                numeroRomano = numeroRomano + "X";
            }
        }

        // unidad
        if (unidades == 9) {
            numeroRomano = numeroRomano + "IX";
        } else if (unidades >= 5) {
            numeroRomano = numeroRomano + "V";
            for (i = 6; i <= unidades; i++) {
                numeroRomano = numeroRomano + "I";
            }
        } else if (unidades == 4) {
            numeroRomano = numeroRomano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                numeroRomano = numeroRomano + "I";
            }
        }
        return numeroRomano;
    }
}
