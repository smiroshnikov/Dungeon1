import java.util.Scanner;

/**
 * Max ventured forth , slowly proceeding to the dark dungeon , his hands were trembling ,
 * "Perhaps this joint was one too many ...." thought adventurer
 */
public class Narrator {
    private Scanner scanner = new Scanner(System.in); // Instantiate once

    public String getUserInput() {
        return scanner.nextLine();
    }

    public char normalizeUserInput(String userInput) {
        return userInput.toLowerCase().toCharArray()[0];
    }

    public void showClassGreeting() {
        System.out.println("The time has come to pick your hero ,choose your class !\n" +
                "Press corresponding letter to see details \n" +
                "[M]age , [W]arrior, [R]ogue");
    }

    public void playerClassDescription(char choice) {
        switch (choice) {
            case 'w': {
                System.out.println("Воин, это вам не какой-то щуплый дрыщь ! \n" +
                        "Топорищем по еблищу вот твой девиз ! ");
                break;
            }
            case 'm': {
                System.out.println("Маг,колдун и лиходей, накастует пиздюлей !");
                break;
            }
            case 'r': {
                System.out.println("Маньяк и клептоман , к тому же еще и любит покурить траву.\n " +
                        "Начинает игру с веревкой.");
                break;
            }
        }
    }
}
