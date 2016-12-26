// TODO maybe getDirection should be moved to narration ? or split ?


public class Character extends Combat {

    private String characterName;
    private int attackRoll = 20;
    private int xp = 0; // NYI
    private int baseHp = 10; // NYI
    private static final String[] chosenPath = {"North", "South", "West", "East"};


    public Character(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getDirection(char userInput) {
        // TODO how should we return in a better way ?
        switch (java.lang.Character.toLowerCase(userInput)) {
            case 'n': {
                return "went " + chosenPath[0];
            }
            case 's': {
                return "went " + chosenPath[1];
            }
            case 'w': {
                return "went " + chosenPath[2];
            }
            case 'e': {
                return "went " + chosenPath[3];
            }
            default:
                return "ran at random as a scared as little bitch... ";
        }
    }
}
