/*
 * Autor: Cristhofer Patzan
 * Tema: tipos de datos primitivos
 * 
 */


public class App {
    public static void main(String[] args) throws Exception {
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO ENTERO
        //---------------------------------------------------------------------------------------------------------------------------------------
        byte A;     // 8 bits, de -128 a 127
        A = 0;
        System.out.println("el entero es: " + A);

        short B;     // 16 bits, de -32,768 a 32,767
        B = 1;
        System.out.println("el entero es: " + B);

        int C;     // 32 bits, de -2,147,483,648 a 2,147,483,647
        C = 2;
        System.out.println("el entero es: " + C);

        int D;     // 64 bits, de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        D = 3;
        System.out.println("el entero es: " + D);

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO DECIMAL
        //---------------------------------------------------------------------------------------------------------------------------------------

        float E;    //32 bits, de 1.4e^-45 a 1.3.4e^38
        E = 1.12f;  //IMPORTANTE agregar la "f" al final para indicarle que es del tipo float
        System.out.println("El decimal es: " + E);

        double F;    //64 bits, de 4.9e^-324 a 1.8.4e^308
        F = 0.0012;
        System.out.println("El decimal es: " + F);

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO CARACTER
        //---------------------------------------------------------------------------------------------------------------------------------------

        char G;
        G = 'A';
        System.out.println("El caracter es: " + G);

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      VARIABLES DE TIPO LOGICO
        //---------------------------------------------------------------------------------------------------------------------------------------

        boolean I;
        I = false; // solo puede ser true o false
        System.out.println("El dato booleano es: " + I);
        
    }
}
