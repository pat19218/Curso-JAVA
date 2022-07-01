import javax.swing.JOptionPane;

/*
 * Author: Cris Pat
 * Tema:   Busqueda secuencial
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        //-------------------------------------------------------------------------------------------------------------------------------
        //   
        //-------------------------------------------------------------------------------------------------------------------------------

        int arreglo[] = {5,1,4,2,3};
        int dato;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog( "Dato a buscar? "));

        //busqueda
        int i = 0;

        while(i<5 && !bandera){ //para este caso i < 5 debido a que son 5 espacios en el array
            
            bandera = (arreglo[i] == dato) ? true:false ; //https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Operators/Conditional_Operator
            i++;
        }

        if(!bandera){

            JOptionPane.showMessageDialog(null, "El numero no esta en el arreglo", 
            "Busqueda", JOptionPane.PLAIN_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, "El numero esta en el arreglo, en la posicion: " + (i-1),
            "Busqueda", JOptionPane.PLAIN_MESSAGE);            
        }
        

    }
}
