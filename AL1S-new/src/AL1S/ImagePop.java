package AL1S;

import javax.swing.*;
import java.awt.*;

public class ImagePop extends JFrame implements Runnable {


    private static String newpath;

    public  ImagePop() {

        setTitle("Character Field");
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        page1.setLayout(null);
        page1.setBounds(0,0,400,400);
        add(page1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static String imgPath(String path){

        ImagePop.newpath = path;
        return path;
    }

    JPanel page1=new JPanel(){
        Image background = new ImageIcon(ImagePop.class.getResource(newpath)).getImage();

        public void paint(Graphics g){
            g.drawImage(background, 0,0, null);
        }
    };


    @Override
    public void run() {

    }

    public void remove() {
        setVisible(false);
    }
}
