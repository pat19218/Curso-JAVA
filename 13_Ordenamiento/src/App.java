import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Author: Cris Pat
 * Tema:   Formas de ordenar vectores, arreglos/arrays
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        //-------------------------------------------------------------------------------------------------------------------------------
        //   Metodo burbuja
        //-------------------------------------------------------------------------------------------------------------------------------

        /* Es un sencillo algoritmo de ordenamiento.Funciona revisando cada
            elemento de la lista que vaaser ordenada con el siguiente,
            intercambiándolos de posición si están en el orden equivocado.Es
            necesario revisar varias veces toda la lista hasta que no se necesiten más
            intercambios,lo cual significa que la lista está ordenada.
         */

        Scanner entrada=new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));

        arreglo = new int [nElementos];

        for(int i=0; i<nElementos; i++){
            System.out.println((i+1) + " Ingresa un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //METODO BURBUJA

        for(int i=0; i<(nElementos-1); i++){
            for(int j=0; j<(nElementos-1); j++){
                
                if(arreglo[j] > arreglo[j+1]){   //Si numero actual es mayor al numero siguiente
                    aux = arreglo[j];            //Si cumple se hace un swap entre la posicion actual y la siguiente
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        // Mostrando el arreglo ordenado en forma creciente
        System.out.print("\nArreglo ordenado en forma creciente:");
        
        for(int i=0; i<nElementos; i++){
            System.out.println(arreglo[i] + "-");
         }
         

         System.out.println(" ");
    }
}
