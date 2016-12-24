import java.util.Random;

public class Monster {
    final static String[] COLORS = {"yellow", "black", "red", "blue"};
    final static String[] WEAPONS = {"2H Axe", "Spear & Shield", "Crossbow"};

    public enum MonsterType { // definition
        GOBLIN, KOBOLD, DRAGON
    }

    private int minHP;
    private int maxHP;
    private int monsterXP;
    private String sound;
    private String monsterName;
    private int monsterHP;
    MonsterType monsterType; // variable declaration


    public Monster(int minHP, int maxHP, int monsterXP, String sound, String monsterName, MonsterType monsterType) {
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.monsterXP = monsterXP;
        this.sound = sound;
        this.monsterName = monsterName;
        this.monsterType = monsterType;

        this.monsterHP = generateMonsterHP();
    }


    public int generateMonsterHP() {
        Random r = new Random();
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

    @Override
    public String toString() {
        return " " + " named  " + monsterName + ", that has " + monsterHP + "HP and will grant  " + monsterXP + " xp if you defeat it ! ";
    }

}
