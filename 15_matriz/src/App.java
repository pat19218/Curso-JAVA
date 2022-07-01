import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Author: Cris Pat
 * Tema:   Matrices
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        //-------------------------------------------------------------------------------------------------------------------------------
        //   
        //-------------------------------------------------------------------------------------------------------------------------------

        int matriz [][] = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        int nFilas, nColumnas;

        for(int i=0; i<3; i++){         //numero de filas
            for(int j=0; j<3; j++){     //numero de columnas
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        
        Scanner entrada = new Scanner(System.in);

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        matriz = new int[nFilas][nColumnas];

        for(int i=0; i<nFilas; i++){         //numero de filas
            for(int j=0; j<nColumnas; j++){     //numero de columnas
                
                System.out.print("Llena la matriz en [" + i + "]" +" [" + j + "] "  );
                matriz[i][j] = entrada.nextInt();
                
            }
            
        }

        System.out.println("\n la matriz es \n");

        for(int i=0; i<3; i++){         //numero de filas
            for(int j=0; j<3; j++){     //numero de columnas
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
