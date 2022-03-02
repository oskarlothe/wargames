package oskarlothe;

public class CavalryUnit extends Unit {
    private int attackBonus;
    private int resistBonus;
    private boolean hasAttacked;

    public CavalryUnit(String name, int health) {
        super(name, health, 20, 12);
        this.attackBonus = 2;
        this.resistBonus = 1;
        this.hasAttacked = false;
    }

    public void attack(Unit opponent) {
        super.attack(opponent);
        this.hasAttacked = true;
    }

    public int getAttackBonus() {
        if (hasAttacked) {
            return attackBonus;
        } else {
            return attackBonus + 4;
        }
    }

    public int getResistBonus() {
        return resistBonus;
    }
}
