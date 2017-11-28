import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MainFrame(){
    init();
    }
    private Container cp;
    private JButton bstart = new JButton("Start");
    private JButton bstop = new JButton("Stop");
    private JButton bexit = new JButton("Exit");
    private JButton bsend = new JButton("Send");
    private JTextArea jta  = new JTextArea();
    private JLabel jlbport = new JLabel("Port");
    private JLabel jlbIP = new JLabel("Ueser IP");
    private JTextField jtf = new JTextField();
    private void init(){
    cp = this.getContentPane();
    
    }
}
