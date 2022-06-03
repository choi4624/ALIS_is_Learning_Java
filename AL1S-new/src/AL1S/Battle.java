package AL1S;

import java.util.Scanner;

public class Battle {
    FileText txt = new FileText();
    String path = "src/files/MainStage.txt";

  public void basicBattle(UnitHuman fight, UnitHuman.PlayerChara User, effect sound) throws InterruptedException {
      System.out.println("──────────────────────battle start──────────────────────");
      Thread.sleep(1000);

      int StartHP = User.MaxHP;
      int StartMP = User.MaxMP;
      tutorial(fight, User, sound, StartHP, StartMP);

      sound.soundEffect("src/files/BGM/ding-sound-effect_1.wav");
      System.out.println("──────────────────────battle end──────────────────────");
      System.out.println(fight.name+"를 잡았어요.");

      User.MaxHP = StartHP;
      //     th4.interrupt();
      MakeSound.killMusic();
  }

    private void tutorial(UnitHuman fight, UnitHuman.PlayerChara User, effect sound, int hp, int mp) throws InterruptedException {
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
            System.out.println("──────────────────────battle end──────────────────────");
            Thread.sleep(1000);
            System.out.println("시스템 종료");
            sound.soundEffect("src/files/BGM/erro-2.wav");
            User.MaxHP = hp;
            User.MaxMP = mp;

            return;
        }

    }
}

    public void blacksuit1(UnitHuman fight, UnitHuman.PlayerChara User, effect sound) throws InterruptedException {

      int startHP = User.MaxHP;
      int startMP = User.MaxMP;
        int status = 0;
        while (fight.MaxHP > 0) {
            System.out.println("적 체력" + fight.MaxHP);
            System.out.println("공격하시겠습니까? 1. 예, 2. 아니오, 3. 적 상태 확인");
            if(status ==1)
                System.out.println("스킬: 지면강타");
            Scanner typing = new Scanner(System.in);
            String console = typing.next();

            switch (console){
                case "1" -> {
                    Ability.Attack atk = new Ability.Attack();
                    int dealt = atk.BasicAttack(fight, User);
                    System.out.println(dealt+" 대미지 ");
                    if(dealt < 200)
                    System.out.println("이건 뭔가 잘못됐어.");
                }
                case "지면강타" ->{
                    Ability.Skill clamp =  new Ability.Skill();
                    clamp.RailGunClamp(fight, User);
                }
                case "3" ->{
                    fight.UnitCall();
                    status = 1;
                }
                default -> {
                    System.out.println("Pass the turn");
                }

            }

            System.out.println(fight.name+"의 현재체력 " + fight.MaxHP);

            sound.soundEffect("src/files/BGM/xbox-360-achievement-sound.wav");
            if (fight.MaxHP <= 0)
                break;

            System.out.println("적의 공격");
            Ability.Attack enemyatk = new Ability.Attack();
            int dealt = enemyatk.EnemyAttack(fight,User);

            System.out.println(" 무기 "+fight.weapon + "/ 적의 피해 "+dealt);
            System.out.println(User.name + "의 현재체력" + User.MaxHP);

            if (User.MaxHP <= 0)
            {System.out.println("적에게 당했다.");
                MakeSound.killMusic();
                System.out.println("──────────────────────battle end──────────────────────");
                Thread.sleep(1000);
                System.out.println("시스템 종료");
                sound.soundEffect("src/files/BGM/erro-2.wav");
                User.MaxHP = startHP;
                User.MaxMP = startMP;
                return;
            }
        }
            sound.soundEffect("src/files/BGM/ding-sound-effect_1.wav");
            System.out.println("──────────────────────battle end──────────────────────");
            System.out.println(fight.name+"를 잡았어요.");

            User.MaxHP = startHP;
            //     th4.interrupt();
            MakeSound.killMusic();


            // 새 음악 시작
            String musicPath = "src/files/BGM/Theme_91.wav";
            MakeSound.getPath(musicPath);
            Runnable r10 = new MakeSound();
            Thread th10 = new Thread(r10);
            th10.start();
            return;


    }
    public void blacksuit3(UnitHuman fight, UnitHuman.PlayerChara User, effect sound) throws InterruptedException {
        int startHP = User.MaxHP;
        int startMP = User.MaxMP;
        int status = 0;
        while (fight.MaxHP > 0) {
            System.out.println("적 체력" + fight.MaxHP);
            System.out.println("공격하시겠습니까? 1. 예, 2. 아니오, 3. 적 상태 확인");
            if (status == 1)
                System.out.println("스킬: 비장한 한발");
            Scanner typing = new Scanner(System.in);
            String console = typing.next();

            switch (console){
                case "1" -> {
                    Ability.Attack atk = new Ability.Attack();
                    int dealt = atk.BasicAttack(fight, User);
                    System.out.println(dealt+" 대미지 ");
                    if(dealt < 200)
                        System.out.println("이건 뭔가 잘못됐어.");
                }
                case "비장한 한발" ->{
                    Ability.Skill clamp =  new Ability.Skill();
                    clamp.RailGunShoot(fight, User);
                }
                case "3" ->{
                    fight.UnitCall();
                    status = 1;
                }
                default -> {
                    System.out.println("Pass the turn");
                }

            }
            System.out.println(fight.name+"의 현재체력 " + fight.MaxHP);

            sound.soundEffect("src/files/BGM/xbox-360-achievement-sound.wav");
            if (fight.MaxHP <= 0)
                break;

            System.out.println("적의 공격");
            Ability.Attack enemyatk = new Ability.Attack();
            int dealt = enemyatk.EnemyAttack(fight,User);

            System.out.println(" 무기 "+fight.weapon + "/ 적의 피해 "+dealt);
            System.out.println(User.name + "의 현재체력" + User.MaxHP);

            if (User.MaxHP <= 0)
            {System.out.println("적에게 당했다.");
                MakeSound.killMusic();
                System.out.println("──────────────────────battle end──────────────────────");
                Thread.sleep(1000);
                System.out.println("시스템 종료");
                sound.soundEffect("src/files/BGM/erro-2.wav");
                User.MaxHP = startHP;
                User.MaxMP = startMP;
                return;
            }
        }
        sound.soundEffect("src/files/BGM/ding-sound-effect_1.wav");
        System.out.println("──────────────────────battle end──────────────────────");
        System.out.println(fight.name+"를 잡았어요.");

        User.MaxHP = startHP;
        //     th4.interrupt();
        MakeSound.killMusic();


        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_91.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();
        return;
    }
    void sixth(UnitHuman fight, UnitHuman.PlayerChara User, effect sound) throws InterruptedException, IOException {

        int startHP = User.MaxHP;
        int startMP = User.MaxMP;
        int status = 0;
        Ability.Attack atk = new Ability.Attack();
        Ability.Skill skill =  new Ability.Skill();
        User.Stat();

        while (fight.MaxHP > 0) {
            System.out.println("적 체력" + fight.MaxHP);
            System.out.println("공격하시겠습니까? 1. 예, 2. 아니오, 3. 적 상태 확인");
            if(status ==1) {
                System.out.println("스킬: 지면강타");
                System.out.println("스킬: 코어 저격");
                System.out.println("스킬: 장갑 파괴");
                System.out.println("스킬: 시스템 해킹");
                System.out.println("스킬: 지면강타");
                System.out.println("스킬: 밸런스붕괴");
            }
            Scanner typing = new Scanner(System.in);
            String console = typing.next();

            switch (console){
                case "1" -> {

                    int dealt = atk.BasicAttack(fight, User);
                    System.out.println(dealt+" 대미지 ");
                    if(dealt < 200)
                        System.out.println("이건 뭔가 잘못됐어.");
                }
                case "지면강타" ->{
                    skill.RailGunClamp(fight, User);
                }
                case "3" ->{
                    fight.UnitCall();
                    status = 1;
                }
                case "레일건 사격" -> {

                }
                case "코어 저격" -> {

                }
                case "장갑 파괴" -> {

                }
                case "시스템 해킹" -> {

                }
                case "밸런스 붕괴" -> {

                }
                default -> {
                    System.out.println("Pass the turn");
                }

            }

            System.out.println(fight.name+"의 현재체력 " + fight.MaxHP);

            sound.soundEffect("src/files/BGM/xbox-360-achievement-sound.wav");
            if (fight.MaxHP <= 0)
                break;

            System.out.println("적의 공격");
            Ability.Attack enemyatk = new Ability.Attack();
            int dealt = enemyatk.EnemyAttack(fight,User);

            System.out.println(" 무기 "+fight.weapon + "/ 적의 피해 "+dealt);
            System.out.println(User.name + "의 현재체력" + User.MaxHP);

            if (User.MaxHP <= 0)
            {System.out.println("적에게 당했다.");
                MakeSound.killMusic();
                System.out.println("──────────────────────battle end──────────────────────");
                Thread.sleep(1000);
                System.out.println("시스템 종료");
                sound.soundEffect("src/files/BGM/erro-2.wav");
                User.MaxHP = startHP;
                User.MaxMP = startMP;
                return;
            }
        }
        sound.soundEffect("src/files/BGM/ding-sound-effect_1.wav");
        System.out.println("──────────────────────battle end──────────────────────");
        System.out.println(fight.name+"를 잡았어요.");

        User.MaxHP = startHP;
        //     th4.interrupt();
        MakeSound.killMusic();


        // 새 음악 시작
        String musicPath = "src/files/BGM/Theme_91.wav";
        MakeSound.getPath(musicPath);
        Runnable r10 = new MakeSound();
        Thread th10 = new Thread(r10);
        th10.start();

        return;


    }
}
