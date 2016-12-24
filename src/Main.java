import java.lang.*;
// TODO go over trello before proceeding


/**
 * Main execution loop
 */
public class Main {
    public static void main(String[] args) {

        Monster agog = new Monster(1, 10, 1, "Myau!", "Agog", "Goblin");
        Monster magog = new Monster(1, 10, 1, "Myau!", "Magog", "Goblin");
        Monster zagog = new Monster(1, 10, 1, "Myau!", "Zagog", "Goblin");
        Monster dagog = new Monster(1, 10, 1, "Myau!", "Dagog", "Goblin");

        Character player = new Character("Max");

        int i = 0;
        do {
            i += 1;
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('L'), agog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), magog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), zagog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), dagog.toString());

        } while (i < 1);
    }
}
