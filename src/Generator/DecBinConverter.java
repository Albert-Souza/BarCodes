/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generator;

/**
 *
 * @author albert
 */
public class DecBinConverter {
    public static String generate(int decimal) {
        String binary = convert(decimal);
        String zeros = "";
        for (int i = 0; i <= maxBinLenght()-1 - binary.length(); i++) {
            zeros += 0;
        }

        return zeros + binary;
    }

    public static boolean[] generateBool(String binary) {
        boolean[] barBoolean = new boolean[binary.length()];
        for (int i = 0; i <= binary.length() - 1 ; i++) {
            if (binary.charAt(i) == '1') {
                barBoolean[i] = true;
            }
            else {
                barBoolean[i] = false;
            }
        }

        return barBoolean;
    }

    private static String convert(int decimal) {
        String inverseBinary = "";

        int quotient = decimal;
        int rest;
        while (quotient != 0) {
            rest = quotient % 2;
            quotient = quotient / 2;
            inverseBinary += rest;
        }

        String binario = invertString(inverseBinary);
        
        return binario;
    }

    private static String invertString(String invStr) {
        String invertedStr = "";
        for (int i = invStr.length() - 1; i >= 0; i--) {
            invertedStr += invStr.charAt(i);
        }

        return invertedStr;
    }

    private static int maxBinLenght() {
        int lenght = convert(99999999).length();
        return lenght;
    }
}
