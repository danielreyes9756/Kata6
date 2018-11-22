/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Main {
    
    //Control E borra linea actual
    //Control derecha o izquierda salto de palabra
    //Inicio Fin principio o final de una palabra
    //escribir psvm + tabular public static void main.
    //escribir fore + tab for each
    //escribir sout + tab System.out.println
    //alt enter sobre objeto asigna variable tambien sirve para crear metodos default
    //shift control i borra imports no usados
    
    public static void main(String[] args) {
        Main main = new Main();
        Iterator<String> list = main.execute(args);
    }

    private Iterator<String> execute(String[] args) {
        return new Iterator<String>() {
            private int index =0;
            @Override
            public boolean hasNext() {
                return index < args.length;
            }

            @Override
            public String next() {
                return args[index++];
            }
        };
    }

    

   
}