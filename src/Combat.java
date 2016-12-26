import java.util.Random;

/**
 * Combat should include dodge and attack methods
 * this Class heavily relies on Random . Start reading documentation
 */

public class Combat {
    private Random r = new Random();
    public int dodgeLimit = 6;
    public int attackLimit = 6;


    public int dodge() {
        return r.nextInt(dodgeLimit - 1) + 1;
    }

    public int attack() {
        return r.nextInt(attackLimit);
    }


}
