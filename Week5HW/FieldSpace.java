package AL1S;

public class FieldSpace {
    String spaceName;
    String[] unitList;
    int[] unitCount;

    abstract class SafeArea extends FieldSpace{
        boolean isAttack;

        class Shop extends SafeArea{
            String[] itemList;
            int[] itemValue;
        }
        class FightArea extends SafeArea{
            int maxEntity;
            String fieldType;
            String[] statusList;
        }
    }



    class BattleSpace extends FieldSpace{
        int maxEntity;
        String fieldType;
        String[] statusList;
    }

    class Road extends FieldSpace{
        int[] routeCount;
        String[] nextRouteName;

    }

    class BattleRoad extends Road{
        int maxEntity;
        String fieldType;
        String[] statusList;
    }

}
