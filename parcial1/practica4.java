

import java.util.Scanner;

public class practica4 {
    //Constantes
    static int d=18;
    static float e=1.2f;
    static float l=1.05f;
    static int pesos;
    static float resultado=0.0f;
    
    public static void main(String[] args){
    
    Scanner numeros = new Scanner(System.in);
    System.out.println("Escribe una cantidad en pesos");
    pesos = numeros.nextInt();
    resultado = (float)pesos/ d;
    System.out.println("Los dolares son:"+resultado);
    resultado= resultado/ e;
    System.out.println("Los euros son:"+resultado);
    resultado= resultado/ 1;
    System.out.println("Las libras son:"+resultado);
    
    }
}
