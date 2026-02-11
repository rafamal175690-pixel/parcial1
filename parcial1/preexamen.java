
import java.util.Scanner;
import javax.swing.JOptionPane;

 //hacer un programa que pida 5 numeros enteros positivos, esto quiere decir que no se puedan almacenar numeros negativos.
// a continuacion se realizaran las siguientes operaciones
// 1.- se calculara el producto de los primeros tres numeros 
// 2.- se elevara el cuat
// 3.-Se calcula el promedio de los ultimas tres numeros.
// los resultados de cada operacion se mostrara en solo mensaje en un joptionpane

/**
 *
 * @author TUF
 */
public class preexamen {
     static int a,b,c,d,e;
    static int producto;
    static double potencia;
    static float promedio;
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Escribe 5 numeros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        e = leer.nextInt();
        producto = a*b*c;
        potencia = Math.pow(d, e);
        promedio= ((float)e+(float)d+(float)c)/3;
        JOptionPane.showMessageDialog(null,"Producto: "+producto+"\n"+
                "Potencia: "+potencia+"\n"+"Promedio:"+promedio);
             
    }
 
}
