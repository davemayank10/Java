import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pra_40 extends JPanel {
    private Color color;

    public Pra_40() {
        color = Color.BLUE;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                color = Color.RED;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                color = Color.BLUE;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height) - 200;
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pra_40 circle = new Pra_40();
        frame.add(circle);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
