package AL1S;

public abstract class Ability {
    String behaviorName;


    class Attack extends  Ability{
        int Damage;
    }

    class Skill extends Ability{
        int SkillDamage;
        int HPCost;
        int MPCost;
        int coolTime;

        class MisticArrow extends Skill{
            int[] StatValue;
            // int PhyDmg;  int MagDmg; int agility;
            // SkillDamage = PhyDmg + MagDmg + agility;
            String[] StatName;
        }
    }

}
