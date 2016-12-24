import java.lang.*;
// TODO go over trello before proceeding

public class Main {
    public static void main(String[] args) {

        Monster kagog = new Monster(1, 10, 1,
                "Myau!", "Agog");
        Monster magog = new Monster(1, 10, 1,
                "Myau!", "Magog");
        Monster zagog = new Monster(1, 10, 1,
                "Myau!", "Zagog");
        Monster dagog = new Monster(1, 10, 1,
                "Myau!", "Dagog");

        Character player = new Character("Max");

        int i = 0;
        do {
            i += 1;
            System.out.printf("You turned %s %nand encountered %s %n", player.getDirection('L'),
                    kagog.toString());
            System.out.printf("You turned %s %nand encountered %s %n", player.getDirection('r'),
                    magog.toString());
            System.out.printf("You turned %s %nand encountered %s %n", player.getDirection('r'),
                    zagog.toString());
            System.out.printf("You turned %s %nand encountered %s %n", player.getDirection('r'),
                    dagog.toString());
        } while (i < 1);
    }
}
