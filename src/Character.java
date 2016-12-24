/**
 * should be child of combat ?
 */
public class Character extends Combat {
    private String characterName;
    private int atack_limit = 10;
    private int xp = 0;
    private int baseHp = 10;
    private static final String[] chosenPath = {"Right", "Left"};

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public int dodge() {
        int roll = 1 + 2 + 3; // redundant
        return roll;
    }

    public int attack() {
        int roll = 3 + 4 + this.dodge(); // redundant
        return roll;
    }

    public String getDirection(char userInput) {
        // TODO how should we return in a better way ?

        if (java.lang.Character.toLowerCase(userInput) == 'r') {
            return chosenPath[0];
        }
        return chosenPath[1];
    }
}
