package AL1S;

import java.io.IOException;

public class EndStage {
    public void run(UnitHuman.PlayerChara alice) throws IOException, InterruptedException {
        // 이전 음악 종료
        MakeSound.stopMusic();

        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_07.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();




        System.out.println("엔드스테이지는 시간 관계상 없습니다. ");
        System.out.println("게임 재밋게 해줘서 고마워요");
        System.out.println("이게맞나?");


    }
}
