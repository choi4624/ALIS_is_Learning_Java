package AL1S;

import javax.swing.*;
import java.awt.*;

public class ImagePop extends JFrame implements Runnable {
    public ImagePop() {
        setTitle("charcter");
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        page1.setLayout(null);
        page1.setBounds(0,0,400,400);
        add(page1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static JPanel page1=new JPanel(){
        Image background = new ImageIcon(ImagePop.class.getResource("../files/alice.png")).getImage();

        public void paint(Graphics g){
            g.drawImage(background, 0,0, null);
        }
    };

    @Override
    public void run() {

    }
}
