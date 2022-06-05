package AL1S;

import java.io.*;
import java.util.Scanner;

public class Menu implements Runnable {

    public void startmenu() throws IOException, InterruptedException {
        Scanner typing = new Scanner(System.in);

        String console = null;
        File inStream = new File("src/files/newmenu.txt");
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(inStream), "UTF-8"));


        int line;
        while ((line = input.read()) != -1){
            System.out.print((char)line);
        }

        System.out.println("한글이 정상적으로 출력되고 있나요?");


        while (true) {
            console = typing.next();
            if (console.equals("1"))
            {GameMenu();
            break;}
            else if (console.equals("2"))
                System.out.println("안타깝지만 불러오는 기능은 없어요.");
            else if (console.equals("3")) {
                System.out.print("게임 종료");
                return;
            }
        }
        typing.close();

    }

    @Override
    public void run() {
        try {
            startmenu();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void GameMenu() throws IOException, InterruptedException {
        System.out.println("게임 시작");



        File inStream = new File("src/files/startmenu.txt");
        BufferedReader input = null;
        input = new BufferedReader(new InputStreamReader(new FileInputStream(inStream), "UTF-8"));
        effect sound = new effect();

        int line;
        while ((line = input.read()) != -1){
            System.out.print((char)line);
        }
        UnitHuman.PlayerChara User = new UnitHuman.PlayerChara();
        User.Alice();
        User.Stat();
        Thread.sleep(1000);

        ImagePop.imgPath("../files/alice.png");
        ImagePop img = new ImagePop();


        User.upgradeHP(500);

        System.out.println("\n 지금부터 생성된 몬스터와 간단한 전투를 해볼 거에요.");

        // 유닛 생성하여 전투 구현
        UnitHuman basic = new UnitHuman().Create(1000, 1000,"허수아비", "손","중형","null", 100 );
        System.out.println("허수아비 생성 완료");

        // 기본 베틀 음악 코드 재생
        MakeSound.stopMusic();
        String path = "src/files/BGM/Theme_58.wav";
        MakeSound.getPath(path);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();
        // 기본 배틀 음악

        // 배틀 시작
        Battle tutorial = new Battle();
        tutorial.basicBattle(basic, User, sound);

        // 전투 끝나면 다시 원래 BGM 재생
        path = "src/files/BGM/Pixel_time2.wav";
        MakeSound.getPath(path);
        Runnable r2 = new MakeSound();
        Thread th5 = new Thread(r2);
        th5.start();

        //전투 종료 후 메시지
        File inStream2 = new File("src/files/stageMessage.txt");
        BufferedReader input2 = null;
        input2 = new BufferedReader(new InputStreamReader(new FileInputStream(inStream2), "UTF-8"));
        System.out.println("\n 어떻게든 허수아비 상대로 이기거나 지거나 했던 것 같아요 ");
        while ((line = input2.read()) != -1){
            System.out.print((char)line);
        }
    //아리스 이미지 제거
        img.remove();

        Scanner typing = new Scanner(System.in);
        String console = typing.next();

        switch (console){
            case "start" -> {
                MainStage AL1S = new MainStage();
                AL1S.start();
            }
            default -> {
                System.out.println("아리스는 스위치 구문에 루프가 걸리지 않았단걸 알았어요.");
                System.out.println("처음부터 다시 튜토리얼을 해주세요.");
            }
        }
return;

    }
}
