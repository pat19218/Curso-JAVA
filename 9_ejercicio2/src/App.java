import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Autor: Cristhofer Patzan
 * Tema: Ejercicio 2, calculadora de sueldo
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        float dinero, horas, dias;
        float total;
        
        /*
        //por ventana
        // solicito los datos usando un cuadro
        dinero = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad que te pagan por hora: "));
        horas = Float.parseFloat(JOptionPane.showInputDialog("Ingresa las horas que trabajas al día: "));
        dias = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de dias que trabajas: "));
        
        total = dinero * horas * dias;
        
         //Ahora lo mostrare en pantalla lo guardado
         JOptionPane.showMessageDialog(null, "Por trabajar " + horas
         + " horas al dia por " + dias + " dias \n siendo el pago de Q" + dinero + " por hora"
         + "\n Has ganado: Q" +total, "Calculadora de sueldo", JOptionPane.PLAIN_MESSAGE);
        */


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el pago por hora, las horas trabajadas y los días que has trabajado: ");

        dinero = entrada.nextFloat();
        horas = entrada.nextFloat();
        dias = entrada.nextFloat();

        total = dinero * horas * dias;

        System.out.println("Trabajando " + horas + " horas al dia, durante " + dias + " dias, con un pago por hora de Q" + dinero + 
        "\n has ganado Q" + total);

    }
}
