import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class CreatingWindows{
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();
        jf1.setTitle("Windows one");
        jf1.setLocation(200,200);
        jf1.setSize(600,400);

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.RED);
        jf1.add(jp1);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JFrame jf2 = new JFrame();
        jf1.setTitle("Windows two");
        jf1.setLocation(200,200);
        jf1.setSize(600,400);

        JPanel jp2 = new JPanel();
        jp1.setBackground(Color.GREEN);
        jf1.add(jp2);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JFrame jf3 = new JFrame();
        jf1.setTitle("Windows three");
        jf1.setLocation(200,200);
        jf1.setSize(600,400);

        JPanel jp3 = new JPanel();
        jp1.setBackground(Color.BLUE);
        jf1.add(jp3);
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}