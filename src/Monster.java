import java.util.Random;

public class Monster {
    final static String[] COLORS = {"yellow", "black", "red", "blue"};
    final static String[] WEAPONS = {"2H Axe", "Spear & Shield", "Crossbow"};
    private int minHP;
    private int maxHP;
    private int monsterXP;
    private String sound;

    public Monster(int minHP, int maxHP, int monsterXP, String sound) {
        this.minHP = minHP;
        this.maxHP = maxHP;
        this.monsterXP = monsterXP;
        this.sound = sound;
    }

    private int monsterHP;

    public int getMonsterHP() {
        Random r = new Random();
        monsterHP = r.nextInt(maxHP - minHP) + minHP;
        return monsterHP;
    }

}
