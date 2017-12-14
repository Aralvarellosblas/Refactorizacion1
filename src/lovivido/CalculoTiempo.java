package lovivido;

import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de calcular el tiempo vivido en distintas unidades
 * (meses, dias y horas)
 *
 * @author Arturo 6037
 */
public class CalculoTiempo{

    /**
     * Constructor por defecto de la clase CalculoTiempo
     */
    public CalculoTiempo(){
    }

    /**
     * Recoje el nombre que se introduce por teclado
     *
     * @return Devuelve el nombre
     */
    public String recogerNombre(){
        String n;
        n=JOptionPane.showInputDialog("Escriba su nombre: ");
        return n;
    }

    /**
     * Recoje el edad que se introduce por teclado
     *
     * @return Devuelve la edad
     */
    public String recogerEdad(){
        String e;
        e=JOptionPane.showInputDialog("Escriba su edad: ");
        return e;
    }

    /**
     * Permite calcular el tiempo que lleva vivido una persona al recibir los
     * parametros del nombre y la edad y lo muestra en pantalla
     *
     * @param n Recibe el nombre para mostrar
     * @param e Recibe la edad y la usa para calcular el tiempo
     */
    public void calcularTiempo(String n, String e){
        int m, d, h, a;

        a=Integer.parseInt(e);

        m=(a*12);
        d=(a*365);
        h=(d*24);

        JOptionPane.showMessageDialog(null, "Meses: "+m, "Numero de meses vividos de "+n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "D\u00edas: "+d, "Numero de d\u00edas vividos de "+n, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: "+h, "Numero de horas vividos de "+n, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
