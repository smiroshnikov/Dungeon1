import java.util.Random;

public class Monster {
    private Random r = new Random();

    public enum MonsterWeapon {
        // used during monster instantiation pseudo-random
        // TODO damage calculation / random ? / hardcoded ?
        AXE, SWORD, BOW, CROSSBOW, WHIP,
        CLUB, STONE, CLAWS, TEETH
    }

    public enum NaturalWeapon {
        CLAW, TEETH, SPIKES, SPIT, EYEBEAM
    }

    public enum MonsterType {
        // used during monster instantiation pseudo-random
        // TODO why this is important ?! What monster types affect besides narration ?
        GOBLIN, KOBOLD, DRAGON, TROLL, HORSE,
        OOZE, DEMON, BEHOLDER, ELEMENTAL, RAT,
        SHEEP, WARPIG, ELEPHANT
    }

    private int minHP; // for random monster HP
    private int maxHP; // for random monster HP
    private int monsterHP; // result of random HP generation
    private int monsterXP; // will affect player character for level up , if implemented
    private String sound; // not sure is needed
    private String monsterName; // is this necessary  ?!
    private MonsterType monsterType; // (GOBLIN DRAGON etc....)result of random instantiation
    // TODO dragons have claws , rats do not wield bows
    private MonsterWeapon monsterWeapon; //(SWORD,AXE etc...)  random weapon pick

    // TODO Weapons should be natural or armed
    // TODO Monster should have boolean canWieldWeapon
    // TODO One random to rule them all

    public Monster(int minHP, int maxHP, int monsterXP, String sound, String monsterName) {
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.monsterXP = monsterXP;
        this.sound = sound;
        this.monsterName = monsterName;
        this.monsterHP = generateMonsterHP();
        this.monsterType = generateMonster();
        this.monsterWeapon = pickMonsterWeapon(monsterType);
    }

    private MonsterWeapon pickMonsterWeapon(MonsterType monsterType) {
        //Random r = new Random(); // Re-use ? 1 random per class ? Max?
        switch (monsterType) {
            case SHEEP:
            case RAT:
            case OOZE:
            case WARPIG:
                return MonsterWeapon.CLAWS;
            case BEHOLDER:
            case DRAGON:
            case ELEMENTAL:
            case ELEPHANT:
            case HORSE:
                return MonsterWeapon.TEETH;
            default:
                return MonsterWeapon.values()[r.nextInt(MonsterWeapon.values().length)];
        }

    }

    private NaturalWeapon pickMonsterWeapon(NaturalWeapon naturalWeapon) {
        return NaturalWeapon.CLAW;

    }

    public int generateMonsterHP() {
        // returns random HP per Monster instantiation
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

    public MonsterType generateMonster() {
        // TODO a better understanding of this line
        // returns random weapon pick
        // TODO make picks depend on monster types
        return MonsterType.values()[new Random().nextInt(MonsterType.values().length)];
    }

    @Override
    public String toString() {
        return "an angry " + monsterType + " named  \n" + monsterName + ", " +
                "that has " + monsterHP + " HP, armed with " + monsterWeapon + "!"
                + "\nEnemy will grant " + monsterXP + "xp if defeated! \n";
    }
}
