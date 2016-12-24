import java.util.Random;

public class Monster {
    final static String[] COLORS = {"yellow", "black", "red", "blue"};
    final static String[] WEAPONS = {"2H Axe", "Spear & Shield", "Crossbow"};

    public enum MonsterType {
        GOBLIN, KOBOLD, DRAGON;

        private MonsterType generateMonster() {
            return generateMonster();
        }

        private MonsterType generateMonster(MonsterType monsterType) {
            return MonsterType.values()[(int) (Math.random() * MonsterType.values().length)];
        }

    }

    public Monster(int minHP, int maxHP, int monsterXP, String sound, String monsterName, String monsterType) {
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.monsterXP = monsterXP;
        this.sound = sound;
        this.monsterName = monsterName;
        this.monsterType = monsterType;
        this.monsterHP = generateMonsterHP();
    }

    private int minHP;
    private int maxHP;
    private int monsterXP;
    private String sound;
    private String monsterName;
    private String monsterType;


    private int monsterHP;

    public int generateMonsterHP() {
        Random r = new Random();
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

    @Override
    public String toString() {
        return " " + monsterType + " named  " + monsterName + ", that has " + monsterHP + "HP and will grant  " + monsterXP + " xp if you defeat it ! ";
    }

}
