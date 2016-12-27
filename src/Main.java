import java.lang.*;
// TODO go over trello before proceeding

public class Main {
    public static void main(String[] args) {
        Narrator narrator = new Narrator();

        // TODO randomize this
        // TODO how to I instantiate a 1000 Monsters at once ? Max?
        // TODO array of Objects ?

        Monster kagog = new Monster(1, 20, 1, "Myau!", "Agog");
        Monster magog = new Monster(1, 34, 1, "Myau!", "Magog");
        Monster zagog = new Monster(1, 12, 1, "Myau!", "Zagog");
        Monster bagog = new Monster(10, 70, 1, "Myau!", "Bagog");
        Monster nagog = new Monster(1, 17, 1, "Myau!", "Nagog");
        Monster lagog = new Monster(1, 2, 1, "Myau!", "Lagog");
        Monster jagog = new Monster(3, 34, 1, "Myau!", "Jagog");
        Monster hagog = new Monster(1, 3, 1, "Myau!", "Hagog");
        Monster gagog = new Monster(15, 17, 1, "Myau!", "Gagog");

        Character player = new Character("Max");

        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('n'), kagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('r'), magog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('e'), zagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('r'), bagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('w'), nagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('r'), lagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('n'), jagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('N'), hagog.toString());
        System.out.printf("%s %s %nand encountered %s %n", player.getCharacterName(),
                player.getDirection('s'), gagog.toString());

//        narrator.showClassGreeting();
//        String n = narrator.getUserInput();
//        char c = narrator.normalizeUserInput(n);
//        narrator.playerClassDescription(c);
        // this is way too fucking twisted, need help here !
        //narrator.playerClassDescription(narrator.normalizeUserInput(narrator.getUserInput()));


    }
}
