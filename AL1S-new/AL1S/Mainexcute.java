package AL1S;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Mainexcute {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

        String path = "src/files/Pixel_time2.wav";
        MakeSound.getPath(path);
        Thread th1 = new Thread(new MakeSound());
        th1.run();

        Runnable r2 = new Menu();
        Thread th2 = new Thread(r2);

        th2.run();

        // BGM 한번 트는 스레드




    }
}
