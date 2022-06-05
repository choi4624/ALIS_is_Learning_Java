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

    public void Quizzes(UnitHuman.PlayerChara alice) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        int plusAttack = 100; // 문제를 맞추면 증가할 공격력
        int minusAttack = 50; // 문제를 틀리면 감소할 공격력
        System.out.println("후후후.. 내가 내는 문제를 맞추면 네 힘을 길러주지..");
        System.out.println("만약 틀린다면 네 힘을 가져가지..");
        System.out.println();
        System.out.println("문제: 컬렉션에 관한 설명으로 옳지 않은 것을 고르시오");
        System.out.println("1. 가변 크기이기 때문에 배열보다 사용하기 편리하다");
        System.out.println("2. 삽입 삭제 시 원소의 위치를 컬렉션이 자동 조절하므로 편하다.");
        System.out.println("3. 객체들만 삽입되므로 int와 같은 기본 타입의 값을 저장할 수 없다.");
        System.out.println("4. 컬렉션은 모두 제네릭으로 만들어져 있다.");
        System.out.println("정답은?");
        int s = scanner.nextInt();

        switch (s){
            case '3' -> {
                System.out.println("용케도 맞췄군... 선물을 주지");
                alice.statValue[0] =+ plusAttack;
                System.out.println("공격력이 "+plusAttack+"만큼 증가하였습니다!");
            }
            default -> {
                System.out.println("후훗.. 틀렸어.. 약속대로 네 힘을 가져가지..");
                alice.statValue[0] =- minusAttack;
                System.out.println("공격력이 "+minusAttack+"만큼 감소하였습니다.");
            }
        }

    }
}
