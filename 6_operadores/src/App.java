import java.util.Scanner;

/*
 * Autor: Cristhofer Patzan
 * Tema: OPERADORES
 * 
 */


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entra = new Scanner(System.in);

        float in1, in2;
        float sum, res, mul, div, resto;
        float a, b, c, d, e;

        System.out.print("Ingrese dos numeros: ");

        in1 = entra.nextFloat();    //La lectura se produce al leer un espacio entre los numeros o
        in2 = entra.nextFloat();    //Ingresar un numero, luego, "ENTER" y se ingresa el segundo numero

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      Operadores aritmeticos simples
        //---------------------------------------------------------------------------------------------------------------------------------------
        sum = in1 + in2;
        res = in1 - in2;
        mul = in1 * in2;
        div = in1 / in2;
        resto = in1 % in2;

        //---------------------------------------------------------------------------------------------------------------------------------------
        //     Operadores Aritméticos combinados con asignación
        //---------------------------------------------------------------------------------------------------------------------------------------

        a = sum; b = res; c = mul; d = div; e = resto;

        a += 2; // --> a = a + 2
        b -= 2;
        c *= 2;
        d /= 2;
        e %= 2;
        
        //---------------------------------------------------------------------------------------------------------------------------------------
        //     Operadores Aritméticos de incremento/decremento
        //---------------------------------------------------------------------------------------------------------------------------------------

        byte x = 10, y; 

        x++; //--> incremento en 1 el valor de x (subfijo)
        x--; //--> decremento en 1 el valor de x (subfijo)

        y = x++;
        System.out.println("El dato sería: " + y + " variable fija = " + x); 
                // dato curioso por el orden de ejecución para este ejemplo 
                 // y = 10 pero x = 11, 
                 // Esto sucede ya que primero se asigna el valor y luego se incrementa x siendo la siguiente estructura
                 // y = x;   
                 // x++;
                 //Para solucionar esto invertimos el orden de ejecución dando como resultado la siguiente linea
        
        y = ++x; //(prefijo)
        System.out.println("El dato sería: " + y + " variable fija = " + x); 

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + res);
        System.out.println("La multiplicacion es: " + mul);
        System.out.println("La division es: " + div);
        System.out.println("La residuo es: " + resto);
        System.out.println("");
        System.out.println("La suma es: " + a);
        System.out.println("La resta es: " + b);
        System.out.println("La multiplicacion es: " + c);
        System.out.println("La division es: " + d);
        System.out.println("La residuo es: " + e);
        System.out.println("");


    }
}
