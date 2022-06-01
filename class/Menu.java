package AL1S;

import java.io.*;
import java.util.Scanner;

public class Menu implements Runnable {

    public void startmenu() throws IOException {
        Scanner typing = new Scanner(System.in);

        String console = null;
        File inStream = new File("src/files/newmenu.txt");
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(inStream), "UTF-8"));


        int line;
        while ((line = input.read()) != -1){
            System.out.print((char)line);
        }
        System.out.println("한글 테스트 100");

        console = typing.next();
        if (console.equals("1"))
            GameMenu();
        else if (console.equals("3"))
        {System.out.print("게임 종료");
        return;}



    }

    @Override
    public void run() {
        try {
            startmenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void GameMenu() throws IOException {
        System.out.println("게임 시작");

        File inStream = new File("src/files/startmenu.txt");
        BufferedReader input = null;
        input = new BufferedReader(new InputStreamReader(new FileInputStream(inStream), "UTF-8"));


        int line;
        while ((line = input.read()) != -1){
            System.out.print((char)line);
        }
        UnitHuman.PlayerChara Alice = new UnitHuman.PlayerChara();
        Alice.Alice();
        Alice.Stat();


    }
}
