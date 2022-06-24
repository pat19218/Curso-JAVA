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


        //---------------------------------------------------------------------------------------------------------------------------------------
        //      IF, ELSE, ELSE IF
        //---------------------------------------------------------------------------------------------------------------------------------------


        /*
         *  == : Igual a
         *  != : Distinto de
         *  <  : menor que
         *  >  : mayor que
         *  <= : menor o igual que
         *  >= : mayor o igual que
         * 
         */

        if (numero == dato){
            
            JOptionPane.showMessageDialog(null, "Has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }else if (numero == 4 || numero == 6){

            JOptionPane.showMessageDialog(null, "Has estado cerca", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);


        }else{

            JOptionPane.showMessageDialog(null, "NO has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }


    }
}
