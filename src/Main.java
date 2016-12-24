import java.lang.*;
// TODO go over trello before proceeding

public class Main {
    public static void main(String[] args) {

        // TODO randomize this
        Monster kagog = new Monster(1, 20, 1,
                "Myau!", "Agog");
        Monster magog = new Monster(1, 34, 1,
                "Myau!", "Magog");
        Monster zagog = new Monster(1, 12, 1,
                "Myau!", "Zagog");
        Monster dagog = new Monster(1, 7, 1,
                "Myau!", "Dagog");
        Character player = new Character("Max");

        System.out.printf("%s turned %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('L'), kagog.toString());
        System.out.printf("%s turned %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('r'), magog.toString());
        System.out.printf("%s turned %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('l'), zagog.toString());
        System.out.printf("%s turned %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('r'), dagog.toString());
    }
}
