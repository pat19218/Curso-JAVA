import javax.swing.JOptionPane;

/*
 * Autor: Cristhofer Patzan
 * Tema: Condicionales
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dato del 0 al 10"));


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
         *  Para comparar si la letra es mayuscula ver: 
         *  https://www.youtube.com/watch?v=L-9ZsgY7zNc&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K&index=22
         */

         /*

        if (numero == dato){
            
            JOptionPane.showMessageDialog(null, "Has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }else if (numero == 4 || numero == 6){

            JOptionPane.showMessageDialog(null, "Has estado cerca", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);


        }else{

            JOptionPane.showMessageDialog(null, "NO has acertado al numero secreto! ", "Juego de numero",
            JOptionPane.PLAIN_MESSAGE);

        }*/

        //---------------------------------------------------------------------------------------------------------------------------------------
        //      SWITCH-CASE
        //---------------------------------------------------------------------------------------------------------------------------------------

        switch(numero){
            case 0:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Es el numero " + numero, "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero fuera de rango", "numeros", JOptionPane.PLAIN_MESSAGE);
                break;
        }



    }
}
