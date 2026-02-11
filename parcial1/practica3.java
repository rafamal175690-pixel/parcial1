/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
/**
 *
 * @author TUF
 */
public class practica3 {
    private static String nombre;//cadena dd caracteres
    private static float estatura;
    private static char sexo;
    private static int edad;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //3 formas de leer datos
        nombre = JOptionPane.showInputDialog("Escribe el nombre");
        //casting conversion implicita y/o explicita
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Escribe la estaura de una persona"));
        sexo = JOptionPane.showInputDialog("Escribe el sexo de una persona").charAt(0);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad de una persona"));
        JOptionPane.showMessageDialog(null, "El nombre es: "+nombre+"\n"+
                " y su estatura es: "+estatura+"\n"
                +"y el sexo: "+sexo+"\n"
                        + "y su edad: "+edad);
        
    }
    
}