package AL1S;

import java.io.IOException;

public class SeventhStage {
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
        String path = "src/files/SeventhStage_Script.txt";

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();

        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        //스크립트 실행
        txt.start(path);


        System.out.println("!!!!!!!!");
        System.out.println("조무래기들이군요...");
        System.out.println("나의 역할은..명 속성 광역딜러..");
        System.out.println("이런 것들쯤은 식은 죽 먹기...");
        System.out.println("마력충전.....100%...");
        System.out.println("덤뱌랏!!!!!!!!!");

        UnitHuman basic = new UnitHuman().Create(2700, 600,"포악한 마녀1", "총","소형","null", 360 );
        Battle seventh = new Battle();
        seventh.blacksuit1(basic, alice, sound);

        UnitHuman basic2 = new UnitHuman().Create(2700, 600,"포악한 마녀2", "총","소형","null", 360 );
        Battle seventh2 = new Battle();
        seventh2.blacksuit3(basic2, alice, sound);

        alice.level++;
        alice.statValue[0] =+ 50;
        alice.statValue[1] =+ 40;
        System.out.println("레벨업! "+alice.level);
        System.out.println("공격력 상승! "+alice.statValue[0]);
        System.out.println("방어력 증가! "+alice.statValue[1]);

    }
}
