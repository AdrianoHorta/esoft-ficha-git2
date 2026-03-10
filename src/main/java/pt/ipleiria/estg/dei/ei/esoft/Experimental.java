package pt.ipleiria.estg.dei.ei.esoft;
import javax.swing.*;
import java.awt.*;
public class Experimental extends JFrame {


    private JPanel painelPrincipal2;
    public Experimental() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(painelPrincipal2);
        pack();
    }
    public static void main(String[] args) {
        new Experimental().setVisible(true);
    }
}
