
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
public class practica7 {
    static int n1;
  static float n2;
    
    public static void main(String[] args) throws IOException {
        ///Scanner para numeros
        ///BufferedReader letras
        //IOptionPane letras
        Scanner leer= new Scanner(System.in);
        BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));
        
        int a = leer.nextInt();
        int b = leer.nextInt();
        float c = leer.nextFloat();
        double e = leer.nextDouble();
        String nombre = escribir.readLine();
        System.out.println("Resultado"+a); //concatenaciÃ³n o adiciÃ³n
       // double resultado = ((double)a+(double)b+(double)c+e)/4;
        float resultado = ((float)a+(float)b+c+(float)e)/4;
        double c1= Math.sqrt(c);//raiz cuadrada
        double c2 = Math.pow(e, 2); //Elevar potencia al cuadrado
        
        n2 = leer.nextFloat();     
    }
      
}
