/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene el metodo main del programa para calcular el tiempo que
 * lleva vivo una persona en meses, dias y horas
 *
 * @author Arturo 6037
 *
 */
public class LoVivido{

    /**
     * El metodo main se encarga crear un objeto de la clase CalculoTiempo y de
     * llamar a los metodos de la clase CalculoTiempo
     *
     * @param args
     *
     */
    public static void main(String[] args){
        CalculoTiempo t=new CalculoTiempo();
        String nombre=t.recogerNombre();
        String edad=t.recogerEdad();
        t.calcularTiempo(nombre, edad);
    }

}
