package pt.ipleiria.estg.dei.ei.esoft;
import javax.swing.*;
import java.awt.*;
public class HelloWorld extends JFrame {


    private JPanel painelPrincipal;
    private JLabel lblMensagem3;
    public HelloWorld() {
        setMinimumSize(new Dimension(300, 200));
        setContentPane(painelPrincipal);
        lblMensagem3.setText("O Horta teve aquiasdsadsdf");
        setContentPane(lblMensagem3);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
