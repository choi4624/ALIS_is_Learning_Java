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
        System.out.println("");
        System.out.print("HP "+this.MaxHP + " ");
        System.out.print("MP "+this.MaxMP + " ");
        System.out.print("이름 "+this.name + " ");
        System.out.println("");
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
    int defend;


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
            this.statValue = new int[]{400, 500, 80};
        }

        public void Stat() {

            System.out.println("이름 " +this.name);
            System.out.println("악세사리 " + this.acc);
            System.out.println("방어유형 "+ this.BodyArmor);
            System.out.println("신성한 HP "+ this.MaxHP + " *NOTE HP는 스테이지가 끝나면 전투 전 얻었던 최대치로 복구됩니다. ");
            System.out.println("신비한 MP "+ this.MaxMP + " *NOTE MP는 스테이지가 끝나도 복원되지 않습니다. ");
            System.out.println("무기 " + this.weapon);
            System.out.println("레벨" + this.level);
            System.out.println(this.name+"의 스텟이에요");

            for (String s:this.statList) {
                System.out.print(s+"    ");
            }
            System.out.println();
            for (int y:this.statValue
            ) {
                System.out.print(y+"    ");
            }

            System.out.println();
            System.out.println("");
            System.out.println("──────────────────────스텟 표기 끝!──────────────────────");

        }
        void upgradeHP(int value){
            this.MaxHP = this.getMaxHP(value);
            System.out.println("빰빠카밤, 아리스는 HP를 더 얻었어요");
            System.out.println(this.MaxHP);
        }



    }
    protected void UnitCall(){
        System.out.println("");
        System.out.print("HP "+this.MaxHP + " / ");
        System.out.print("MP "+this.MaxMP + " / ");
        System.out.print("이름 "+this.name + " / ");
        System.out.println("무기 "+this.weapon + " / ");
        System.out.print("악세사리 "+this.acc + " / ");
        System.out.println("방어형태 "+this.BodyArmor + " / ");
        System.out.print("방어력 "+this.defend + " / ");
        System.out.println("");
    }
    protected UnitHuman Create(int HP, int MP, String name, String weapon, String bodyArmor, String acc, int defend){
        UnitHuman baked = new UnitHuman();
        baked.MaxHP = HP;
        baked.MaxMP = MP;
        baked.weapon = weapon;
        baked.BodyArmor = bodyArmor;
        baked.acc = acc;
        baked.name = name;
        baked.defend = defend;

        return baked;
    }


/*    UnitHuman monster = new UnitHuman();
            monster.Create(1000, 100, "기본 몬스터","기본 무기", "소형","이빨?" );
            monster.UnitCall();
*/



}


