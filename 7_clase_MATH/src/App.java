/*
 * Autor: Cristhofer Patzan
 * Tema: clase MATH
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        double raiz = Math.sqrt(9); //solo funciona con double
        System.out.println("El resultado es: " + raiz);
        //si quiero mayor espacio en memoria y estoy seguro que la raiz es entera entonces lo indexo
        //int raiz1 = (int) Math.sqrt(9);

        double base = 5;
        double exponente = 2;
        double potencia = Math.pow(base, exponente);
        System.out.println("El resultado es: " + potencia);

        double numero = 4.56;
        long resultado = Math.round(numero); //la función round tiene dos opciones una para redondear de tipo double a long
                                               //y otra para redondear de float a int
        System.out.println("El resultado es: " + resultado);

        numero = Math.random();
        System.out.println("El resultado es: " + numero);
    }
}
