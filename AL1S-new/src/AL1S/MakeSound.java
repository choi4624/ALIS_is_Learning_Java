package AL1S;

import javax.sound.sampled.*;
import java.io.File;

public class MakeSound implements Runnable, SoundFile {
    static String path;
    private final int BUFFER_SIZE = 128000;
    private File soundFile;
    private AudioInputStream audioStream;
    private AudioFormat audioFormat;
    private SourceDataLine sourceLine;
    static Clip clip = null;

public static void getPath(String path){
    MakeSound.path = path;
}

    /**
     */
    public void playSound() throws InterruptedException {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;

        bgm = new File(MakeSound.path);


        try {
            stream = AudioSystem.getAudioInputStream(bgm);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip)AudioSystem.getLine(info);
            clip.open(stream);
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-20.0f);
            clip.start();
                    }
        catch (Exception e){
            System.out.print("err :" + e);

        }

    }

    static public void stopMusic() {
        clip.stop();
        //clip.flush();


    }

    static public void startMusic(){
        clip.start();
    }

    static public void killMusic(){
        clip.stop();
        clip.close();
    }
    @Override
    public void run() {


        try {
            playSound();

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("thread interrupt");
            stopMusic();
        }

    }
}


