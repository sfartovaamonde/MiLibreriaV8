package libreriasv8;

import javax.swing.*;

public class Ventana {
    private String msg;
    public Ventana(String msg) {
        this.msg = msg;
    }
    public void visualiza(){
        JOptionPane.showMessageDialog(null,"Sale por un ventana" + msg);
    }
}
