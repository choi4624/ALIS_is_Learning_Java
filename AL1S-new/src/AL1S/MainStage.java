package AL1S;

import java.io.*;
import java.util.Scanner;

public class MainStage {
    UnitHuman.PlayerChara player = new UnitHuman.PlayerChara();
    int firstSetup = 0;

    public void start() throws IOException, InterruptedException {

        if(firstSetup == 0){
            player.Alice();
        firstSetup++;
        }

        Scanner typing = new Scanner(System.in);
        effect sound = new effect();




        FileText txt = new FileText();
        txt.start("src/files/MainStage.txt");
        ImagePop.imgPath("../files/alice.png");
        int end = 0;
        while (true){

            ImagePop img = new ImagePop();
        String console = typing.next();
        switch (console){
                case "11" -> {
                    img.remove();
                    ImagePop.imgPath("../files/momoi.png");
                    ImagePop img2 = new ImagePop();

                    String path = "src/files/BGM/1keyboard.wav";
                    sound.soundEffect(path);
                    txt.start("src/files/stageExplain1.txt");
                    System.out.println("아무거나 눌러서 다음 설명으로");
                    String enter = typing.next();
                    sound.soundEffect(path);
                    txt.start("src/files/stageExplain2.txt");
                    String enter2 = typing.next();
                    sound.soundEffect(path);
                    txt.start("src/files/stageExplain3.txt");
                    img2.remove();
                }
                case "0" -> {
                    img.remove();
                    player.Stat();
                }
                case "1" -> {
                    img.remove();
                    FirstStage playing = new FirstStage();
                    playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                    txt.start("src/files/FirstStage_endScript.txt");
                }
                case "2" -> {
                    img.remove();
                    SecondStage playing = new SecondStage();
                    playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                    txt.start("src/files/FirstStage_endScript.txt");
                }
                case "3" -> {
                    img.remove();

                    ImagePop.imgPath("../files/alice.png");
                }
                case "4" -> {
                    img.remove();
                    ForthStage playing = new ForthStage();
                    playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                }
                case "5" -> {
                    img.remove();
FifthStage playing = new FifthStage();
playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                }
                case "6" -> {
                    img.remove();
                    SixthStage playing = new SixthStage();
                    playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                }
                case "7" -> {
                    img.remove();
SeventhStage playing = new SeventhStage();
playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                }
                case "8" -> {
                    img.remove();

                    ImagePop.imgPath("../files/alice.png");
                }
                case "the end" -> {
                    img.remove();
                    EndStage playing = new EndStage();
                    playing.run(player);
                    ImagePop.imgPath("../files/alice.png");
                    end = 1;
                }
            case "-1" -> {
                img.remove();
            System.out.println("시스템 종료, 여태까지 했던 능력치는 다 소멸합니다. ");
                System.out.println("게임을 오래하셨다면.. 안됐네");
                return;
            }
            case "AL1S_IS_LEARNING_JAVA" -> {
                    img.remove();
            }
                default -> {
                    img.remove();
                    System.out.println("아무거나 입력하는 이유가 있나요?");
                    System.out.println("오 류 발 생");
                    System.out.println("오 류 발 생!");

                    ImagePop.imgPath("../files/alice.png");
                }
            }
            if(end == 1)
                break;
        }
Thread.sleep(100000);
        }
    }
