package AL1S;

import java.io.IOException;

public class ForthStage {
    public void run(UnitHuman.PlayerChara alice) throws InterruptedException, IOException {
        // 이전 음악 종료
        MakeSound.stopMusic();

        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_70.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();


        // 스테이지 스크립트 불러오기
        FileText txt = new FileText();
        String path = "src/files/ForthStage_Script1.txt";

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();

        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        //스크립트 실행
        txt.start(path);

        System.out.println("아니 당신은...?");

        Quiz forth = new Quiz();

    }
}
