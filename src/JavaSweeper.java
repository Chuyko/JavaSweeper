import javax.swing.*;
import java.awt.*;

public class JavaSweeper extends JFrame {
    JPanel panel;

    public static void main(String[] args) {
        new JavaSweeper().setVisible(true);
    }

    public JavaSweeper() {
        panel = new JPanel();
        setPreferredSize(new Dimension(500, 300));
        add(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setVisible(true);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }
}
