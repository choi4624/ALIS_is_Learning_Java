package AL1S;

public class Damage {
    int damage = 0;
    public Damage(UnitHuman unit){

        if (unit.weapon.equals("손"))
            damage = 100;
        if (unit.weapon.equals("칼"))
            damage = 800;
        if (unit.weapon.equals("총"))
            damage = 2000;
        if (unit.weapon.equals("수상한 막대기"))
            damage = unit.MaxMP;
        if (unit.weapon.equals("HP * MP"))
            damage = (unit.MaxHP* unit.MaxMP);
        if (unit.weapon.equals("out of control"))
            damage = unit.MaxMP;
    }

}
