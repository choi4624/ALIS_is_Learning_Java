package AL1S;

import java.io.IOException;

public class SixthStage {


    public void run(UnitHuman.PlayerChara alice) throws IOException, InterruptedException {
        MakeSound.stopMusic();

        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_68.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();
        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        // 스테이지 스크립트 불러오기
        FileText txt = new FileText();
        String path = "src/files/SixthStage_Script1.txt";
        txt.start(path);

        Quiz quiz6 = new Quiz();
        int result = quiz6.SixthQuiz();

        if (result == -1) {
            System.out.println("안타까운 일이네요, 문제를 틀리다니. 다시 오세요.");
            return;
        } else if (result == 0)
            System.out.println("이 스테이지를 더 진행할 자격이 있군요. ");


        sound.soundEffect(soundPath);
        path = "src/files/SixthStage_Script2.txt";
        txt.start(path);

        UnitHuman basic = new UnitHuman().Create(250000, 10000, "CHESED", "out of control", "초대형", "시스템 해킹", 10000);
        Battle chesed = new Battle();

        chesed.sixth(basic, alice, sound);


    }
}