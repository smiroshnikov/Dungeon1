import java.util.Random;

public class Monster {
    final static String[] COLORS = {"yellow", "black", "red", "blue"};


    public enum MonsterWeapon {
        AXE, SWORD, BOW, CROSSBOW, WHIP,
        CLUB, STONE
    }

    public enum MonsterType {
        GOBLIN, KOBOLD, DRAGON, TROLL, HORSE,
        OOZE, DEMON, BEHOLDER, ELEMENTAL, RAT,
        SHEEP, WARPIG, ELEPHANT
    }

    private int minHP;
    private int maxHP;
    private int monsterXP;
    private String sound;
    private String monsterName;
    private int monsterHP;
    private MonsterType monsterType; // variable declaration
    private MonsterWeapon monsterWeapon;


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
        this.monsterWeapon = pickMonsterWeapon();
    }

    private MonsterWeapon pickMonsterWeapon() {
        Random r = new Random(); // Re-use ? 1 random per class ? Max
        return MonsterWeapon.values()[new Random().nextInt(MonsterWeapon.values().length)];
    }


    public int generateMonsterHP() {
        Random r = new Random();
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

    public MonsterType generateMonster() {
        // TODO a better understanding of this line
        return MonsterType.values()[new Random().nextInt(MonsterType.values().length)];
    }

    @Override
    public String toString() {
        return "an angry " + monsterType + " named  \n" + monsterName + ", " +
                "that has " + monsterHP + " HP, armed with " + monsterWeapon + "!"
                + "\nEnemy will grant " + monsterXP + "xp if defeated! \n";
    }

}
