/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leitor;

/**
 *
 * @author albert
 */
public class ConversorBinDec {
    public static String gerar(boolean[] barBoolean) {
        String decimal = converter(barBoolean);
        String zeros = "";
        for (int i = 0; i <= 8-1 - decimal.length(); i++) {
            zeros += 0;
        }

        return zeros + decimal;
    }

    private static String converter(boolean[] barBoolean) {
        int decimal = 0;
        for (int i = barBoolean.length - 1; i >= 0; i--) {
            if (barBoolean[i]) {
                decimal += Math.pow(2, barBoolean.length-1 - i);
            }
        }

        return "" + decimal;
    }
}
