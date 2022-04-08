package AL1S;

public abstract class FieldItem {
    String itemName;
    int stockCount;

    class ItemWeapon extends FieldItem{
        int damage;
        String atkAttribute;
        int weight;
        int durabilityItem;

    }
    class PlayerWeapon extends ItemWeapon{
        String[] statList;
        int[] statValue;
    }

    class Accessories extends FieldItem{
        String parts;
        String[] statList;
        int[] statValue;
    }

    class ItemArmor extends FieldItem{
        String armorType;
        int PhyArmor;
        int MagArmor;
        int weight;
    }
    class PlayerArmor extends ItemArmor{
        String[] statList;
        int[] statValue;
    }
    class ConsumedItem extends FieldItem{
        String[] addList;
        int[] addValue;
        int maxCount;
    }
    
}
