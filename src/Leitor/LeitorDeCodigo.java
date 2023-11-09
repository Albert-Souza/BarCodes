/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leitor;

import java.awt.image.BufferedImage;

/**
 *
 * @author albert
 */
public class LeitorDeCodigo { 
    public static boolean[] read(BufferedImage barCode) {
        boolean[] barBoolean = new boolean[27];

        for (int i = 0; i<= barBoolean.length - 1; i++) {
            int rgb = barCode.getRGB(i, 0);
            if (rgb != 0) {
                barBoolean[i] = true;
            }
            else {
                barBoolean[i] = false;
            }
        }
        
        return barBoolean;
    }
}
