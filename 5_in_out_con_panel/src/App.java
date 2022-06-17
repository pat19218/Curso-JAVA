import javax.swing.JOptionPane;

/*
 * Autor: Cristhofer Patzan
 * Tema: entradas y salidas sin usar la terminal
 * 
 */

public class App {

    public static void main(String[] args) throws Exception {
        
        String texto;
        char letra;
        int entero;
        double deci;

        texto = JOptionPane.showInputDialog("mete un mensaje"); //lo ingresado al cuadro lo guardo como caracteres

        letra = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0); // se le indica que solo queremos el 1ro

        //entero = JOptionPane.showInputDialog("Ingresa un numero entero") //al ser int la variable no se da la conversion por lo que 
        //                                                                  se convierte a tipo entero--> Integer.parseInt()

        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero"));

        deci = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un decimal"));

        //Ahora lo mostrare en pantalla lo guardado

        JOptionPane.showMessageDialog(null, "El texto es: " + texto, "Intento1", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra, "Intento2", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El entero es: " + entero, "Intento3", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El decimal es: " + deci, "Intento4", JOptionPane.PLAIN_MESSAGE);

                

    }
}
