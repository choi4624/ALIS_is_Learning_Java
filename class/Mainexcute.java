package AL1S;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Mainexcute {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        Runnable r2 = new Menu();
        Runnable r1 = new MakeSound();
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);


        th2.start();
        th1.start();


    }
}
