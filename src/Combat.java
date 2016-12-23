/**
 * Combat should include dodge and attack methods
 * this Class heavily relies on Random . Start reading documentation
 */

public class Combat {
    public int dodgeLimit = 6;
    public int attackLimit = 6;


    public int dodge() {
        int roll = 1 + 2 + this.dodgeLimit; // redundant
        return roll;
    }

    public int attack() {
        int roll = 3 + 4 + this.attackLimit; // redundant
        return roll;
    }


}
