package AL1S;

import java.io.IOException;
import java.util.Scanner;

public class SecondStage {

    public void run(UnitHuman.PlayerChara alice) throws IOException, InterruptedException {
        // 이전 음악 종료
        MakeSound.stopMusic();

        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_70.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();



        //===================퀴즈구간===================================================
        System.out.println("자바 기본난이도 OX 테스트로 총 5문제입니다.");
        System.out.println("문제를 맞춘만큼 플레이어의 능력치가 올라갑니다.");
        System.out.println("준비가 되셨으면 Enter키를 누르세요");
        Scanner scan1=new Scanner(System.in);
        String enter1=" ";
        enter1=scan1.nextLine();

        System.out.println("3초 뒤에 시작합니다");

        try {
            for(int i=3; i>0;i--) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        Quiz Stage2 = new Quiz();
        int result = Stage2.OX();

        if (result == 1) {
            for (int i = 0; i < alice.statValue.length-1; i++) {
                alice.statValue[i] += 300;
                System.out.println("능력치 " +alice.statList[i] + "이" + alice.statValue[i] + " 만큼 상승했습니다.");
            }

        }
    }


}
