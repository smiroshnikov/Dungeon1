/**
 * should be child of combat ?
 */
public class Character extends Combat {
    private int atack_limit = 10;
    private int xp = 0;
    private int baseHp = 10;

    public int dodge() {
        int roll = 1 + 2 + 3; // redundant
        return roll;
    }

    public int attack() {
        int roll = 3 + 4 + this.dodge(); // redundant
        return roll;
    }
}
