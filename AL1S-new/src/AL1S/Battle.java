package AL1S;

import java.util.Scanner;

public class Battle {
    public Battle(UnitHuman fight, UnitHuman.PlayerChara User, effect sound) throws InterruptedException {

        MakeSound.stopMusic();

        String path = "src/files/BGM/Theme_58.wav";
        MakeSound.getPath(path);

        Runnable r1 = new MakeSound();
        Thread th4 = new Thread(r1);
        th4.start();

        int StartHP = User.MaxHP;

        while (fight.MaxHP > 0) {
            System.out.println("적 체력" + fight.MaxHP);
            fight.UnitCall();
            System.out.println("공격하시겠습니까? 1. 예, 2. 아니오");
            Scanner typing = new Scanner(System.in);
            String console = typing.next();

            if (console.equals("1"))
                fight.MaxHP = fight.MaxHP - User.statValue[0];
            System.out.println(fight.name+"의 현재체력 " + fight.MaxHP);

            sound.soundEffect("src/files/BGM/xbox-360-achievement-sound.wav");
            if (fight.MaxHP <= 0)
                break;

            System.out.println("적의 공격");
            Damage enemy = new Damage(fight);
                User.MaxHP = User.MaxHP - enemy.damage;
            System.out.println(" 무기 "+fight.weapon + " 공격력 "+enemy.damage);
            System.out.println(User.name + "의 현재체력" + User.MaxHP);
            
            if (User.MaxHP <= 0)
            {System.out.println("적에게 당했다.");
                MakeSound.killMusic();
                System.out.println("시스템 종료");
                sound.soundEffect("src/files/BGM/erro-2.wav");
                User.MaxHP = StartHP;

                return;
            }

        }
        sound.soundEffect("src/files/BGM/ding-sound-effect_1.wav");
        System.out.println("허수아비를 잡았어요.");
   //     th4.interrupt();
        MakeSound.killMusic();

    }

}
