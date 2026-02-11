/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class practica5 {
    public static void main (String[] args){       
           /* operadores aritmeticos 
            
            */
    Scanner leer = new Scanner (System.in);
    double numero;
    double resultado=0.0;
      System.out.println("Escribe un numero que se elevara al cuadrado");
      numero = leer.nextFloat();
      System.out.println("escribe la potencia");
       double potencia = leer.nextDouble();
       resultado = Math.pow(numero,potencia);
     System.out.println("Resultado:"+resultado );
              }   
            
}