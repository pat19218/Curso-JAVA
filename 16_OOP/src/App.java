import java.io.Serial;

import javax.sound.sampled.SourceDataLine;

/*
 * Author: Cris Pat
 * Tema:   Programacion orientada a objetos
 * 
 */




public class App {
    public static void main(String[] args) throws Exception {
       
        //-------------------------------------------------------------------------------------------------------------------------------
        //   ¿Qué es?
        //-------------------------------------------------------------------------------------------------------------------------------

        /*
         * La POO es una forma especial de programar, mas cercana a como expresariamos
         * las cosas en la vida real que otros tipos de programacion
         * 
         * ¿Como se piensa en objetos?
         * 
         * ---Carro---
         * 
         *  --> atributos (caracteristicas / propiedades)
         *      -->color
         *      --> tamaño, etc
         * 
         *  --> metodos (acciones que puede hacer mi objeto)
         *      -->Se mueve
         *      --> Frena
         * 
         * --------------------------------------------------------------------------------------
         *      Clases en POO
         * --------------------------------------------------------------------------------------
         * Una clase es un conjunto de objetos con caracteristicas similares
         * 
         * NORMA:
         *      cuando creo una clase este debe de ir Con primera letra mayuscula y singular
         *
         *  Apartir de las clases se pueden creer varios objetos
         * 
         * 
         *  
         */

        //-------------------------------------------------------------------------------------------------------------------------------
        //Creacion de clases
        //-------------------------------------------------------------------------------------------------------------------------------
        
        // *modificador de acceso* class *nombre de la clase* {}
        
        // public class Carro{
        //     public void init(){

        //     }
        // }
        
        //-------------------------------------------------------------------------------------------------------------------------------
        //Creacion de objeto
        //-------------------------------------------------------------------------------------------------------------------------------
        
        // *Nombre clase* *Nombre del objeto* = new *constructores* ();       "new" sirve para crear objetos
        
        Carro carrito1 = new Carro();
                

    }
}
