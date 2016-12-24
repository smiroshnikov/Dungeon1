import java.lang.*;
// TODO go over trello before proceeding

/**
 * Main execution loop
 */
public class Main {
    public static void main(String[] args) {
        Monster agog = new Monster(1, 10, 1, "Myau!", "Agog", "Goblin");
        Character player = new Character("Max");

        int i = 0;
        do {
            i += 1;
            agog.getMonsterHP(); // how to generate this automatically ? Max
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('L'), agog.toString());
            agog.getMonsterHP(); // how to generate this automatically ? Max
            agog.getMonsterHP(); // how to generate this automatically ? Max
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), agog.toString());

        } while (i < 5);
    }
}
