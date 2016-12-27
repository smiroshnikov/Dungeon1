import java.util.Random;

public class Weapon {
    private Random r = new Random();
    private String chosenWeapon = null;

    // those  dice rolls that limit maximum damage per weapon group
    static final int NATURALLIMIT = 20;
    static final int ARMEDLIMIT = 6;
    static final int EXOTICLIMIT = 4;
    static final int PLAYERWEAPONLIMIT = 8;


    private enum WeaponList {
        NATURAL(new String[]{"claws", "teeth", "fire breath", "tail swipe", "acid spit"}),
        ARMED(new String[]{"axe", "longsword", "spear"}),
        EXOTIC(new String[]{"whip", "estoc", "katana", "net"}),
        PLAYER_WEAPONS(new String[]{"crossbow", "longsword", "2H mace"});
        private final String[] weaponName;

        private WeaponList(String[] weaponList) {
            this.weaponName = weaponList;
        }
    }

    public String pickWeapon(Monster monster) {
        switch (monster.generateMonster()) {
            case DEMON: {
                int ix = r.nextInt(WeaponList.NATURAL.weaponName.length);
                return WeaponList.NATURAL.weaponName[ix];
            }
            case GOBLIN: {
                int ix = r.nextInt(WeaponList.ARMED.weaponName.length);
                return WeaponList.ARMED.weaponName[ix];
            }
            default: {
                int ix = r.nextInt(WeaponList.PLAYER_WEAPONS.weaponName.length);
                return WeaponList.PLAYER_WEAPONS.weaponName[ix];
            }

        }
    }


}
