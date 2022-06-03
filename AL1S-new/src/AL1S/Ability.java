package AL1S;

public class Ability {
    String behaviorName;


    static class Attack extends  Ability{
        int Damage;
        int BasicAttack(UnitHuman fight, UnitHuman.PlayerChara User){
            Damage = User.statValue[0] - fight.defend;

            if (Damage > 0)
                fight.MaxHP = fight.MaxHP - Damage;
            else
                System.out.println("────────────Blocked!!────────────");

            return Damage;
        }
        int EnemyAttack(UnitHuman fight, UnitHuman.PlayerChara User){

            Damage enemy = new Damage(fight);
            Damage = User.statValue[1] -  enemy.damage;
            User.MaxHP = User.MaxHP - Damage;
            return enemy.damage;
        }
    }

    static class Skill extends Ability{
        int SkillDamage;
        int HPCost;
        int MPCost;
        int coolTime;

        void MisticArrow() {
            int[] StatValue;
            // int PhyDmg;  int MagDmg; int agility;
            // SkillDamage = PhyDmg + MagDmg + agility;
            String[] StatName;
        }

        void RailGunClamp(UnitHuman fight, UnitHuman.PlayerChara User) {
            if (fight.BodyArmor.equals("소형") && (User.statValue[1] - fight.defend) > 0)
                fight.MaxHP = fight.MaxHP - (User.statValue[1] - fight.defend)*2;
            System.out.println("지면 강타 efftect : "+User.statList[1] +" "+User.statValue[1]+" 만큼의 대미지");
            System.out.println("소형에게만 효과. 적 방어력 1당 1 감소");

        }
        void RailGunShoot(UnitHuman fight, UnitHuman.PlayerChara User){
            if ((fight.BodyArmor.equals("대형")||fight.BodyArmor.equals("소형")) && (User.statValue[1] - fight.defend) > 0)
                fight.MaxHP = fight.MaxHP - (User.statValue[0] - fight.defend)*6;
            System.out.println("비장의 한발 effect : "+User.statList[0] +" "+User.statValue[0]+" 만큼의 데미지");
            System.out.println("대형,소형 모두에게 효과. 적 방어력 1당 1 감소");
        }
    }
    void RailGunBlaze(UnitHuman fight, UnitHuman.PlayerChara User){
            if (fight.BodyArmor.equals("대형") && (User.statValue[1] - fight.defend) > 0)
                fight.MaxHP = fight.MaxHP - (User.statValue[0] - fight.defend)*8;
            System.out.println("빛이여! effect : "+User.statList[0] +" "+User.statValue[0]+" 만큼의 데미지");
            System.out.println("대형에게만 효과. 적 방어력 1당 1 감소");
        }
    
}
