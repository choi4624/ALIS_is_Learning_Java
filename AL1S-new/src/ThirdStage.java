package AL1S;

import java.io.IOException;

public class ThirdStage {
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
        String path = "src/files/ThirdStage_Script1.txt";

        //전투 중, 스크립트 중 효과음
        effect sound = new effect();

        //스크립트 타자 치는 효과음
        String soundPath = "src/files/BGM/1keyboard.wav";
        sound.soundEffect(soundPath);
        //스크립트 실행
        txt.start(path);

        System.out.println("더 강한 힘이 필요해...");
        System.out.println("그를 상대하려면...");
        System.out.println("몸놀림을 더 기민하게 해야겠어..");

        alice.statValue[0] =+ 200;
        alice.statValue[2] =+ 15;
        System.out.println("공격력 상승!"+alice.statValue[0]);
        System.out.println("무게 감소!"+alice.statValue[2]);

        UnitHuman basic = new UnitHuman().Create(4700, 1200,"찬란한 적토마", "총","대형","null", 480 );
        Battle third = new Battle();

        third.blacksuit3(basic, alice, sound);


    }
}
