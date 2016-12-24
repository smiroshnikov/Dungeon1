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
    private MonsterType monsterType; // variable declaration


    public Monster(int minHP, int maxHP, int monsterXP, String sound,
                   String monsterName) {
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.monsterXP = monsterXP;
        this.sound = sound;
        this.monsterName = monsterName;
        // TODO generate monster type

        this.monsterHP = generateMonsterHP();
        this.monsterType = generateMonster();
    }


    public int generateMonsterHP() {
        Random r = new Random();
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

    public MonsterType generateMonster() {
        // picks random monster type from MonsterType
        return MonsterType.values()[new Random().nextInt(MonsterType.values().length)];
        //return Letter.values()[new Random().nextInt(Letter.values().length)];

        //return MonsterType.DRAGON;
    }

    @Override
    public String toString() {
        return "An angry " + monsterType + " named  \n" + monsterName + ", that has " + monsterHP + "HP and will grant  " + monsterXP + " xp if you defeat it ! ";
    }

}
