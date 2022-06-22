import java.util.Scanner;       //Entrada por consola
import javax.swing.JOptionPane; //Entrada por ventana

/*
 * Autor: Cristhofer Patzan
 * Tema: Programa que calcule la sumas de las calificaciones
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        float nota1, nota2, nota3;
        float sumatoria, promedio;

        /*por ventana

        // solicito las notas usando un cuadro
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la primer nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la segunda nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la tercer nota: "));

        sumatoria = nota1 + nota2 + nota3;
        promedio = sumatoria / 3;
         //Ahora lo mostrare en pantalla lo guardado
         JOptionPane.showMessageDialog(null, "La sumatoria de puntos es: : " + sumatoria
         + "\n  y el promedio es de: " + promedio, "NOTAS", JOptionPane.PLAIN_MESSAGE);
        
         */

         //por consola

         Scanner entrada = new Scanner(System.in);

         System.out.println("Ingresa 3 calificaciones separadas por un espacio: ");

         //Almaceno las notas
         nota1 = entrada.nextFloat();
         nota2 = entrada.nextFloat();
         nota3 = entrada.nextFloat();

         sumatoria = nota1 + nota2 + nota3;
         promedio = sumatoria / 3;

        System.out.println(" \n La sumatoria de puntos es: : " + sumatoria
        + "\n  y el promedio es de: " + promedio);
        
    }
}
