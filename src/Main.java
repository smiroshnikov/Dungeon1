import java.lang.*;
// TODO go over trello before proceeding


/**
 * Main execution loop
 */
public class Main {
    public static void main(String[] args) {

        Monster kagog = new Monster(1, 10, 1, "Myau!", "Agog", Monster.MonsterType.GOBLIN);
        Monster magog = new Monster(1, 10, 1, "Myau!", "Magog", Monster.MonsterType.KOBOLD);
        Monster zagog = new Monster(1, 10, 1, "Myau!", "Zagog", Monster.MonsterType.DRAGON);
        Monster dagog = new Monster(1, 10, 1, "Myau!", "Dagog", Monster.MonsterType.GOBLIN);

        Character player = new Character("Max");

        int i = 0;
        do {
            i += 1;
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('L'), kagog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), magog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), zagog.toString());
            System.out.printf("You turned %s %n and encountered %s %n", player.getDirection('r'), dagog.toString());

        } while (i < 1);
    }
}
