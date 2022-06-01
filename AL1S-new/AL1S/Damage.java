package AL1S;

public class Damage {
    int damage = 0;
    public Damage(UnitHuman unit){

        if (unit.weapon.equals("손"))
            damage = 100;
        if (unit.weapon.equals("검"))
            damage = 250;
    }

}
