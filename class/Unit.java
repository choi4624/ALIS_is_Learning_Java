package AL1S;


public abstract class Unit {
    int MaxHP;
    int MaxMP;
    String name;

    void HPSetting(int I){
        this.MaxHP = I;
    }
    void MPSetting(int J){
        this.MaxMP = J;
    }
    int getMaxHP(int addHP){
        int newMaxHP = this.MaxHP + addHP;
        return newMaxHP;
    }

    void UnitCall() {
        System.out.println("기본 유닛 호출");
        System.out.println(this.MaxHP);
        System.out.println(this.MaxMP);
        System.out.println(this.name);
        System.out.println("기본 유닛 호출");
    }

    public static void main(String[] args) {
        UnitHuman.PlayerChara Light = new UnitHuman.PlayerChara();
        Light.Alice();

        System.out.println(Light.acc);
        System.out.println(Light.BodyArmor);
        System.out.println(Light.MaxHP);
        System.out.println(Light.MaxMP);
        System.out.println(Light.weapon);
        System.out.println(Light.name);
        System.out.println(Light.exp);
        System.out.println(Light.level);
        System.out.println("배열을 사용한 아리스의 스텟이에요");

        for (String s:Light.statList) {
            System.out.print(s+"    ");
        }
        System.out.println();
        for (int y:Light.statValue
             ) {
            System.out.print(y+"    ");
        }
        System.out.println();


        System.out.println("일단 여기까지");

        Light.MaxHP = Light.getMaxHP(500);
        System.out.println("빰빠카밤, 아리스는 HP를 더 얻었어요");
        System.out.println(Light.MaxHP);

        UnitHuman monster = new UnitHuman();

        monster.Create(1000, 100, "기본 몬스터","기본 무기", "소형","이빨?" );
        monster.UnitCall();

    }
}
/* class UnitArmor extends Unit {
    int UnitPhArmor;
    int UnitMaArmor;
}
class UnitResistance extends Unit{
    int PhRes;
    int MaRes;
} */
class UnitHuman extends Unit {
    String weapon;
    String BodyArmor;
    String acc;


    protected static class PlayerChara extends UnitHuman{
        int exp;
        int level;
        String[] statList;
        int[] statValue;

        public void Alice() {


            this.MaxHP = 1000;
            this.MaxMP = 100;
            this.weapon = "레일건";
            this.acc = "없음";
            this.BodyArmor = "중형";
            this.name = "아리스";
            this.exp = 0;
            this.level = 1;

            this.statList = new String[]{"공격력", "방어력", "무게"};
            this.statValue = new int[]{100, 500, 80};
        }
    }

    protected UnitHuman Create(int HP, int MP, String name, String weapon, String bodyArmor, String acc){

        UnitHuman baked = new UnitHuman();

        this.MaxHP = HP;
        this.MaxMP = MP;
        this.weapon = weapon;
        this.BodyArmor = bodyArmor;
        this.acc = acc;
        this.name = name;

        return baked;
    }


}


