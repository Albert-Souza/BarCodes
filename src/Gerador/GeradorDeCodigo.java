/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerador;

/**
 *
 * @author albert
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GeradorDeCodigo {
    private static int width;
    private static int height = 10;
    private static BufferedImage barCode;
    private static String path;
    
    public static void build(String decimal, boolean[] barBoolean) {
        width = barBoolean.length;

        barCode = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D draw = barCode.createGraphics();
        
        draw.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        draw.setColor(Color.BLACK);
        for (int i = 0; i <= width - 1; i++) {
            if (barBoolean[i]) {
                draw.drawLine(i, 0, i, height);
            } 
        }
        draw.dispose();                  
    }
    
    public static void save(String decimal, BufferedImage barCode) {
        File directory = new File("BarCodes");
        if (!directory.exists()) {
            directory.mkdirs(); // Cria diretórios pais e o diretório especificado
        }
        
        File output = new File("BarCodes/" + decimal + ".png");
        
        try {
            ImageIO.write(barCode, "png", output);
            path = directory.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }     
    }   
       
    public static BufferedImage getBarCode() {
        return barCode;
    }
    
    public static String getPath() {
        return path;
    }
}
