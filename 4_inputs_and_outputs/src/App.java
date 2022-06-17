import java.util.Scanner;

/*
 * Autor: Cristhofer Patzan
 * Tema: recibir datos y sacar datos
 * 
 */

//import java.util.Scanner; //libreria util para datos


public class App {
    public static void main(String[] args) throws Exception {
        
        //Instancio un objeto llamado entrada

        Scanner entrada = new Scanner(System.in);

        int numero;
        float decimales;
        System.out.println("Dame un numero: ");
        
        //numero = entrada.nextInt();
        decimales = entrada.nextFloat();

        //System.out.println("El numero es: " + numero);
        System.out.println("El numero es: " + decimales);



    }
}
