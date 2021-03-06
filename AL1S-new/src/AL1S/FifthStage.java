package AL1S;

import java.io.IOException;

public class FifthStage {
    public void run(UnitHuman.PlayerChara alice) throws InterruptedException, IOException {
        // 이전 음악 종료
        MakeSound.stopMusic();

        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_71.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();


        // 스테이지 스크립트 불러오기
        FileText txt = new FileText();
        String path = "src/files/FifthStage_Script1.txt";

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();

        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        //스크립트 실행
        txt.start(path);

        System.out.println("점점 강해지는게 느껴져..!");
        System.out.println("그래도 이 녀석을 상대하려면..");
        System.out.println("방어력을 증가시켜야 더 잘 버틸 수 있겠어..!");

        alice.statValue[1] = 100+alice.statValue[1];
        System.out.println("방어력 상승!" + alice.statValue[1]);

        UnitHuman basic = new UnitHuman().Create(4900, 1350, "기괴한 샴쌍둥이", "총", "대형", "null", 480);
        UnitHuman basic2 = new UnitHuman().Create(4900, 1350, "기괴한 샴쌍둥이", "총", "대형", "null", 480);
        UnitHuman basic3 = new UnitHuman().Create(4900, 1350, "기괴한 샴쌍둥이", "총", "대형", "null", 480);
        UnitHuman basic4 = new UnitHuman().Create(4900, 1350, "기괴한 샴쌍둥이", "총", "대형", "null", 480);
        UnitHuman basic5 = new UnitHuman().Create(4900, 1350, "기괴한 샴쌍둥이", "총", "대형", "null", 480);

        Battle fifth = new Battle();

        int startHP = alice.MaxHP;
        fifth.blacksuit4(basic, alice, sound);
        alice.statValue[1] = 100+alice.statValue[1];
        System.out.println("방어력 상승!" + alice.statValue[1]);
        fifth.blacksuit4(basic2, alice, sound);
        alice.statValue[1] = 100+alice.statValue[1];
        System.out.println("방어력 상승!" + alice.statValue[1]);
        fifth.blacksuit4(basic3, alice, sound);
        alice.statValue[1] = 100+alice.statValue[1];
        System.out.println("방어력 상승!" + alice.statValue[1]);
        fifth.blacksuit4(basic4, alice, sound);
        alice.statValue[1] = 100+alice.statValue[1];
        System.out.println("방어력 상승! " + alice.statValue[1]);
        fifth.blacksuit4(basic5, alice, sound);
        alice.statValue[1] = alice.statValue[1]-400;
        System.out.println("방어력 감소!");
        System.out.println("뭐에요 왜 줬다 뺏어요?");
        alice.MaxHP = startHP;
    }
}
