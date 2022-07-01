import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * Autor: Cristhofer Patzan
 * Tema:  Bucles
 * 
 */


public class App {
    public static void main(String[] args) throws Exception {
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //      While --> solo se ejecuta si cumple
        //---------------------------------------------------------------------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);

        int i = 1, contador;

        System.out.println( "Ingresa un numero: ");
        contador = entrada.nextInt();
        
        while (i < contador){
            System.out.println("El numero " + contador + " es mayor a " + i);
            i += 2;
        }
        //---------------------------------------------------------------------------------------------------------------------------------------
        //   Do  While --> Se va a ejecutar almenos una vez
        //---------------------------------------------------------------------------------------------------------------------------------------
        i -= 15; 
        do{
            System.out.println("El dato es " + i);
            i += 2;

        }while( i <= 15);
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //   For--> Se ejecuta una determinada cantidad de veces
        //   for(variable de inicio; condicion; aumento/decremento){}
        //---------------------------------------------------------------------------------------------------------------------------------------
        
        for (int a=0; a<13; a++){
            System.out.println("El numero es: " + a);
        }

        

    }
}


