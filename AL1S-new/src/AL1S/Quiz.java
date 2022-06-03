package AL1S;

import java.io.IOException;
import java.util.Scanner;

public class Quiz {


    int SixthQuiz() throws IOException, InterruptedException {
        Scanner typing = new Scanner(System.in);

        FileText txt = new FileText();
        String path = "src/files/SixthStage_Quiz1.txt";
        txt.start(path);
        String ans = typing.next();
        if (ans.equals("2"))
            System.out.println("정답");
        else return -1;

         path = "src/files/SixthStage_Quiz2.txt";
        txt.start(path);
         ans = typing.next();
        if (ans.equals("1"))
            System.out.println("정답");
        else return -1;
         path = "src/files/SixthStage_Quiz3.txt";
        txt.start(path);
         ans = typing.next();
        if (ans.equals("5"))
            System.out.println("정답");
        else return -1;

        return 0;
    }


    int OX() {

        int count = 0;

        System.out.println("1. 주석문은 프로그램의 실행에 영향을 미친다?");
        Scanner scan1=new Scanner(System.in);
        String enter1=" ";
        enter1=scan1.nextLine();
        boolean b=enter1.contains("X");
        boolean b01=enter1.contains("x");
        if(b==true||b01==true) {
            System.out.println("정답입니다!");
            count++;
        }else {
            System.out.println("틀렸습니다. 주석문은 프로그램의 실행에 영향을 미치지 않습니다!");
        }
//=============================================================================
        System.out.println("2. 자바 프로그램은 main 메소드에서 실행을 시작한다?");
        Scanner scan2=new Scanner(System.in);
        String enter2=" ";
        enter2=scan1.nextLine();
        boolean b1=enter2.contains("O");
        boolean b11=enter2.contains("o");
        if(b1==true||b11==true) {
            System.out.println("정답입니다!");
            count++;
        }else {
            System.out.println("틀렸습니다. 자바 프로그램은 main 메소드에서 실행을 시작합니다!");
        }
//=========================================================================
        System.out.println("3. 문장의 마지막은 . 로 끝나야 한다?");
        Scanner scan3=new Scanner(System.in);
        String enter3=" ";
        enter3=scan1.nextLine();
        boolean b2=enter3.contains("X");
        boolean b21=enter3.contains("x");
        if(b2==true||b21==true) {
            System.out.println("정답입니다!");
            count++;
        }else {
            System.out.println("틀렸습니다. 자바 컴파일러는 문장의 끝을 ; 로 인식합니다!");
        }
//==============================================================================
        System.out.println("4. k@REA를 식별자의 이름으로 사용할수 있다?");
        Scanner scan4=new Scanner(System.in);
        String enter4=" ";
        enter4=scan4.nextLine();
        boolean b3=enter4.contains("X");
        boolean b31=enter4.contains("x");
        if(b3==true||b31==true) {
            System.out.println("정답입니다!");
            count++;
        }else {
            System.out.println("틀렸습니다. @는 식별자의 이름에 사용할 수 없습니다!");
        }
//==============================================================================
        System.out.println("5. a++와 ++a는 같다");
        Scanner scan5=new Scanner(System.in);
        String enter5=" ";
        enter5=scan5.nextLine();
        boolean b4=enter5.contains("X");
        boolean b41=enter5.contains("x");
        if(b4==true||b41==true) {
            System.out.println("정답입니다!");
            count++;
        }else {
            System.out.println("틀렸습니다. a++는 a를 1 증가하고 증가 전의 값을 반환하고,");
            System.out.println("          ++a는 a를 1 증가하고 증가된 값을 반환합니다!");
        }

        System.out.println("퀴즈 종료");
        System.out.println("");
        System.out.println("맞힌 개수는 "+count+"개 입니다");

        if (count >= 4)
            return 1;
        else
            return 0;

    }
}
