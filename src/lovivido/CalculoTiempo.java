package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class CalculoTiempo{

    public CalculoTiempo(){
    }

    public void CalcularTiempo(){
        String n;
        String e;
        int m;
        int d;
        int h;
        int a;
        n=JOptionPane.showInputDialog("Escriba su nombre: ");
        e=JOptionPane.showInputDialog("Escriba su edad: ");
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
