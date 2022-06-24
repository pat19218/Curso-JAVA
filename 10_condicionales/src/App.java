import javax.swing.JOptionPane;

/*
 * Autor: Cristhofer Patzan
 * Tema: Condicionales
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dato"));

        if (numero == dato){
            
            JOptionPane.showMessageDialog(null, "Has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }else{

            JOptionPane.showMessageDialog(null, "NO has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }


    }
}
