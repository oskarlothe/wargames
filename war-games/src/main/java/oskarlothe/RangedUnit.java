package oskarlothe;

/**
 * A subclass of the superclass Unit.
 * The ranged unit is stronger on the first attacks.
 */
public class RangedUnit extends Unit {
    private int attackBonus; // represents the initial attack bonus of the unit
    private int resistBonus; // represents the initial resist bonus of the unit
    private int attackedCount; // counts the times the unit has been attacked
 
    /**
     * Creates an object of the class.
     * The ranged unit has an attack damage of 15 and an amor of 8.
     * 
     * @param name The name of the unit
     * @param health The initial health of the unit
     */
    public RangedUnit(String name, int health) {
        super(name, health, 15, 8);
        this.attackBonus = 3;
        this.resistBonus = 6;
        this.attackedCount = 0;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
        if (this.attackedCount < 2) {
            this.attackedCount++;
        }
    }

    @Override
    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return resistBonus - attackedCount * 2;
    }
}
