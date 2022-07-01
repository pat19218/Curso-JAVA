import java.util.Scanner;

/*
 * Author: Cris Pat
 * Tema:   vectores, arreglos/arrays
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeros = new int[3];
        
        //forma clasica
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;

        for (int i =0; i<3; i++){
            System.out.println("El numero es " +numeros[i] + " en la posicion " + i );
        }

        // forma corta
        int [] numero = {55, 66, 12};

        for (int i =0; i<3; i++){
            System.out.println("El numero es " +numero[i] + " en la posicion " + i );
        }
                
        /*
         * For ( *Tipo de variable* *variable de recorrido* : *mi arreglo* ){}
         */
        String[] names = {"Julio", "Marta", "Maria", "Pedro", "Juana"};

        for (String i:names){
            System.out.println("El name es: " + i);
        }

        //Ejercicio

        /*
         * Insertar 5 datos ordenandos de forma ascendente para un arreglo 
         * posterior a ello ingresar numeros aleatorios y ubicarlos en la posición correspondiente
         * 
         */

        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10];
        int dato, lugar=0, j=0;
        boolean creciente = true;


        do{
            for(int i=0; i<5; i++){ //lleno vector

                System.out.println((i+1) + ". Ingresa numero: ");
                arreglo[i] = entrada.nextInt();
        
            }
            //compruebo orden
            for(int i = 0; i<4; i++){
                
                if(arreglo[i] < arreglo[i+1]){   //creciente
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){  //decreciente
                    creciente = false;
                    break;
                }
            }

            if(!creciente){
                System.out.println( "El arreglo no esta ordenado en forma creciente, vuelva a digitarlos \n ");
            }

        }while (!creciente);

        System.out.println( "Datos a insertar: ");

        dato = entrada.nextInt();
        

        while(arreglo[j] < dato && j < 5 ){ //reviso en que posición va el número

            lugar++;
            j++;

        }

        //traslado las ubicaciones necesarias

        for(int i = 4; i >= lugar; i--){

            arreglo[i+1] = arreglo[i];
        }

        //insertamos el dato ingresado
        arreglo[lugar] = dato;

        System.out.println("El arreglo queda asi: \n");
        for(int i=0 ; i<6 ; i++){
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println(" ");
    }
}
