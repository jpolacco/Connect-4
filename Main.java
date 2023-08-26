import javax.swing.*;
import java.awt.*;

/**
 * Runnable Main class that does the JFrame stuff
 *
 * @author _________
 * @version _______
 */
public class Main {
    public static int WIDTH = 600;
    public static int HEIGHT = 600;
    private Connect4 connect4;

    public void run() {
        JFrame window = new JFrame("Connect 4");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        connect4 = new Connect4();
        window.add(connect4, BorderLayout.CENTER);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}