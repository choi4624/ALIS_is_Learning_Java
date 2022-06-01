package AL1S;

import javax.sound.sampled.*;
import java.io.File;

public class effect {
    public void soundEffect(String path) throws InterruptedException {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;

        bgm = new File(path);
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


    }

}
