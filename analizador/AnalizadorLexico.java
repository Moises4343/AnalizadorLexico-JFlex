/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.io.File;

/**
 *
 * @author 52961
 */
public class AnalizadorLexico {
    public static void main(String[] args) {
        String ruta = "C:/Users/52961/Documents/NetBeansProjects/AnalizadorLexico/src/analizador/Lexer.flex";
        crearLexer(ruta);
    }
    public static void crearLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
