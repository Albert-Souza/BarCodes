/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerador;

/**
 *
 * @author albert
 */
public class ConversorDecBin {
    public static String gerar(int decimal) {
        String binario = converter(decimal);
        String zeros = "";
        for (int i = 0; i <= maxBinLenght()-1 - binario.length(); i++) {
            zeros += 0;
        }

        return zeros + binario;
    }

    public static boolean[] gerarBool(String binario) {
        boolean[] barBoolean = new boolean[binario.length()];
        for (int i = 0; i <= binario.length() - 1 ; i++) {
            if (binario.charAt(i) == '1') {
                barBoolean[i] = true;
            }
            else {
                barBoolean[i] = false;
            }
        }

        return barBoolean;
    }

    private static String converter(int decimal) {
        String inverseBinario = "";

        int quociente = decimal;
        int resto;
        while (quociente != 0) {
            resto = quociente % 2;
            quociente = quociente / 2;
            inverseBinario += resto;
        }

        String binario = invertString(inverseBinario);
        
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
        int lenght = converter(99999999).length();
        return lenght;
    }
}
