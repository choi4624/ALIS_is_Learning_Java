package AL1S;

public class Weapon {
    int BasicDamage;
    int ArmorPenetrate;


    class TriggeredWeapon extends Weapon{
        int fixedDamage;
    }

    class MagicWeapon extends Weapon{
        String magic;
        boolean trueDamage;
    }
    class PhysicWeapon extends Weapon{
        String physic;
        boolean trueDamage;
    }

    class leveledMagicWeapon extends MagicWeapon{
        int level;
        int multiplier;
    }
    class leveledPhysicWeapon extends PhysicWeapon{
        int level;
        int multiplier;
    }

}
