/**
 * Main execution loop
 */
public class Main {
    public static void main(String[] args) {
        Monster agog = new Monster(1, 10, 1, "Myau!");
        int i = 0;

        do {
            i += 1;
            System.out.printf("Agog's hp is %d %n", agog.getMonsterHP());
        } while (i < 10);


    }
}
