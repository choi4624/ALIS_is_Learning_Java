package AL1S;

import java.io.IOException;
import java.util.Scanner;

public class Quiz {
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
