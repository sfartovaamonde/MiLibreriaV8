package libreriasv8;

import javax.swing.JOptionPane;

/**
 * Esta clase es un producto
 */
public class Ventana implements InterfaceMetodosComunes {
    private String msg;

    /**
     * Constructor
     * @param msg mensaje que queremos imprimir
     */
    public Ventana(String msg) {
        this.msg = msg;
    }

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza(){
        JOptionPane.showMessageDialog(null,"Sale por un ventana " + msg);
    }
}
