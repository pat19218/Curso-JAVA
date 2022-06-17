/*
 * Autor: Cristhofer Patzan
 * Tema: tipos de datos no primitivos
 * 
 */


public class App {

    public static void main(String[] args) throws Exception {
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO ENTERO
        //---------------------------------------------------------------------------------------------------------------------------------------

        Integer a = null;   //null indica que en la memoria se utilizara ese pedazo para la variable "a" pero que inicialmente no tiene 
                            //ningun valor, siendo así solo un espacio ocupado en memoria pero que esta vacio.

        System.out.println("El dato es: " + a);

        /*
         * Estos datos no primitivos tienen metodos, los cuales son caracteristicas especiales que se pueden trabajar con la variable
         * 
         * Para usar los metodos basta con poner un punto seguido del nombre de la variable, ej:
         *       a.
         * De esto se hablara en POO
         */

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO CARACTER
        //---------------------------------------------------------------------------------------------------------------------------------------
        String  b = "Teixto ajja :3" ;
        //b.length()
        System.out.println("el string es: " + b);
    }

}
