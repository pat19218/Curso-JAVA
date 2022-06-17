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
        double extendidos;
        String cadena;
        char letra;

        System.out.println("Dame un numero: ");
        
        //numero = entrada.nextInt();
        //decimales = entrada.nextFloat();
        //extendidos = entrada.nextDouble();
        //cadena = entrada.next(); // Guarda la cadena de entrada hasta que encuentra un espacio, el resto lo obvea
        //cadena = entrada.nextLine();
        letra = entrada.next().charAt(0); //charAT, me guardar el caracter que yo le indico, en este caso el primero

        //System.out.println("El numero es: " + numero);
        //System.out.println("El numero es: " + decimales);
        //System.out.println("El texto es: " + cadena);
        System.out.println("El texto es: " + letra);
        



    }
}
