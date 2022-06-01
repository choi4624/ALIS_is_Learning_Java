package AL1S;

import java.io.*;

public class FirstStage {


    public void run(UnitHuman.PlayerChara alice) throws IOException, InterruptedException {
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
        String path = "src/files/FirstStage_Script1.txt";

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();

        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        //스크립트 실행
        txt.start(path);

        System.out.println("일단 스텟을 많이 올려야 할 것 같다. ");
        System.out.println("마력 충전... +20% ");

        alice.MaxHP =+ 2500+alice.MaxHP;
        alice.statValue[1] =+ 500;
        System.out.println("방어력 상승"+alice.statValue[1]);

        UnitHuman basic = new UnitHuman().Create(4000, 1000,"물어뜯는 기계 강아지", "칼","소형","null", 450 );
        Battle first = new Battle();

        first.blacksuit1(basic, alice, sound);




    }
}
