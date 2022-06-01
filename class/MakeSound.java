package AL1S;

import javax.sound.sampled.*;
import java.io.File;

public class MakeSound implements Runnable {

    private final int BUFFER_SIZE = 128000;
    private File soundFile;
    private AudioInputStream audioStream;
    private AudioFormat audioFormat;
    private SourceDataLine sourceLine;


    /**
     */
    public void playSound() throws InterruptedException {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;

        bgm = new File("C:\\Users\\choi4\\OneDrive\\Documents\\eclipse\\AL1S-new\\src\\files\\Pixel_time2.wav");
        Clip clip;

        try {
            stream = AudioSystem.getAudioInputStream(bgm);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip)AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e){
            System.out.print("err :" + e);
        }
        Thread.sleep(200000);

    }

    @Override
    public void run() {
        try {
            playSound();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}