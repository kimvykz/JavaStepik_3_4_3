import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Program {



    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        panel.setBackground(Color.WHITE);

        panel.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = panel.getGraphics();
                g.setColor(Color.GRAY);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}

